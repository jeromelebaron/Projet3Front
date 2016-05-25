package fr.s2re.dto;

import java.io.Serializable;

public class EnvieDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer quantite;
    private ProduitDto produit;
    private ClientDto client;

    public EnvieDto() {
        super();
    }

    public EnvieDto(Integer paramId, Integer paramQuantite, ProduitDto paramProduit, ClientDto paramClient) {
        super();
        id = paramId;
        quantite = paramQuantite;
        produit = paramProduit;
        client = paramClient;
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

    public ProduitDto getProduit() {
        return produit;
    }

    public void setProduit(ProduitDto paramProduit) {
        produit = paramProduit;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto paramClient) {
        client = paramClient;
    }
}