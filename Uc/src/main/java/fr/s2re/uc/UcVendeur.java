package fr.s2re.uc;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.NoteDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.ibusiness.IBusinessCommande;
import fr.s2re.ibusiness.IBusinessProduit;
import fr.s2re.ibusiness.IBusinessUtilisateur;
import fr.s2re.iuc.IUcVendeur;

@Remote(IUcVendeur.class)
@Stateless
public class UcVendeur implements IUcVendeur {
    @EJB
    private IBusinessUtilisateur bUtilisateur;

    @EJB
    private IBusinessProduit bProduit;

    @EJB
    private IBusinessCommande bCommande;

    @Override
    public List<CommandeDto> voirHistoriqueVentes(ClientDto paramClientDto) {
        return bProduit.getHistoriqueVente(paramClientDto);
    }

    @Override
    public List<CommandeDto> voirVentesEnPreparation(ClientDto paramClientDto) {
        return bCommande.getCommandeDesVendeur(paramClientDto);
    }

    @Override
    public List<ProduitDto> voirVentesEnCours(ClientDto paramClientDto) {
        List<ProduitDto> list = new ArrayList<>();
        List<ProduitDto> liste = bProduit.getProduitEnVente(paramClientDto);
        for (ProduitDto p : liste) {
            p.setNotes(bProduit.getNote(p));
            p.setImages(bProduit.getImage(p));
            list.add(p);
        }
        return list;
    }

    @Override
    public ProduitDto vendre(ProduitDto paramProduitDto) {
        return bProduit.addProduit(paramProduitDto);
    }

    @Override
    public List<ProduitDto> afficherSaListeDeProduits(ClientDto paramClientDto) {
        return bProduit.getByClient(paramClientDto);
    }

    @Override
    public ProduitDto modifier(ProduitDto paramProduitDto) {
        return bProduit.update(paramProduitDto);
    }

    @Override
    public void supprimer(ProduitDto paramProduitDto) {
        bProduit.delete(paramProduitDto);
    }

    @Override
    public List<ProduitDto> getProduits(ProduitDto paramProduitDto) {
        List<ProduitDto> list = new ArrayList<>();
        for (ProduitDto p : bProduit.getAll()) {
            p.setImages(bProduit.getImage(p));
            list.add(p);
        }
        return list;
    }

    @Override
    public ClientDto getVendeurByIdProduit(Integer paramIdProduit) {
        return bUtilisateur.getVendeurByIdPdt(paramIdProduit);
    }

    @Override
    public List<NoteDto> getNotesByNoteur(ClientDto paramClientDto, ClientDto paramVendeurDto) {
        List<NoteDto> list = new ArrayList<>();
        for (NoteDto n : bUtilisateur.getNotesByNoteur(paramClientDto, paramVendeurDto)) {
            list.add(n);
        }
        return list;
    }

    @Override
    public CommandeDto modifierCommande(CommandeDto commande) {
        return bCommande.modifierCommande(commande);
    }

}
