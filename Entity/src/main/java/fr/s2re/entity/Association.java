package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value = "ASSOCIATION")
public class Association extends Utilisateur implements Serializable {

    /**
     * Pour la sérialisation.
     */
    private static final long serialVersionUID = -4009525850157097272L;

    @Column(name = "document", length = 50, nullable = true)
    private String document;

    @Column(name = "actif", nullable = false)
    private Boolean actif;

    @OneToOne
    @JoinColumn(name = "id_adresse", nullable = false)
    private Adresse adresseLivraison;

    @OneToMany(mappedBy = "association")
    private List<Don> dons;

    public Association() {
        super();
    }

    public Association(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone,
            Date paramDateInscription, Civilite paramCivilite, String paramDocument, Boolean paramActif, Adresse paramAdresseLivraison) {
        super(paramId, paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
    }

    public Association(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone,
            Date paramDateInscription, List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite,
            String paramDocument, Boolean paramActif, Adresse paramAdresseLivraison, List<Don> paramDons) {
        super(paramId, paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes,
                paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
        dons = paramDons;
    }

    public Association(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, Civilite paramCivilite, String paramDocument, Boolean paramActif, Adresse paramAdresseLivraison) {
        super(paramId, paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
    }

    public Association(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite,
            String paramDocument, Boolean paramActif, Adresse paramAdresseLivraison, List<Don> paramDons) {
        super(paramId, paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramForumMessages,
                paramAlertes, paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
        dons = paramDons;
    }

    public Association(String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            Civilite paramCivilite, String paramDocument, Boolean paramActif, Adresse paramAdresseLivraison) {
        super(paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
    }

    public Association(String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite, String paramDocument,
            Boolean paramActif, Adresse paramAdresseLivraison, List<Don> paramDons) {
        super(paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes, paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
        dons = paramDons;
    }

    public Association(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, Civilite paramCivilite, String paramDocument, Boolean paramActif, Adresse paramAdresseLivraison) {
        super(paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
    }

    public Association(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite,
            String paramDocument, Boolean paramActif, Adresse paramAdresseLivraison, List<Don> paramDons) {
        super(paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes,
                paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
        dons = paramDons;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String paramDocument) {
        document = paramDocument;
    }

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean paramActif) {
        actif = paramActif;
    }

    public Adresse getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(Adresse paramAdresseLivraison) {
        adresseLivraison = paramAdresseLivraison;
    }

    public List<Don> getDons() {
        return dons;
    }

    public void setDons(List<Don> paramDons) {
        dons = paramDons;
    }
}