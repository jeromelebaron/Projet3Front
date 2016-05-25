package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Association;
import fr.s2re.entity.Don;
import fr.s2re.entity.Utilisateur;

public interface IDaoDon {
    Don addDon(Don paramDon);

    List<Don> getAll();

    List<Don> getByAsso(Association paramAssociation);

    List<Don> getByClient(Utilisateur paramUtilisateur);
}