package fr.s2re.uc;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import fr.s2re.dto.AdresseDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.DonDto;
import fr.s2re.dto.EnvieDto;
import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.dto.MethodeLivraisonDto;
import fr.s2re.dto.NoteDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.dto.TypeCBDto;
import fr.s2re.dto.VilleDto;
import fr.s2re.ibusiness.IBusinessAdresse;
import fr.s2re.ibusiness.IBusinessCommande;
import fr.s2re.ibusiness.IBusinessLigneDeCommande;
import fr.s2re.ibusiness.IBusinessMethodeLivraison;
import fr.s2re.ibusiness.IBusinessNote;
import fr.s2re.ibusiness.IBusinessProduit;
import fr.s2re.ibusiness.IBusinessTypeCB;
import fr.s2re.ibusiness.IBusinessVille;
import fr.s2re.iuc.IUcClient;

@Remote(IUcClient.class)
@Stateless
public class UcClient implements IUcClient {
    private static Logger log = Logger.getLogger(UcClient.class);

    @EJB
    private IBusinessLigneDeCommande bLigneDeCommande;

    @EJB
    private IBusinessCommande bCommande;

    @EJB
    private IBusinessNote bNote;

    @EJB
    private IBusinessProduit bProduit;

    @EJB
    private IBusinessMethodeLivraison bMethodeLivraison;

    @EJB
    private IBusinessAdresse bAdresse;

    @EJB
    private IBusinessVille bVille;

    @EJB
    private IBusinessTypeCB bTypeCB;

    @Override
    public DonDto faireUnDon(ClientDto paramClientDto, ProduitDto paramProduitDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<DonDto> consulterListDons(ClientDto paramParaClientDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public EnvieDto ajouterUnSouhait(EnvieDto paramEnvieDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public EnvieDto supprimerUnSouhait(EnvieDto paramEnvieDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<EnvieDto> consulterSaListeDeSouhaits(ClientDto paramClientDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<CommandeDto> consulterHistorique(ClientDto paramClientDto) {
        List<CommandeDto> list = new ArrayList<>();
        for (CommandeDto c : bCommande.getByClient(paramClientDto)) {
            // c.setSousCommandes(bCommande.getSousCommandes(c));
            list.add(c);
        }
        return list;
    }

    @Override
    public List<CommandeDto> afficherSsCommandes(CommandeDto paramCommandeDto) {
        List<CommandeDto> list = new ArrayList<>();
        for (CommandeDto c : bCommande.getSousCommandes(paramCommandeDto)) {
            c.setLignesDeCommande(bCommande.getLigneDeCommande(c));
            if (c.getLignesDeCommande() != null) {
                for (LigneDeCommandeDto l : c.getLignesDeCommande()) {
                    l.setProduit(bProduit.getProduitDto(l.getProduit()));
                }
            }
            list.add(c);
        }
        return list;
    }

    @Override
    public List<LigneDeCommandeDto> afficherLignesDeCommande(CommandeDto paramCommandeDto) {
        List<LigneDeCommandeDto> list = new ArrayList<>();
        for (LigneDeCommandeDto l : bLigneDeCommande.getByCommande(paramCommandeDto)) {
            ProduitDto p = new ProduitDto();
            p = bProduit.getProduitDto(l.getProduit());
            p.setNotes(bProduit.getNote(p));
            p.setImages(bProduit.getImage(p));
            l.setProduit(p);
            list.add(l);
        }
        return list;
    }

    @Override
    public CommandeDto passerCommande(ClientDto paramClientDto, List<LigneDeCommandeDto> paramList, CommandeDto paramCommandeDto) {
        return bCommande.addCommande(paramClientDto, paramList, paramCommandeDto);
    }

    @Override
    public List<LigneDeCommandeDto> effectuerRetour(List<LigneDeCommandeDto> paramList) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public NoteDto noter(NoteDto paramNote) {
        return bNote.addNote(paramNote);
    }

    @Override
    public CommandeDto rechercherParId(Integer paramIdCommande) {
        return bCommande.getById(paramIdCommande);
    }

    @Override
    public List<MethodeLivraisonDto> retournerMethodeDeLivraison() {
        return bMethodeLivraison.getAll();
    }

    @Override
    public List<AdresseDto> retournerMesAdresses(ClientDto paramClientDto) {
        return bAdresse.getByUser(paramClientDto);
    }

    @Override
    public List<TypeCBDto> retournerTypeCb() {
        return bTypeCB.getAll();
    }

    @Override
    public AdresseDto ajouterAdresse(AdresseDto paramAdresseDto) {
        return bAdresse.addAdresse(paramAdresseDto);
    }

    @Override
    public AdresseDto supprimerAdresseDuCarnet(AdresseDto paramAdresseDto) {
        return bAdresse.updateAdresse(paramAdresseDto);
    }

    @Override
    public List<VilleDto> getVillesByCp(String paramCp) {
        return bVille.getByCp(paramCp);
    }

    @Override
    public VilleDto getVillesByCpNom(String paramCp, String paramNom) {
        return bVille.getByCpNom(paramCp, paramNom);
    }
}