package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value = "PRODUIT")
public class NoteProduit extends Note implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "id_produit", nullable = false)
    private Produit produit;

    public NoteProduit() {
        super();
    }

    public NoteProduit(Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur,
            List<AlerteCommentaire> paramAlertes) {
        super(paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur, paramAlertes);
    }

    public NoteProduit(Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur) {
        super(paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur);
    }

    public NoteProduit(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur,
            List<AlerteCommentaire> paramAlertes) {
        super(paramId, paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur, paramAlertes);
    }

    public NoteProduit(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie,
            Client paramNoteur) {
        super(paramId, paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur);
    }

    public NoteProduit(Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur,
            List<AlerteCommentaire> paramAlertes, Produit paramProduit) {
        super(paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur, paramAlertes);
        produit = paramProduit;
    }

    public NoteProduit(Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur,
            Produit paramProduit) {
        super(paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur);
        produit = paramProduit;
    }

    public NoteProduit(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur,
            List<AlerteCommentaire> paramAlertes, Produit paramProduit) {
        super(paramId, paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur, paramAlertes);
        produit = paramProduit;
    }

    public NoteProduit(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur,
            Produit paramProduit) {
        super(paramId, paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur);
        produit = paramProduit;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit paramProduit) {
        produit = paramProduit;
    }
}