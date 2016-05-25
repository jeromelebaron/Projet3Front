package fr.s2re.business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import fr.s2re.assembleur.AssembleurDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.entity.Client;
import fr.s2re.entity.Commande;
import fr.s2re.entity.LigneDeCommande;
import fr.s2re.entity.Produit;
import fr.s2re.ibusiness.IBusinessCommande;
import fr.s2re.idao.IDaoAdresse;
import fr.s2re.idao.IDaoCommande;
import fr.s2re.idao.IDaoEtatCommande;
import fr.s2re.idao.IDaoLigneDeCommande;
import fr.s2re.idao.IDaoMethodeLivraison;
import fr.s2re.idao.IDaoProduit;
import fr.s2re.idao.IDaoTypeCB;

@Remote(IBusinessCommande.class)
@Stateless
public class BusinessCommande implements IBusinessCommande {
    private static Logger log = Logger.getLogger(BusinessCommande.class);

    @EJB
    IDaoCommande daoCommande;

    @EJB
    IDaoProduit daoProduit;

    @EJB
    IDaoEtatCommande daoEtatCommande;

    @EJB
    IDaoAdresse daoAdresse;

    @EJB
    IDaoMethodeLivraison daoMethodeLivraison;

    @EJB
    IDaoTypeCB daoTypeCB;

    @EJB
    IDaoLigneDeCommande daoLigneDeCommande;

    @Override
    public CommandeDto addCommande(ClientDto paramClientDto, List<LigneDeCommandeDto> paramList, CommandeDto paramCommandeDto) {
        // traitement pour creer commande et sous commande en fct de notre liste de ligne de commande, fiesta on
        List<LigneDeCommande> ldcs = AssembleurDto.listLigneCmdFromListLigneCmdDto(paramList);
        Map<Integer, List<LigneDeCommande>> mapLigneCmd = new HashMap<>();
        List<LigneDeCommande> ldcParVendeur = new ArrayList<>();
        Double total = 0d;
        for (LigneDeCommande ldc : ldcs) {
            total += ldc.getQuantite() * ldc.getProduit().getPrix();
            ldcParVendeur = new ArrayList<>();
            Integer idVendeur;
            if (ldc.getProduit().getVendeur() != null) {
                idVendeur = ldc.getProduit().getVendeur().getId();
            } else {
                idVendeur = 0;
            }
            // log.info("produit : "+ldc.getProduit().getId()+ " qté : "+ldc.getQuantite()+" vendeur (0=site): "+idVendeur);
            if (mapLigneCmd.containsKey(idVendeur)) {
                ldcParVendeur = mapLigneCmd.get(idVendeur);
                ldcParVendeur.add(ldc);
                mapLigneCmd.put(idVendeur, ldcParVendeur);
            } else {
                ldcParVendeur.add(ldc);
                mapLigneCmd.put(idVendeur, ldcParVendeur);
            }
        }
        // ajout prix livraison
        total += paramCommandeDto.getMethodeLivraison().getPrix();
        if (!mapLigneCmd.isEmpty()) {
            if (mapLigneCmd.size() == 1) {
                // cas un vendeur, donc une commande unique sans sous commande
                Integer idVendeur = null;
                // on n'y rentre qu'une fois mais je sais pas comment faire autrement
                for (Integer key : mapLigneCmd.keySet()) {
                    idVendeur = key;
                }
                log.info("key id vendeur = " + idVendeur);
                Commande cmd = new Commande(genererNumeroCommande(paramClientDto), total, new Date(), null, /* A changer lienSuivi */
                        mapLigneCmd.get(idVendeur),
                        AssembleurDto.methodeLivraisonFromMethodeLivraisonDto(
                                paramCommandeDto.getMethodeLivraison()), /* A changer methode_livraison */
                        AssembleurDto.clientFromClientDto(paramClientDto),
                        AssembleurDto.adresseFromAdresseDto(paramCommandeDto.getAdresseFacturation()), /* A changer adresse factu */
                        AssembleurDto.adresseFromAdresseDto(paramCommandeDto.getAdresseLivraison()), /* A changer adresse livrai */
                        AssembleurDto.typeCBFromTypeCBDto(paramCommandeDto.getTypeCB()), /* A changer type_carte */
                        daoEtatCommande.getById(2), /* A changer Etat */
                        null, null);
                for (LigneDeCommande ldc : cmd.getLignesDeCommande()) {
                    log.info("ldc dans objet cmd : " + ldc.getProduit().getId() + " qté" + ldc.getQuantite());
                }
                cmd = daoCommande.addCommande(cmd);
                // n'ajoute pas les ldc (interet d'avoir ses listes dans les entités ???
                log.info("id cmd insérée = " + cmd.getId());
                for (LigneDeCommande ldc : cmd.getLignesDeCommande()) {
                    ldc.setCommande(cmd);
                    // ne permet pas de setter l'id recuperer... pas bien grave voir si pose soucis ensuite
                    ldc = daoLigneDeCommande.addLigneDeCmd(ldc);
                    // mise à jour de la quantité en stock
                    Produit pdtUpdate = daoProduit.getById(ldc.getProduit().getId());
                    if (pdtUpdate.getQuantite() >= ldc.getQuantite()) {
                        pdtUpdate.setQuantite(pdtUpdate.getQuantite() - ldc.getQuantite());
                        daoProduit.update(pdtUpdate);
                    } else {
                        log.info("ERREUR dans la verif des stock en amont !! qté demandée sup à celle en stock");
                    }

                }
                for (LigneDeCommande ldc : cmd.getLignesDeCommande()) {
                    log.info("id ldc ajouté = " + ldc.getId());
                }
                return AssembleurDto.cmdDtoFromCmd(cmd);
            } else {
                log.info("Cas plrs vendeur -> 1 commande puis 1 sous commande par différent vendeur");
                // taille de la map strictement supérieur à 1
                Commande cmdParente = new Commande(genererNumeroCommande(paramClientDto), total, new Date(), null, /* A changer lienSuivi */
                        AssembleurDto.methodeLivraisonFromMethodeLivraisonDto(
                                paramCommandeDto.getMethodeLivraison()), /* A changer methode_livraison */
                        AssembleurDto.clientFromClientDto(paramClientDto),
                        AssembleurDto.adresseFromAdresseDto(paramCommandeDto.getAdresseFacturation()), /* A changer adresse factu */
                        AssembleurDto.adresseFromAdresseDto(paramCommandeDto.getAdresseLivraison()), /* A changer adresse livrai */
                        AssembleurDto.typeCBFromTypeCBDto(paramCommandeDto.getTypeCB()), /* A changer type_carte */
                        daoEtatCommande.getById(2), /* A changer Etat */
                        null, null);
                cmdParente = daoCommande.addCommande(cmdParente);
                // Integer idVendeur=null;
                int i = 0;
                for (Integer key : mapLigneCmd.keySet()) {
                    Double sousTotal = 0d;
                    // faudrait modif pour pas passer 50 fois dans la liste de ldc
                    for (LigneDeCommande ldc : mapLigneCmd.get(key)) {
                        sousTotal += ldc.getProduit().getPrix() * ldc.getQuantite();
                    }
                    Commande sousCmd = new Commande();
                    i++;
                    // voir pas remplir les champs inutile des sous commandes qu'on peut recup via la commande parente
                    sousCmd.setNumero(genererNumeroSousCommande(AssembleurDto.cmdDtoFromCmd(cmdParente), i));
                    sousCmd.setTotal(sousTotal);
                    sousCmd.setDate(cmdParente.getDate());
                    sousCmd.setLienSuivi(cmdParente.getLienSuivi());
                    sousCmd.setLignesDeCommande(mapLigneCmd.get(key));
                    sousCmd.setMethodeLivraison(cmdParente.getMethodeLivraison());
                    sousCmd.setClient(cmdParente.getClient());
                    sousCmd.setAdresseFacturation(cmdParente.getAdresseFacturation());
                    sousCmd.setAdresseLivraison(cmdParente.getAdresseLivraison());
                    sousCmd.setTypeCB(cmdParente.getTypeCB());
                    sousCmd.setEtat(cmdParente.getEtat());
                    sousCmd.setCodeReduction(cmdParente.getCodeReduction());
                    sousCmd.setRib(cmdParente.getRib());
                    sousCmd.setCommandeParente(cmdParente);
                    // insérer !!
                    for (LigneDeCommande ldc : sousCmd.getLignesDeCommande()) {
                        log.info("ldc dans objet ssCmd : " + ldc.getProduit().getId() + " qté" + ldc.getQuantite());
                    }
                    log.info("insertion d'une sous commande");
                    sousCmd = daoCommande.addCommande(sousCmd);
                    for (LigneDeCommande ldc : sousCmd.getLignesDeCommande()) {
                        ldc.setCommande(sousCmd);
                        log.info("insertion d'une ligne de commande de sousCommande : " + sousCmd.getId());
                        ldc = daoLigneDeCommande.addLigneDeCmd(ldc);
                        // mise à jour de la quantité en stock
                        Produit pdtUpdate = daoProduit.getById(ldc.getProduit().getId());
                        if (pdtUpdate.getQuantite() >= ldc.getQuantite()) {
                            pdtUpdate.setQuantite(pdtUpdate.getQuantite() - ldc.getQuantite());
                            daoProduit.update(pdtUpdate);
                        } else {
                            log.info("ERREUR dans la verif des stock en amont !! qté demandée sup à celle en stock");
                        }
                    }
                    for (LigneDeCommande ldc : sousCmd.getLignesDeCommande()) {
                        log.info("id ldc ajouté = " + ldc.getId());
                    }
                }
                return AssembleurDto.cmdDtoFromCmd(cmdParente);
            }
        } else {
            return null;
        }
    }

    @Override
    public List<CommandeDto> getByClient(ClientDto paramClient) {
        Client c = AssembleurDto.clientFromClientDto(paramClient);
        List<Commande> list = daoCommande.getByClient(c);
        return AssembleurDto.listCmdDtoFromListCmd(list);
    }

    @Override
    public CommandeDto getByNumero(String paramNumero) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<LigneDeCommandeDto> getLigneDeCommande(CommandeDto paramCommande) {
        List<LigneDeCommandeDto> list = new ArrayList<>();
        for (LigneDeCommandeDto l : AssembleurDto
                .listLigneCmdDtoFromListLigneCmd(daoCommande.getLigneDeCommande(AssembleurDto.cmdFromCmdDto(paramCommande)))) {
            list.add(l);
        }
        return list;
    }

    @Override
    public List<CommandeDto> getSousCommandes(CommandeDto paramCommande) {
        Commande cmd = AssembleurDto.cmdFromCmdDto(paramCommande);
        List<Commande> list = daoCommande.getSousCommande(cmd);
        // traitement, on range la commande prise en parametre à la liste récuperer
        list.add(0, cmd);
        // cmd = list.get(0);
        // cmd = daoCommande.getSousCommande(cmd);
        // log.info("apres");
        return AssembleurDto.listCmdDtoFromListCmd(list);
        /*
         * for(Commande c : cmd.getSousCommandes()){ log.info(c.getId()); }
         */
    }

    @Override
    public CommandeDto getById(Integer paramId) {
        return AssembleurDto.cmdDtoFromCmd(daoCommande.getById(paramId));
    }

    @Override
    public String genererNumeroCommande(ClientDto paramClientDto) {
        String cmd = "CMD#";
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        cmd += "" + sdf.format(new Date());
        cmd += "#" + paramClientDto.getId();
        cmd += "#" + (daoCommande.getByClient(AssembleurDto.clientFromClientDto(paramClientDto)).size() + 1);
        return cmd;
    }

    @Override
    public String genererNumeroSousCommande(CommandeDto paramCommande, int i) {
        String s = paramCommande.getNumero();
        Pattern p = Pattern.compile("#");
        String[] sl = p.split(s);
        String cmd = "SSCMD#";
        cmd += "" + sl[3];
        cmd += "#" + i;
        return cmd;
    }

    @Override
    public List<CommandeDto> getCommandeDesVendeur(ClientDto paramClientDto) {
        return AssembleurDto.listCmdDtoFromListCmd(daoCommande.getCommandeDesVendeur(AssembleurDto.clientFromClientDto(paramClientDto)));

    }

    @Override
    public CommandeDto modifierCommande(CommandeDto cmd) {
        return AssembleurDto.cmdDtoFromCmd(daoCommande.modifierCommande(AssembleurDto.cmdFromCmdDto(cmd)));

    }

}