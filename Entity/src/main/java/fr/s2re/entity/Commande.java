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
@Table(name = "commande")
public class Commande implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "numero", length = 25, nullable = false)
    private String numero;

    @Column(name = "total", columnDefinition = "Decimal(10,2)", nullable = true)
    private Double total;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "lien_suivi", length = 255, nullable = true)
    private String lienSuivi;

    @OneToMany(mappedBy = "commande")
    private List<LigneDeCommande> lignesDeCommande;

    @ManyToOne
    @JoinColumn(name = "id_methode_livraison", nullable = false)
    private MethodeLivraison methodeLivraison;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;

    @OneToMany(mappedBy = "commandeParente")
    private List<Commande> sousCommandes;

    @ManyToOne
    @JoinColumn(name = "id_commande_parente", nullable = true)
    private Commande commandeParente;

    @ManyToOne
    @JoinColumn(name = "id_adresse_facturation", nullable = false)
    private Adresse adresseFacturation;

    @ManyToOne
    @JoinColumn(name = "id_adresse_livraison", nullable = false)
    private Adresse adresseLivraison;

    @ManyToOne
    @JoinColumn(name = "id_type_cb", nullable = true)
    private TypeCB typeCB;

    @ManyToOne
    @JoinColumn(name = "id_etat", nullable = false)
    private EtatCommande etat;

    @ManyToOne
    @JoinColumn(name = "id_code_reduction", nullable = true)
    private CodeReduction codeReduction;

    @ManyToOne
    @JoinColumn(name = "id_rib", nullable = true)
    private Rib rib;

    public Commande() {
        super();
    }

    public Commande(Integer paramId, String paramNumero, Double paramTotal, Date paramDate, String paramLienSuivi,
            List<LigneDeCommande> paramLignesDeCommande, MethodeLivraison paramMethodeLivraison, Client paramClient,
            List<Commande> paramSousCommandes, Commande paramCommandeParente, Adresse paramAdresseFacturation,
            Adresse paramAdresseLivraison, TypeCB paramTypeCB, EtatCommande paramEtat, Rib paramRib) {
        super();
        id = paramId;
        numero = paramNumero;
        total = paramTotal;
        date = paramDate;
        lienSuivi = paramLienSuivi;
        lignesDeCommande = paramLignesDeCommande;
        methodeLivraison = paramMethodeLivraison;
        client = paramClient;
        sousCommandes = paramSousCommandes;
        commandeParente = paramCommandeParente;
        adresseFacturation = paramAdresseFacturation;
        adresseLivraison = paramAdresseLivraison;
        typeCB = paramTypeCB;
        etat = paramEtat;
        rib = paramRib;
    }

    public Commande(Integer paramId, String paramNumero, Double paramTotal, Date paramDate, String paramLienSuivi,
            List<LigneDeCommande> paramLignesDeCommande, MethodeLivraison paramMethodeLivraison, Client paramClient,
            Adresse paramAdresseFacturation, Adresse paramAdresseLivraison, TypeCB paramTypeCB, EtatCommande paramEtat,
            CodeReduction paramCodeReduction, Rib paramRib) {
        super();
        id = paramId;
        numero = paramNumero;
        total = paramTotal;
        date = paramDate;
        lienSuivi = paramLienSuivi;
        lignesDeCommande = paramLignesDeCommande;
        methodeLivraison = paramMethodeLivraison;
        client = paramClient;
        adresseFacturation = paramAdresseFacturation;
        adresseLivraison = paramAdresseLivraison;
        typeCB = paramTypeCB;
        etat = paramEtat;
        codeReduction = paramCodeReduction;
        rib = paramRib;
    }

    public Commande(Integer paramId, String paramNumero, Double paramTotal, Date paramDate, String paramLienSuivi,
            List<LigneDeCommande> paramLignesDeCommande, MethodeLivraison paramMethodeLivraison, Client paramClient,
            Commande paramCommandeParente, Adresse paramAdresseFacturation, Adresse paramAdresseLivraison, TypeCB paramTypeCB,
            EtatCommande paramEtat, CodeReduction paramCodeReduction, Rib paramRib) {
        super();
        id = paramId;
        numero = paramNumero;
        total = paramTotal;
        date = paramDate;
        lienSuivi = paramLienSuivi;
        lignesDeCommande = paramLignesDeCommande;
        methodeLivraison = paramMethodeLivraison;
        client = paramClient;
        commandeParente = paramCommandeParente;
        adresseFacturation = paramAdresseFacturation;
        adresseLivraison = paramAdresseLivraison;
        typeCB = paramTypeCB;
        etat = paramEtat;
        codeReduction = paramCodeReduction;
        rib = paramRib;
    }

    public Commande(Integer paramId, String paramNumero, Double paramTotal, Date paramDate, String paramLienSuivi,
            List<LigneDeCommande> paramLignesDeCommande, MethodeLivraison paramMethodeLivraison, Client paramClient,
            List<Commande> paramSousCommandes, Commande paramCommandeParente, Adresse paramAdresseFacturation,
            Adresse paramAdresseLivraison, TypeCB paramTypeCB, EtatCommande paramEtat, CodeReduction paramCodeReduction, Rib paramRib) {
        super();
        id = paramId;
        numero = paramNumero;
        total = paramTotal;
        date = paramDate;
        lienSuivi = paramLienSuivi;
        lignesDeCommande = paramLignesDeCommande;
        methodeLivraison = paramMethodeLivraison;
        client = paramClient;
        sousCommandes = paramSousCommandes;
        commandeParente = paramCommandeParente;
        adresseFacturation = paramAdresseFacturation;
        adresseLivraison = paramAdresseLivraison;
        typeCB = paramTypeCB;
        etat = paramEtat;
        codeReduction = paramCodeReduction;
        rib = paramRib;
    }

    public Commande(String paramNumero, Double paramTotal, Date paramDate, String paramLienSuivi,
            List<LigneDeCommande> paramLignesDeCommande, MethodeLivraison paramMethodeLivraison, Client paramClient,
            List<Commande> paramSousCommandes, Commande paramCommandeParente, Adresse paramAdresseFacturation,
            Adresse paramAdresseLivraison, TypeCB paramTypeCB, EtatCommande paramEtat, Rib paramRib) {
        super();
        numero = paramNumero;
        total = paramTotal;
        date = paramDate;
        lienSuivi = paramLienSuivi;
        lignesDeCommande = paramLignesDeCommande;
        methodeLivraison = paramMethodeLivraison;
        client = paramClient;
        sousCommandes = paramSousCommandes;
        commandeParente = paramCommandeParente;
        adresseFacturation = paramAdresseFacturation;
        adresseLivraison = paramAdresseLivraison;
        typeCB = paramTypeCB;
        etat = paramEtat;
        rib = paramRib;
    }

    public Commande(String paramNumero, Double paramTotal, Date paramDate, String paramLienSuivi,
            List<LigneDeCommande> paramLignesDeCommande, MethodeLivraison paramMethodeLivraison, Client paramClient,
            Adresse paramAdresseFacturation, Adresse paramAdresseLivraison, TypeCB paramTypeCB, EtatCommande paramEtat,
            CodeReduction paramCodeReduction, Rib paramRib) {
        super();
        numero = paramNumero;
        total = paramTotal;
        date = paramDate;
        lienSuivi = paramLienSuivi;
        lignesDeCommande = paramLignesDeCommande;
        methodeLivraison = paramMethodeLivraison;
        client = paramClient;
        adresseFacturation = paramAdresseFacturation;
        adresseLivraison = paramAdresseLivraison;
        typeCB = paramTypeCB;
        etat = paramEtat;
        codeReduction = paramCodeReduction;
        rib = paramRib;
    }

    public Commande(String paramNumero, Double paramTotal, Date paramDate, String paramLienSuivi, MethodeLivraison paramMethodeLivraison,
            Client paramClient, Adresse paramAdresseFacturation, Adresse paramAdresseLivraison, TypeCB paramTypeCB, EtatCommande paramEtat,
            CodeReduction paramCodeReduction, Rib paramRib) {
        super();
        numero = paramNumero;
        total = paramTotal;
        date = paramDate;
        lienSuivi = paramLienSuivi;
        methodeLivraison = paramMethodeLivraison;
        client = paramClient;
        adresseFacturation = paramAdresseFacturation;
        adresseLivraison = paramAdresseLivraison;
        typeCB = paramTypeCB;
        etat = paramEtat;
        codeReduction = paramCodeReduction;
        rib = paramRib;
    }

    public Commande(String paramNumero, Double paramTotal, Date paramDate, String paramLienSuivi,
            List<LigneDeCommande> paramLignesDeCommande, MethodeLivraison paramMethodeLivraison, Client paramClient,
            Commande paramCommandeParente, Adresse paramAdresseFacturation, Adresse paramAdresseLivraison, TypeCB paramTypeCB,
            EtatCommande paramEtat, CodeReduction paramCodeReduction, Rib paramRib) {
        super();
        numero = paramNumero;
        total = paramTotal;
        date = paramDate;
        lienSuivi = paramLienSuivi;
        lignesDeCommande = paramLignesDeCommande;
        methodeLivraison = paramMethodeLivraison;
        client = paramClient;
        commandeParente = paramCommandeParente;
        adresseFacturation = paramAdresseFacturation;
        adresseLivraison = paramAdresseLivraison;
        typeCB = paramTypeCB;
        etat = paramEtat;
        codeReduction = paramCodeReduction;
        rib = paramRib;
    }

    public Commande(String paramNumero, Double paramTotal, Date paramDate, String paramLienSuivi,
            List<LigneDeCommande> paramLignesDeCommande, MethodeLivraison paramMethodeLivraison, Client paramClient,
            List<Commande> paramSousCommandes, Commande paramCommandeParente, Adresse paramAdresseFacturation,
            Adresse paramAdresseLivraison, TypeCB paramTypeCB, EtatCommande paramEtat, CodeReduction paramCodeReduction, Rib paramRib) {
        super();
        numero = paramNumero;
        total = paramTotal;
        date = paramDate;
        lienSuivi = paramLienSuivi;
        lignesDeCommande = paramLignesDeCommande;
        methodeLivraison = paramMethodeLivraison;
        client = paramClient;
        sousCommandes = paramSousCommandes;
        commandeParente = paramCommandeParente;
        adresseFacturation = paramAdresseFacturation;
        adresseLivraison = paramAdresseLivraison;
        typeCB = paramTypeCB;
        etat = paramEtat;
        codeReduction = paramCodeReduction;
        rib = paramRib;
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

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double paramTotal) {
        total = paramTotal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date paramDate) {
        date = paramDate;
    }

    public List<LigneDeCommande> getLignesDeCommande() {
        return lignesDeCommande;
    }

    public void setLignesDeCommande(List<LigneDeCommande> paramLignesDeCommande) {
        lignesDeCommande = paramLignesDeCommande;
    }

    public MethodeLivraison getMethodeLivraison() {
        return methodeLivraison;
    }

    public void setMethodeLivraison(MethodeLivraison paramMethodeLivraison) {
        methodeLivraison = paramMethodeLivraison;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client paramClient) {
        client = paramClient;
    }

    public List<Commande> getSousCommandes() {
        return sousCommandes;
    }

    public void setSousCommandes(List<Commande> paramSousCommandes) {
        sousCommandes = paramSousCommandes;
    }

    public Commande getCommandeParente() {
        return commandeParente;
    }

    public void setCommandeParente(Commande paramCommandeParente) {
        commandeParente = paramCommandeParente;
    }

    public Adresse getAdresseFacturation() {
        return adresseFacturation;
    }

    public void setAdresseFacturation(Adresse paramAdresseFacturation) {
        adresseFacturation = paramAdresseFacturation;
    }

    public Adresse getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(Adresse paramAdresseLivraison) {
        adresseLivraison = paramAdresseLivraison;
    }

    public TypeCB getTypeCB() {
        return typeCB;
    }

    public void setTypeCB(TypeCB paramTypeCB) {
        typeCB = paramTypeCB;
    }

    public EtatCommande getEtat() {
        return etat;
    }

    public void setEtat(EtatCommande paramEtat) {
        etat = paramEtat;
    }

    public CodeReduction getCodeReduction() {
        return codeReduction;
    }

    public void setCodeReduction(CodeReduction paramCodeReduction) {
        codeReduction = paramCodeReduction;
    }

    public Rib getRib() {
        return rib;
    }

    public void setRib(Rib paramRib) {
        rib = paramRib;
    }

    public String getLienSuivi() {
        return lienSuivi;
    }

    public void setLienSuivi(String lienSuivi) {
        this.lienSuivi = lienSuivi;
    }
}