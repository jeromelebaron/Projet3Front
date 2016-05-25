package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import fr.s2re.entity.Alerte;
import fr.s2re.entity.Civilite;
import fr.s2re.entity.MessageForum;
import fr.s2re.entity.Utilisateur;

@Entity(name = "administrateur")
@DiscriminatorValue(value = "ADMINISTRATEUR")
public class Administrateur extends Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;

    public Administrateur() {
        super();
    }

    public Administrateur(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone,
            Date paramDateInscription, Civilite paramCivilite) {
        super(paramId, paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramCivilite);
    }

    public Administrateur(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone,
            Date paramDateInscription, List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite) {
        super(paramId, paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes,
                paramCivilite);
    }

    public Administrateur(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword,
            String paramTelephone, Date paramDateInscription, Civilite paramCivilite) {
        super(paramId, paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramCivilite);
    }

    public Administrateur(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword,
            String paramTelephone, Date paramDateInscription, List<MessageForum> paramForumMessages, List<Alerte> paramAlertes,
            Civilite paramCivilite) {
        super(paramId, paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramForumMessages,
                paramAlertes, paramCivilite);
    }

    public Administrateur(String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            Civilite paramCivilite) {
        super(paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramCivilite);
    }

    public Administrateur(String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite) {
        super(paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes, paramCivilite);
    }

    public Administrateur(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, Civilite paramCivilite) {
        super(paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramCivilite);
    }

    public Administrateur(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite) {
        super(paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes,
                paramCivilite);
    }
}