package fr.s2re.idao;

import java.math.BigDecimal;
import java.util.List;

import fr.s2re.entity.Adresse;
import fr.s2re.entity.Utilisateur;

public interface IDaoAdresse {
    Adresse addAdresse(Adresse paramAdresse);

    Adresse updateAdresse(Adresse paramAdresse);

    Adresse getById(Integer paramId);

    List<Adresse> getAll();

    List<Adresse> getByUser(Utilisateur paramUtilisateur);

    Adresse getByCoordonnees(BigDecimal paramLongitude, BigDecimal paramLatitude);
}