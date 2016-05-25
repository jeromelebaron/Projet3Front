package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Alerte;
import fr.s2re.entity.Utilisateur;

public interface IDaoAlerte {
    Alerte addAlerte(Alerte paramAlerte);

    Alerte updateAlerte(Alerte paramAlerte);

    List<Alerte> getAll();

    Alerte getById(Integer paramId);

    List<Alerte> getByObjet(Object paramObject);

    List<Alerte> getByEmetteur(Utilisateur paramUtilisateur);

    List<Alerte> getByObject(Object paramObj);
}