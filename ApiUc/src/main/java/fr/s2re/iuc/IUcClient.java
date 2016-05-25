package fr.s2re.iuc;

import java.util.List;

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

public interface IUcClient {
    // gerer les dons
    DonDto faireUnDon(ClientDto paramClientDto, ProduitDto paramProduitDto);

    List<DonDto> consulterListDons(ClientDto paraClientDto);

    // gerer liste des souhaits
    EnvieDto ajouterUnSouhait(EnvieDto paramEnvieDto);

    EnvieDto supprimerUnSouhait(EnvieDto paramEnvieDto);

    List<EnvieDto> consulterSaListeDeSouhaits(ClientDto paramClientDto);

    // gerer les commandes
    List<CommandeDto> consulterHistorique(ClientDto paramClientDto);

    List<CommandeDto> afficherSsCommandes(CommandeDto paramCommandeDto);

    List<LigneDeCommandeDto> afficherLignesDeCommande(CommandeDto paramCommandeDto);

    CommandeDto passerCommande(ClientDto paramClientDto, List<LigneDeCommandeDto> paramList, CommandeDto paramCommandeDto);

    List<LigneDeCommandeDto> effectuerRetour(List<LigneDeCommandeDto> paramList);

    CommandeDto rechercherParId(Integer paramIdCommande);

    List<MethodeLivraisonDto> retournerMethodeDeLivraison();

    List<TypeCBDto> retournerTypeCb();

    // gerer adresses
    List<AdresseDto> retournerMesAdresses(ClientDto paramClientDto);

    AdresseDto ajouterAdresse(AdresseDto paramAdresseDto);

    AdresseDto supprimerAdresseDuCarnet(AdresseDto paramAdresseDto);

    List<VilleDto> getVillesByCp(String paramCp);

    VilleDto getVillesByCpNom(String paramCp, String paramNom);

    // Evaluation
    NoteDto noter(NoteDto paramNote);

}
