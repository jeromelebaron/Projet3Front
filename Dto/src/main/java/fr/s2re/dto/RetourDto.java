package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;

public class RetourDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String numero;
    private Date date;
    private Integer quantite;
    private LigneDeCommandeDto ligneDeCommande;
    private RibDto rib;
    private TypeRetourDto type;

    public RetourDto() {
        super();
    }

    public RetourDto(Integer paramId, String paramNumero, Date paramDate, Integer paramQuantite, LigneDeCommandeDto paramLigneDeCommande,
            RibDto paramRib, TypeRetourDto paramType) {
        super();
        id = paramId;
        numero = paramNumero;
        date = paramDate;
        quantite = paramQuantite;
        ligneDeCommande = paramLigneDeCommande;
        rib = paramRib;
        type = paramType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String paramNumero) {
        numero = paramNumero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date paramDate) {
        date = paramDate;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer paramQuantite) {
        quantite = paramQuantite;
    }

    public LigneDeCommandeDto getLigneDeCommande() {
        return ligneDeCommande;
    }

    public void setLigneDeCommande(LigneDeCommandeDto paramLigneDeCommande) {
        ligneDeCommande = paramLigneDeCommande;
    }

    public RibDto getRib() {
        return rib;
    }

    public void setRib(RibDto paramRib) {
        rib = paramRib;
    }

    public TypeRetourDto getType() {
        return type;
    }

    public void setType(TypeRetourDto paramType) {
        type = paramType;
    }
}