package fr.s2re.dto;

import java.io.Serializable;

public class ImageDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String url;
    private ProduitDto produit;

    public ImageDto() {
        super();
    }

    public ImageDto(Integer id, String url, ProduitDto produit) {
        super();
        this.id = id;
        this.url = url;
        this.produit = produit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ProduitDto getProduit() {
        return produit;
    }

    public void setProduit(ProduitDto produit) {
        this.produit = produit;
    }
}
