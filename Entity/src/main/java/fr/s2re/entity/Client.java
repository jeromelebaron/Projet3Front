package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value = "CLIENT")
public class Client extends Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "actif", nullable = false)
    private Boolean actif;

    @OneToMany(mappedBy = "client")
    private List<CartePaiement> paiementCartes;

    @OneToMany(mappedBy = "client")
    private List<Adresse> facturationAdresses;

    @OneToMany(mappedBy = "client")
    private List<Adresse> livraisonAdresses;

    @OneToMany(mappedBy = "vendeur")
    private List<NoteClient> notes;

    @OneToMany(mappedBy = "vendeur")
    private List<Produit> produits;

    @OneToMany(mappedBy = "client")
    private List<Envie> envies;

    @OneToMany(mappedBy = "demandeur")
    private List<Messagerie> messageries;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;

    @OneToMany(mappedBy = "client")
    private List<Rib> ribs;

    public Client() {
        super();
    }

    public Client(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            Civilite paramCivilite, Boolean paramActif) {
        super(paramId, paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramCivilite);
        actif = paramActif;
    }

    public Client(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite, Boolean paramActif,
            List<CartePaiement> paramPaiementCartes, List<Adresse> paramFacturationAdresses, List<Adresse> paramLivraisonAdresses,
            List<NoteClient> paramNotes, List<Produit> paramProduits, List<Envie> paramEnvies, List<Messagerie> paramMessageries,
            List<Commande> paramCommandes, List<Rib> paramRibs) {
        super(paramId, paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes,
                paramCivilite);
        actif = paramActif;
        paiementCartes = paramPaiementCartes;
        facturationAdresses = paramFacturationAdresses;
        livraisonAdresses = paramLivraisonAdresses;
        notes = paramNotes;
        produits = paramProduits;
        envies = paramEnvies;
        messageries = paramMessageries;
        commandes = paramCommandes;
        ribs = paramRibs;
    }

    public Client(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, Civilite paramCivilite, Boolean paramActif) {
        super(paramId, paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramCivilite);
        actif = paramActif;
    }

    public Client(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite,
            Boolean paramActif, List<CartePaiement> paramPaiementCartes, List<Adresse> paramFacturationAdresses,
            List<Adresse> paramLivraisonAdresses, List<NoteClient> paramNotes, List<Produit> paramProduits, List<Envie> paramEnvies,
            List<Messagerie> paramMessageries, List<Commande> paramCommandes, List<Rib> paramRibs) {
        super(paramId, paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramForumMessages,
                paramAlertes, paramCivilite);
        actif = paramActif;
        paiementCartes = paramPaiementCartes;
        facturationAdresses = paramFacturationAdresses;
        livraisonAdresses = paramLivraisonAdresses;
        notes = paramNotes;
        produits = paramProduits;
        envies = paramEnvies;
        messageries = paramMessageries;
        commandes = paramCommandes;
        ribs = paramRibs;
    }

    public Client(String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            Civilite paramCivilite, Boolean paramActif) {
        super(paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramCivilite);
        actif = paramActif;
    }

    public Client(String paramNom, String paramPrenom, String paramMail, String paramTelephone, Date paramDateInscription,
            List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite, Boolean paramActif,
            List<CartePaiement> paramPaiementCartes, List<Adresse> paramFacturationAdresses, List<Adresse> paramLivraisonAdresses,
            List<NoteClient> paramNotes, List<Produit> paramProduits, List<Envie> paramEnvies, List<Messagerie> paramMessageries,
            List<Commande> paramCommandes, List<Rib> paramRibs) {
        super(paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes, paramCivilite);
        actif = paramActif;
        paiementCartes = paramPaiementCartes;
        facturationAdresses = paramFacturationAdresses;
        livraisonAdresses = paramLivraisonAdresses;
        notes = paramNotes;
        produits = paramProduits;
        envies = paramEnvies;
        messageries = paramMessageries;
        commandes = paramCommandes;
        ribs = paramRibs;
    }

    public Client(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, Civilite paramCivilite, Boolean paramActif) {
        super(paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramCivilite);
        actif = paramActif;
    }

    public Client(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
            Date paramDateInscription, List<MessageForum> paramForumMessages, List<Alerte> paramAlertes, Civilite paramCivilite,
            Boolean paramActif, List<CartePaiement> paramPaiementCartes, List<Adresse> paramFacturationAdresses,
            List<Adresse> paramLivraisonAdresses, List<NoteClient> paramNotes, List<Produit> paramProduits, List<Envie> paramEnvies,
            List<Messagerie> paramMessageries, List<Commande> paramCommandes, List<Rib> paramRibs) {
        super(paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes,
                paramCivilite);
        actif = paramActif;
        paiementCartes = paramPaiementCartes;
        facturationAdresses = paramFacturationAdresses;
        livraisonAdresses = paramLivraisonAdresses;
        notes = paramNotes;
        produits = paramProduits;
        envies = paramEnvies;
        messageries = paramMessageries;
        commandes = paramCommandes;
        ribs = paramRibs;
    }

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean paramActif) {
        actif = paramActif;
    }

    public List<CartePaiement> getPaiementCartes() {
        return paiementCartes;
    }

    public void setPaiementCartes(List<CartePaiement> paramPaiementCartes) {
        paiementCartes = paramPaiementCartes;
    }

    public List<Adresse> getFacturationAdresses() {
        return facturationAdresses;
    }

    public void setFacturationAdresses(List<Adresse> paramFacturationAdresses) {
        facturationAdresses = paramFacturationAdresses;
    }

    public List<Adresse> getLivraisonAdresses() {
        return livraisonAdresses;
    }

    public void setLivraisonAdresses(List<Adresse> paramLivraisonAdresses) {
        livraisonAdresses = paramLivraisonAdresses;
    }

    public List<NoteClient> getNotes() {
        return notes;
    }

    public void setNotes(List<NoteClient> paramNotes) {
        notes = paramNotes;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> paramProduits) {
        produits = paramProduits;
    }

    public List<Envie> getEnvies() {
        return envies;
    }

    public void setEnvies(List<Envie> paramEnvies) {
        envies = paramEnvies;
    }

    public List<Messagerie> getMessageries() {
        return messageries;
    }

    public void setMessageries(List<Messagerie> paramMessageries) {
        messageries = paramMessageries;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> paramCommandes) {
        commandes = paramCommandes;
    }

    public List<Rib> getRibs() {
        return ribs;
    }

    public void setRibs(List<Rib> paramRibs) {
        ribs = paramRibs;
    }
}