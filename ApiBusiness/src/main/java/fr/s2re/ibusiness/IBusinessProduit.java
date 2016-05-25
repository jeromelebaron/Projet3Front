package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.AlerteProduitDto;
import fr.s2re.dto.CategorieDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.CouleurDto;
import fr.s2re.dto.ImageDto;
import fr.s2re.dto.MarqueDto;
import fr.s2re.dto.NoteProduitDto;
import fr.s2re.dto.ProduitDto;

public interface IBusinessProduit {
    List<ProduitDto> getAll();

    ProduitDto addProduit(ProduitDto paramProduit);

    ProduitDto update(ProduitDto paramProduit);

    void delete(ProduitDto paramProduitDto);

    ProduitDto getProduitDto(ProduitDto paramProduitDto);

    ProduitDto getPdtById(int paramId);

    List<ProduitDto> getByClient(ClientDto paramClient);

    List<ProduitDto> getByCategorie(CategorieDto paramCategorie);

    List<ProduitDto> getByAlerte(AlerteProduitDto paramAlerte);

    List<ProduitDto> getByMarque(MarqueDto paramMarque);

    List<ProduitDto> getByLibelle(String paramLibelle);

    List<ProduitDto> getByCouleur(CouleurDto paramCouleurDto);

    List<AlerteProduitDto> getAlerte(ProduitDto paramProduit);

    List<NoteProduitDto> getNote(ProduitDto paramProduit);

    List<ImageDto> getImage(ProduitDto paramProduit);

    List<ProduitDto> getProduitEnVente(ClientDto paramClientDto);

    List<CommandeDto> getHistoriqueVente(ClientDto paramClientDto);

    List<CommandeDto> getVentesEnPreparation(ClientDto paramClientDto);
}