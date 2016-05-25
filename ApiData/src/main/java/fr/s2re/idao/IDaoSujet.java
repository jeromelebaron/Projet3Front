/*
 * Créé le 19 mai 2016 par Jérome LE BARON
 */
package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Rubrique;
import fr.s2re.entity.Sujet;
import fr.s2re.entity.TypeSujet;

public interface IDaoSujet {
    Sujet addSujet(Sujet paramSujet);

    Sujet updateSujet(Sujet paramSujet);

    Sujet closeSujet(Sujet paramSujet);

    Sujet getById(Integer paramId);

    List<Sujet> getAll();

    List<Sujet> getByType(TypeSujet paramTypeSujet);

    List<Sujet> getByRubrique(Rubrique paramRubrique);

    List<Sujet> getByPublication(Boolean paramBoolean);
}
