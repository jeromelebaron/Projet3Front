package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CodeReductionDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String code;
    private Double montant;
    private Date dateDebut;
    private Date dateFin;
    private Integer quantite;
    private TypeReductionDto type;
    private List<ProduitCodeReductionDto> produitsCodesReduction;

    public CodeReductionDto() {
        super();
    }

    public CodeReductionDto(Integer paramId, String paramCode, Double paramMontant, Date paramDateDebut, Date paramDateFin,
            Integer paramQuantite, TypeReductionDto paramType) {
        super();
        id = paramId;
        code = paramCode;
        montant = paramMontant;
        dateDebut = paramDateDebut;
        dateFin = paramDateFin;
        quantite = paramQuantite;
        type = paramType;
    }

    public CodeReductionDto(Integer paramId, String paramCode, Double paramMontant, Date paramDateDebut, Date paramDateFin,
            Integer paramQuantite, TypeReductionDto paramType, List<ProduitCodeReductionDto> paramProduitsCodesReduction) {
        super();
        id = paramId;
        code = paramCode;
        montant = paramMontant;
        dateDebut = paramDateDebut;
        dateFin = paramDateFin;
        quantite = paramQuantite;
        type = paramType;
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

    public TypeReductionDto getType() {
        return type;
    }

    public void setType(TypeReductionDto paramType) {
        type = paramType;
    }

    public List<ProduitCodeReductionDto> getProduitsCodesReduction() {
        return produitsCodesReduction;
    }

    public void setProduitsCodesReduction(List<ProduitCodeReductionDto> paramProduitsCodesReduction) {
        produitsCodesReduction = paramProduitsCodesReduction;
    }
}