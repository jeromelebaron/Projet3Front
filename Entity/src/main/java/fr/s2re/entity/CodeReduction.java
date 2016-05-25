package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "code_reduction")
public class CodeReduction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "code", length = 10, nullable = false)
    private String code;

    @Column(name = "montant", length = 5, precision = 2)
    private Double montant;

    @Column(name = "date_debut")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;

    @Column(name = "date_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;

    @Column(name = "quantite", length = 5)
    private Integer quantite;

    @ManyToOne
    @JoinColumn(name = "id_type", nullable = false)
    private TypeReduction type;

    /*
     * @OneToMany(mappedBy="") pk on se ramasse ca ?? private List<Produit> produits;
     */
    @OneToMany(mappedBy = "codeReduction")
    private List<ProduitCodeReduction> produitsCodesReduction;

    public CodeReduction() {
        super();
    }

    public CodeReduction(Integer paramId, String paramCode, Double paramMontant, Date paramDateDebut, Date paramDateFin,
            Integer paramQuantite, TypeReduction paramType) {
        super();
        id = paramId;
        code = paramCode;
        montant = paramMontant;
        dateDebut = paramDateDebut;
        dateFin = paramDateFin;
        quantite = paramQuantite;
        type = paramType;
    }

    public CodeReduction(Integer paramId, String paramCode, Double paramMontant, Date paramDateDebut, Date paramDateFin,
            Integer paramQuantite, TypeReduction paramType,
            /* List<Produit> paramProduits, */
            List<ProduitCodeReduction> paramProduitsCodesReduction) {
        super();
        id = paramId;
        code = paramCode;
        montant = paramMontant;
        dateDebut = paramDateDebut;
        dateFin = paramDateFin;
        quantite = paramQuantite;
        type = paramType;
        // produits = paramProduits;
        produitsCodesReduction = paramProduitsCodesReduction;
    }

    public CodeReduction(String paramCode, Double paramMontant, Date paramDateDebut, Date paramDateFin, Integer paramQuantite,
            TypeReduction paramType) {
        super();
        code = paramCode;
        montant = paramMontant;
        dateDebut = paramDateDebut;
        dateFin = paramDateFin;
        quantite = paramQuantite;
        type = paramType;
    }

    public CodeReduction(String paramCode, Double paramMontant, Date paramDateDebut, Date paramDateFin, Integer paramQuantite,
            TypeReduction paramType,
            /* List<Produit> paramProduits, */
            List<ProduitCodeReduction> paramProduitsCodesReduction) {
        super();
        code = paramCode;
        montant = paramMontant;
        dateDebut = paramDateDebut;
        dateFin = paramDateFin;
        quantite = paramQuantite;
        type = paramType;
        // produits = paramProduits;
        produitsCodesReduction = paramProduitsCodesReduction;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String paramCode) {
        code = paramCode;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double paramMontant) {
        montant = paramMontant;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date paramDateDebut) {
        dateDebut = paramDateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date paramDateFin) {
        dateFin = paramDateFin;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer paramQuantite) {
        quantite = paramQuantite;
    }

    public TypeReduction getType() {
        return type;
    }

    public void setType(TypeReduction paramType) {
        type = paramType;
    }

    /*
     * public List<Produit> getProduits() { return produits; } public void setProduits(List<Produit> paramProduits) { produits =
     * paramProduits; }
     */
    public List<ProduitCodeReduction> getProduitsCodesReduction() {
        return produitsCodesReduction;
    }

    public void setProduitsCodesReduction(List<ProduitCodeReduction> paramProduitsCodesReduction) {
        produitsCodesReduction = paramProduitsCodesReduction;
    }
}