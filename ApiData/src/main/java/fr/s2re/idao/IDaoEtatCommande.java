package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.EtatCommande;

public interface IDaoEtatCommande {
    List<EtatCommande> getAll();

    EtatCommande getById(Integer paramId);

    List<EtatCommande> getByLibelle(String paramLibelle);
}