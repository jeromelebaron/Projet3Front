package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "MODERATEUR")
public class Moderateur extends Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;

    public Moderateur() {
        super();
    }

    public Moderateur(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone,
            Date paramDateInscription, Civilite paramCivilite) {
        super(paramId, paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramCivilite);
    }

    public Moderateur(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone,
            Date paramDateInscription, List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite) {
        super(paramId, paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes,
                paramCivilite);
    }

    public Moderateur(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, Civilite paramCivilite) {
        super(paramId, paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramCivilite);
    }

    public Moderateur(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite) {
        super(paramId, paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramForumMessages,
                paramAlertes, paramCivilite);
    }

    public Moderateur(String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            Civilite paramCivilite) {
        super(paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramCivilite);
    }

    public Moderateur(String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite) {
        super(paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes, paramCivilite);
    }

    public Moderateur(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, Civilite paramCivilite) {
        super(paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramCivilite);
    }

    public Moderateur(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite) {
        super(paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes,
                paramCivilite);
    }
}