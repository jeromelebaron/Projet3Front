package fr.s2re.business;

import java.util.Iterator;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import fr.s2re.assembleur.AssembleurDto;
import fr.s2re.dto.AlerteProduitDto;
import fr.s2re.dto.CategorieDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.CouleurDto;
import fr.s2re.dto.ImageDto;
import fr.s2re.dto.MarqueDto;
import fr.s2re.dto.NoteProduitDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.entity.Client;
import fr.s2re.entity.Produit;
import fr.s2re.ibusiness.IBusinessProduit;
import fr.s2re.idao.IDaoProduit;

@Remote(IBusinessProduit.class)
@Stateless
public class BusinessProduit implements IBusinessProduit {
    private static Logger log = Logger.getLogger(BusinessProduit.class);
    @EJB
    private IDaoProduit daoProduit;

    @Override
    public List<ProduitDto> getAll() {
        List<ProduitDto> list = AssembleurDto.listPdtDtoFromListPdt(daoProduit.getAll());
        Iterator<ProduitDto> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer quantite = iterator.next().getQuantite();
            if (quantite <= 0) {
                iterator.remove();
            }
        }
        return list;
    }

    @Override
    public ProduitDto addProduit(ProduitDto paramProduit) {
        return AssembleurDto.produitDtoFromProduit(daoProduit.addProduit(AssembleurDto.produitFromProduitDto(paramProduit)));
    }

    @Override
    public ProduitDto update(ProduitDto paramProduit) {
        return AssembleurDto.produitDtoFromProduit(daoProduit.update(AssembleurDto.produitFromProduitDto(paramProduit)));
    }

    @Override
    public List<ProduitDto> getByClient(ClientDto paramClient) {
        Client c = AssembleurDto.clientFromClientDto(paramClient);
        List<Produit> liste = daoProduit.getByClient(c);
        return AssembleurDto.listPdtDtoFromListPdt(liste);
    }

    @Override
    public List<ProduitDto> getByCategorie(CategorieDto paramCategorie) {
        return AssembleurDto
                .listPdtDtoFromListPdt(daoProduit.getByCategorie(AssembleurDto.categorieFromCategorieDto(paramCategorie)));
    }

    @Override
    public List<ProduitDto> getByAlerte(AlerteProduitDto paramAlerte) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<ProduitDto> getByMarque(MarqueDto paramMarque) {
        return AssembleurDto.listPdtDtoFromListPdt(daoProduit.getByMarque(AssembleurDto.marqueFromMarqueDto(paramMarque)));
    }

    @Override
    public List<ProduitDto> getByLibelle(String paramLibelle) {
        return AssembleurDto.listPdtDtoFromListPdt(daoProduit.getByLibelle(paramLibelle));
    }

    @Override
    public List<AlerteProduitDto> getAlerte(ProduitDto paramProduit) {
        return AssembleurDto.listAlertePdtDtoFromListAlertePdt(daoProduit.getAlerte(AssembleurDto.produitFromProduitDto(paramProduit)));
    }

    @Override
    public List<NoteProduitDto> getNote(ProduitDto paramProduit) {
        return AssembleurDto.listNotePdtDtoFromListNotePdt(daoProduit.getNote(AssembleurDto.produitFromProduitDto(paramProduit)));
    }

    @Override
    public ProduitDto getProduitDto(ProduitDto paramProduitDto) {
        Produit p = AssembleurDto.produitFromProduitDto(paramProduitDto);
        return AssembleurDto.produitDtoFromProduit(daoProduit.getProduit(p));

    }

    @Override
    public List<ProduitDto> getByCouleur(CouleurDto paramCouleurDto) {
        return AssembleurDto.listPdtDtoFromListPdt(daoProduit.getByCouleur(AssembleurDto.couleurFromCouleurDto(paramCouleurDto)));
    }

    @Override
    public List<ImageDto> getImage(ProduitDto paramProduit) {
        if (paramProduit.getProduitParent() != null) {
            // on recupere les images du pdt
            List<ImageDto> list = AssembleurDto
                    .listImageDtoFromListImage(daoProduit.getImage(AssembleurDto.produitFromProduitDto(paramProduit.getProduitParent())));
            // + celles du pdt en question si elles existent
            list.addAll(AssembleurDto.listImageDtoFromListImage(daoProduit.getImage(AssembleurDto.produitFromProduitDto(paramProduit))));
            // si pdt n'a pas d'image on lui passe notre image not found
            if (list.isEmpty()) {
                list.add(null);
                log.info("pas d'image notre position 0 dans la liste d'image = " + list.get(0));
            }
            return list;
            // return
            // AssembleurDto.listImageDtoFromListImage(daoProduit.getImage(AssembleurDto.produitFromProduitDto(paramProduit.getProduitParent())));
        } else {
            List<ImageDto> list = AssembleurDto
                    .listImageDtoFromListImage(daoProduit.getImage(AssembleurDto.produitFromProduitDto(paramProduit)));
            // si pdt n'a pas d'image on lui passe notre image not found
            if (list.isEmpty()) {
                list.add(null);
                log.info("pas d'image notre position 0 dans la liste d'image = " + list.get(0));
            }
            return list;
        }

    }

    @Override
    public void delete(ProduitDto paramProduitDto) {
        daoProduit.delete(AssembleurDto.produitFromProduitDto(paramProduitDto));
    }

    @Override
    public List<ProduitDto> getProduitEnVente(ClientDto paramClientDto) {
        return AssembleurDto.listPdtDtoFromListPdt(daoProduit.getProduitEnVente(AssembleurDto.clientFromClientDto(paramClientDto)));
    }

    @Override
    public List<CommandeDto> getHistoriqueVente(ClientDto paramClientDto) {
        return AssembleurDto.listCmdDtoFromListCmd(daoProduit.getHistoriqueVente(AssembleurDto.clientFromClientDto(paramClientDto)));
    }

    @Override
    public List<CommandeDto> getVentesEnPreparation(ClientDto paramClientDto) {
        return AssembleurDto.listCmdDtoFromListCmd(daoProduit.getVentesEnPreparation(AssembleurDto.clientFromClientDto(paramClientDto)));
    }

    @Override
    public ProduitDto getPdtById(int paramId) {
        return AssembleurDto.produitDtoFromProduit(daoProduit.getById(paramId));
    }
}