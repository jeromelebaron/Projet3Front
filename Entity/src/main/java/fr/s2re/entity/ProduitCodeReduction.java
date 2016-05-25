package fr.s2re.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "produit_code_reduction", uniqueConstraints = @UniqueConstraint(columnNames = { "id_code_reduction", "id_produit" }) )
public class ProduitCodeReduction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_code_reduction", nullable = false)
    private CodeReduction codeReduction;

    @ManyToOne
    @JoinColumn(name = "id_produit", nullable = false)
    private Produit produit;

    public ProduitCodeReduction() {
        super();
    }

    public ProduitCodeReduction(Integer paramId, CodeReduction paramCodeReduction, Produit paramProduit) {
        super();
        id = paramId;
        codeReduction = paramCodeReduction;
        produit = paramProduit;
    }

    public ProduitCodeReduction(CodeReduction paramCodeReduction, Produit paramProduit) {
        super();
        codeReduction = paramCodeReduction;
        produit = paramProduit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public CodeReduction getCodeReduction() {
        return codeReduction;
    }

    public void setCodeReduction(CodeReduction paramCodeReduction) {
        codeReduction = paramCodeReduction;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit paramProduit) {
        produit = paramProduit;
    }
}