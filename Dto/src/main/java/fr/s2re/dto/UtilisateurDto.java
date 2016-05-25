package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UtilisateurDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nom;
    private String prenom;
    private String mail;
    private String password;
    private String telephone;
    private Date dateInscription;
    private List<MessageForumDto> forumMessages;
    private List<AlerteDto> alertes;
    private CiviliteDto civilite;

    public UtilisateurDto() {
        super();
    }

    public UtilisateurDto(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword,
            String paramTelephone, Date paramDateInscription, CiviliteDto paramCivilite) {
        super();
        id = paramId;
        nom = paramNom;
        prenom = paramPrenom;
        mail = paramMail;
        password = paramPassword;
        telephone = paramTelephone;
        dateInscription = paramDateInscription;
        civilite = paramCivilite;
    }

    public UtilisateurDto(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, CiviliteDto paramCivilite) {
        super();
        nom = paramNom;
        prenom = paramPrenom;
        mail = paramMail;
        password = paramPassword;
        telephone = paramTelephone;
        dateInscription = paramDateInscription;
        civilite = paramCivilite;
    }

    public UtilisateurDto(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone,
            Date paramDateInscription, CiviliteDto paramCivilite) {
        super();
        id = paramId;
        nom = paramNom;
        prenom = paramPrenom;
        mail = paramMail;
        telephone = paramTelephone;
        dateInscription = paramDateInscription;
        civilite = paramCivilite;
    }

    public UtilisateurDto(String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            CiviliteDto paramCivilite) {
        super();
        nom = paramNom;
        prenom = paramPrenom;
        mail = paramMail;
        telephone = paramTelephone;
        dateInscription = paramDateInscription;
        civilite = paramCivilite;
    }

    public UtilisateurDto(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone,
            Date paramDateInscription, List<MessageForumDto> paramForumMessages, List<AlerteDto> paramAlertes, CiviliteDto paramCivilite) {
        super();
        id = paramId;
        nom = paramNom;
        prenom = paramPrenom;
        mail = paramMail;
        telephone = paramTelephone;
        dateInscription = paramDateInscription;
        forumMessages = paramForumMessages;
        alertes = paramAlertes;
        civilite = paramCivilite;
    }

    public UtilisateurDto(String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            List<MessageForumDto> paramForumMessages, List<AlerteDto> paramAlertes, CiviliteDto paramCivilite) {
        super();
        nom = paramNom;
        prenom = paramPrenom;
        mail = paramMail;
        telephone = paramTelephone;
        dateInscription = paramDateInscription;
        forumMessages = paramForumMessages;
        alertes = paramAlertes;
        civilite = paramCivilite;
    }

    public UtilisateurDto(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword,
            String paramTelephone, Date paramDateInscription, List<MessageForumDto> paramForumMessages, List<AlerteDto> paramAlertes,
            CiviliteDto paramCivilite) {
        super();
        id = paramId;
        nom = paramNom;
        prenom = paramPrenom;
        mail = paramMail;
        password = paramPassword;
        telephone = paramTelephone;
        dateInscription = paramDateInscription;
        forumMessages = paramForumMessages;
        alertes = paramAlertes;
        civilite = paramCivilite;
    }

    public UtilisateurDto(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, List<MessageForumDto> paramForumMessages, List<AlerteDto> paramAlertes, CiviliteDto paramCivilite) {
        super();
        nom = paramNom;
        prenom = paramPrenom;
        mail = paramMail;
        password = paramPassword;
        telephone = paramTelephone;
        dateInscription = paramDateInscription;
        forumMessages = paramForumMessages;
        alertes = paramAlertes;
        civilite = paramCivilite;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String paramNom) {
        nom = paramNom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String paramPrenom) {
        prenom = paramPrenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String paramMail) {
        mail = paramMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String paramPassword) {
        password = paramPassword;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String paramTelephone) {
        telephone = paramTelephone;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date paramDateInscription) {
        dateInscription = paramDateInscription;
    }

    public List<MessageForumDto> getForumMessages() {
        return forumMessages;
    }

    public void setForumMessages(List<MessageForumDto> paramForumMessages) {
        forumMessages = paramForumMessages;
    }

    public List<AlerteDto> getAlertes() {
        return alertes;
    }

    public void setAlertes(List<AlerteDto> paramAlertes) {
        alertes = paramAlertes;
    }

    public CiviliteDto getCivilite() {
        return civilite;
    }

    public void setCivilite(CiviliteDto paramCivilite) {
        civilite = paramCivilite;
    }
}