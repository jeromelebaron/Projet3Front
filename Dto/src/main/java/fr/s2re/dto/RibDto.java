package fr.s2re.dto;

import java.io.Serializable;

public class RibDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String codeBanque;
    private String codeGuichet;
    private String numeroCompte;
    private String cle;
    private String domiciliation;
    private String iban;
    private String bic;
    private String titulaire;
    private String libelle;
    private Boolean publie;
    private ClientDto client;

    public RibDto() {
        super();
    }

    public RibDto(Integer paramId, String paramCodeBanque, String paramCodeGuichet, String paramNumeroCompte, String paramCle,
            String paramDomiciliation, String paramIban, String paramBic, String paramTitulaire, String paramLibelle, Boolean paramPublie,
            ClientDto paramClient) {
        super();
        id = paramId;
        codeBanque = paramCodeBanque;
        codeGuichet = paramCodeGuichet;
        numeroCompte = paramNumeroCompte;
        cle = paramCle;
        domiciliation = paramDomiciliation;
        iban = paramIban;
        bic = paramBic;
        titulaire = paramTitulaire;
        libelle = paramLibelle;
        publie = paramPublie;
        client = paramClient;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public String getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(String paramCodeBanque) {
        codeBanque = paramCodeBanque;
    }

    public String getCodeGuichet() {
        return codeGuichet;
    }

    public void setCodeGuichet(String paramCodeGuichet) {
        codeGuichet = paramCodeGuichet;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String paramNumeroCompte) {
        numeroCompte = paramNumeroCompte;
    }

    public String getCle() {
        return cle;
    }

    public void setCle(String paramCle) {
        cle = paramCle;
    }

    public String getDomiciliation() {
        return domiciliation;
    }

    public void setDomiciliation(String paramDomiciliation) {
        domiciliation = paramDomiciliation;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String paramIban) {
        iban = paramIban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String paramBic) {
        bic = paramBic;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String paramTitulaire) {
        titulaire = paramTitulaire;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String paramLibelle) {
        libelle = paramLibelle;
    }

    public Boolean getPublie() {
        return publie;
    }

    public void setPublie(Boolean paramPublie) {
        publie = paramPublie;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto paramClient) {
        client = paramClient;
    }
}