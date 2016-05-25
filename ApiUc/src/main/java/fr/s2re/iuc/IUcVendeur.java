package fr.s2re.iuc;

import java.util.List;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.NoteDto;
import fr.s2re.dto.ProduitDto;

public interface IUcVendeur {
    // gerer les Ventes
    List<CommandeDto> voirHistoriqueVentes(ClientDto paramClientDto);

    List<ProduitDto> voirVentesEnCours(ClientDto paramClientDto);

    ProduitDto vendre(ProduitDto paramProduitDto);

    // gerer sa liste de produit en ventes
    List<ProduitDto> afficherSaListeDeProduits(ClientDto paramClientDto);

    ProduitDto modifier(ProduitDto paramProduitDto);

    void supprimer(ProduitDto paramProduitDto);

    ClientDto getVendeurByIdProduit(Integer paramIdProduit);

    List<ProduitDto> getProduits(ProduitDto paramProduitDto);

    // Note
    List<NoteDto> getNotesByNoteur(ClientDto paramClientDto, ClientDto paramVendeurDto);

    List<CommandeDto> voirVentesEnPreparation(ClientDto paramClientDto);

    CommandeDto modifierCommande(CommandeDto commande);

}
