package fr.s2re.dto;

import java.io.Serializable;

public class ProduitCodeReductionDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private CodeReductionDto codeReduction;
    private ProduitDto produit;

    public ProduitCodeReductionDto() {
        super();
    }

    public ProduitCodeReductionDto(Integer paramId, CodeReductionDto paramCodeReduction, ProduitDto paramProduit) {
        super();
        id = paramId;
        codeReduction = paramCodeReduction;
        produit = paramProduit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public CodeReductionDto getCodeReduction() {
        return codeReduction;
    }

    public void setCodeReduction(CodeReductionDto paramCodeReduction) {
        codeReduction = paramCodeReduction;
    }

    public ProduitDto getProduit() {
        return produit;
    }

    public void setProduit(ProduitDto paramProduit) {
        produit = paramProduit;
    }
}