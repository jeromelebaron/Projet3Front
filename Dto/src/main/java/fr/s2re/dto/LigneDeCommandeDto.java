package fr.s2re.dto;

import java.io.Serializable;

public class LigneDeCommandeDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer quantite;
    private CommandeDto commande;
    private ProduitDto produit;

    public LigneDeCommandeDto() {
        super();
    }

    public LigneDeCommandeDto(Integer paramId, Integer paramQuantite, CommandeDto paramCommande, ProduitDto paramProduit) {
        super();
        id = paramId;
        quantite = paramQuantite;
        commande = paramCommande;
        produit = paramProduit;
    }

    public LigneDeCommandeDto(Integer paramQuantite, ProduitDto paramProduit) {
        super();
        quantite = paramQuantite;
        produit = paramProduit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer paramQuantite) {
        quantite = paramQuantite;
    }

    public CommandeDto getCommande() {
        return commande;
    }

    public void setCommande(CommandeDto paramCommande) {
        commande = paramCommande;
    }

    public ProduitDto getProduit() {
        return produit;
    }

    public void setProduit(ProduitDto paramProduit) {
        produit = paramProduit;
    }
}