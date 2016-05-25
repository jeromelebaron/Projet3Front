package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value = "PRODUIT")
public class AlerteProduit extends Alerte implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "id_produit", nullable = false)
    private Produit produit;

    public AlerteProduit() {
        super();
    }

    public AlerteProduit(Integer paramId, Date paramDateCreation, Date paramDateCloture, Utilisateur paramEmetteur, ObjetAlerte paramObjet,
            Produit paramProduit) {
        super(paramId, paramDateCreation, paramDateCloture, paramEmetteur, paramObjet);
        produit = paramProduit;
    }

    public AlerteProduit(Date paramDateCreation, Date paramDateCloture, Utilisateur paramEmetteur, ObjetAlerte paramObjet,
            Produit paramProduit) {
        super(paramDateCreation, paramDateCloture, paramEmetteur, paramObjet);
        produit = paramProduit;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit paramProduit) {
        produit = paramProduit;
    }
}