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

@Entity
@Table(name = "rib")
public class Rib implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "code_banque", length = 5, nullable = true)
    private String codeBanque;

    @Column(name = "code_guichet", length = 5, nullable = true)
    private String codeGuichet;

    @Column(name = "numero_compte", length = 11, nullable = true)
    private String numeroCompte;

    @Column(name = "cle", length = 2, nullable = true)
    private String cle;

    @Column(name = "domiciliation", length = 50, nullable = true)
    private String domiciliation;

    @Column(name = "iban", length = 27, nullable = true)
    private String iban;

    @Column(name = "bic", length = 11, nullable = true)
    private String bic;

    @Column(name = "titulaire", length = 50, nullable = true)
    private String titulaire;

    @Column(name = "libelle", length = 50, nullable = true)
    private String libelle;

    @Column(name = "publie", nullable = false)
    private Boolean publie;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = true)
    private Client client;

    public Rib() {
        super();
    }

    public Rib(Integer paramId, String paramCodeBanque, String paramCodeGuichet, String paramNumeroCompte, String paramCle,
            String paramDomiciliation, String paramIban, String paramBic, String paramTitulaire, String paramLibelle, Boolean paramPublie,
            Client paramClient) {
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

    public Rib(String paramCodeBanque, String paramCodeGuichet, String paramNumeroCompte, String paramCle, String paramDomiciliation,
            String paramIban, String paramBic, String paramTitulaire, String paramLibelle, Boolean paramPublie, Client paramClient) {
        super();
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client paramClient) {
        client = paramClient;
    }
}