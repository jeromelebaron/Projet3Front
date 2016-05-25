package fr.s2re.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "messagerie")
public class Messagerie implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToMany(mappedBy = "messagerie")
    private List<MessageInbox> messages;

    @ManyToOne
    @JoinColumn(name = "id_demandeur", nullable = false)
    private Client demandeur;

    @ManyToOne
    @JoinColumn(name = "id_produit", nullable = false)
    private Produit produit;

    public Messagerie() {
        super();
    }

    public Messagerie(Integer paramId, Client paramDemandeur, Produit paramProduit) {
        super();
        id = paramId;
        demandeur = paramDemandeur;
        produit = paramProduit;
    }

    public Messagerie(Integer paramId, List<MessageInbox> paramMessages, Client paramDemandeur, Produit paramProduit) {
        super();
        id = paramId;
        messages = paramMessages;
        demandeur = paramDemandeur;
        produit = paramProduit;
    }

    public Messagerie(Client paramDemandeur, Produit paramProduit) {
        super();
        demandeur = paramDemandeur;
        produit = paramProduit;
    }

    public Messagerie(List<MessageInbox> paramMessages, Client paramDemandeur, Produit paramProduit) {
        super();
        messages = paramMessages;
        demandeur = paramDemandeur;
        produit = paramProduit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public List<MessageInbox> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageInbox> paramMessages) {
        messages = paramMessages;
    }

    public Client getDemandeur() {
        return demandeur;
    }

    public void setDemandeur(Client paramDemandeur) {
        demandeur = paramDemandeur;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit paramProduit) {
        produit = paramProduit;
    }
}