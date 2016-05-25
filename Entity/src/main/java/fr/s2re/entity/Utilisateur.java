package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type_utilisateur")
public class Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nom", length = 50, nullable = false)
    private String nom;

    @Column(name = "prenom", length = 50, nullable = true)
    private String prenom;

    @Column(name = "mail", length = 50, nullable = false)
    private String mail;

    @Column(name = "password", length = 255, nullable = false)
    private String password;

    @Column(name = "telephone", length = 12, nullable = true)
    private String telephone;

    @Column(name = "date_inscription", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateInscription;

    @OneToMany(mappedBy = "auteur") // ou id_utilisateur??
    private List<MessageForum> forumMessages;

    @OneToMany(mappedBy = "emetteur")
    private List<Alerte> alertes;

    @ManyToOne
    @JoinColumn(name = "id_civilite", nullable = true)
    private Civilite civilite;

    public Utilisateur() {
        super();
    }

    public Utilisateur(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, Civilite paramCivilite) {
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

    public Utilisateur(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, Civilite paramCivilite) {
        super();
        nom = paramNom;
        prenom = paramPrenom;
        mail = paramMail;
        password = paramPassword;
        telephone = paramTelephone;
        dateInscription = paramDateInscription;
        civilite = paramCivilite;
    }

    public Utilisateur(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone,
            Date paramDateInscription, Civilite paramCivilite) {
        super();
        id = paramId;
        nom = paramNom;
        prenom = paramPrenom;
        mail = paramMail;
        telephone = paramTelephone;
        dateInscription = paramDateInscription;
        civilite = paramCivilite;
    }

    public Utilisateur(String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            Civilite paramCivilite) {
        super();
        nom = paramNom;
        prenom = paramPrenom;
        mail = paramMail;
        telephone = paramTelephone;
        dateInscription = paramDateInscription;
        civilite = paramCivilite;
    }

    public Utilisateur(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone,
            Date paramDateInscription, List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite) {
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

    public Utilisateur(String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite) {
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

    public Utilisateur(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite) {
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

    public Utilisateur(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite) {
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

    public List<MessageForum> getForumMessages() {
        return forumMessages;
    }

    public void setForumMessages(List<MessageForum> paramForumMessages) {
        forumMessages = paramForumMessages;
    }

    public List<Alerte> getAlertes() {
        return alertes;
    }

    public void setAlertes(List<Alerte> paramAlertes) {
        alertes = paramAlertes;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite paramCivilite) {
        civilite = paramCivilite;
    }
}