package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AssociationDto extends UtilisateurDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String document;
    private Boolean actif;
    private AdresseDto adresseLivraison;
    private List<DonDto> dons;

    public AssociationDto() {
        super();
    }

    public AssociationDto(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone,
            Date paramDateInscription, CiviliteDto paramCivilite, String paramDocument, Boolean paramActif,
            AdresseDto paramAdresseLivraison) {
        super(paramId, paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
    }

    public AssociationDto(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone,
            Date paramDateInscription, List<MessageForumDto> paramForumMessages, List<AlerteDto> paramAlertes, CiviliteDto paramCivilite,
            String paramDocument, Boolean paramActif, AdresseDto paramAdresseLivraison, List<DonDto> paramDons) {
        super(paramId, paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes,
                paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
        dons = paramDons;
    }

    public AssociationDto(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword,
            String paramTelephone, Date paramDateInscription, CiviliteDto paramCivilite, String paramDocument, Boolean paramActif,
            AdresseDto paramAdresseLivraison) {
        super(paramId, paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
    }

    public AssociationDto(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword,
            String paramTelephone, Date paramDateInscription, List<MessageForumDto> paramForumMessages, List<AlerteDto> paramAlertes,
            CiviliteDto paramCivilite, String paramDocument, Boolean paramActif, AdresseDto paramAdresseLivraison, List<DonDto> paramDons) {
        super(paramId, paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramForumMessages,
                paramAlertes, paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
        dons = paramDons;
    }

    public AssociationDto(String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            CiviliteDto paramCivilite, String paramDocument, Boolean paramActif, AdresseDto paramAdresseLivraison) {
        super(paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
    }

    public AssociationDto(String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            List<MessageForumDto> paramForumMessages, List<AlerteDto> paramAlertes, CiviliteDto paramCivilite, String paramDocument,
            Boolean paramActif, AdresseDto paramAdresseLivraison, List<DonDto> paramDons) {
        super(paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes, paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
        dons = paramDons;
    }

    public AssociationDto(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, CiviliteDto paramCivilite, String paramDocument, Boolean paramActif,
            AdresseDto paramAdresseLivraison) {
        super(paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramCivilite);
        document = paramDocument;
        actif = paramActif;
        adresseLivraison = paramAdresseLivraison;
    }

    public AssociationDto(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, List<MessageForumDto> paramForumMessages, List<AlerteDto> paramAlertes, CiviliteDto paramCivilite,
            String paramDocument, Boolean paramActif, AdresseDto paramAdresseLivraison, List<DonDto> paramDons) {
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

    public AdresseDto getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(AdresseDto paramAdresseLivraison) {
        adresseLivraison = paramAdresseLivraison;
    }

    public List<DonDto> getDons() {
        return dons;
    }

    public void setDons(List<DonDto> paramDons) {
        dons = paramDons;
    }
}