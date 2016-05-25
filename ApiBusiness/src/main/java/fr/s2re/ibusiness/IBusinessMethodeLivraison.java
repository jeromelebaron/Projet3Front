package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.MethodeLivraisonDto;

public interface IBusinessMethodeLivraison {
    List<MethodeLivraisonDto> getAll();

    MethodeLivraisonDto getByLibelle(String paramLibelle);
}