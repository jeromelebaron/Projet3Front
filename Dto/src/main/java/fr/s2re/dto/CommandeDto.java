package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CommandeDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String numero;
    private Double total;
    private Date date;
    private String lienSuivi;
    private List<LigneDeCommandeDto> lignesDeCommande;
    private MethodeLivraisonDto methodeLivraison;
    private ClientDto client;
    private List<CommandeDto> sousCommandes;
    private CommandeDto commandeParente;
    private AdresseDto adresseFacturation;
    private AdresseDto adresseLivraison;
    private TypeCBDto typeCB;
    private EtatCommandeDto etat;
    private CodeReductionDto codeReduction;
    private RibDto rib;

    public CommandeDto() {
        super();
    }

    public CommandeDto(Integer paramId, String paramNumero, Double paramTotal, Date paramDate, String paramLienSuivi,
            List<LigneDeCommandeDto> paramLignesDeCommande, MethodeLivraisonDto paramMethodeLivraison, ClientDto paramClient,
            List<CommandeDto> paramSousCommandes, CommandeDto paramCommandeParente, AdresseDto paramAdresseFacturation,
            AdresseDto paramAdresseLivraison, TypeCBDto paramTypeCB, EtatCommandeDto paramEtat, RibDto paramRib) {
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

    public CommandeDto(Integer paramId, String paramNumero, Double paramTotal, Date paramDate, String paramLienSuivi,
            List<LigneDeCommandeDto> paramLignesDeCommande, MethodeLivraisonDto paramMethodeLivraison, ClientDto paramClient,
            AdresseDto paramAdresseFacturation, AdresseDto paramAdresseLivraison, TypeCBDto paramTypeCB, EtatCommandeDto paramEtat,
            CodeReductionDto paramCodeReduction, RibDto paramRib) {
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

    public CommandeDto(Integer paramId, String paramNumero, Double paramTotal, Date paramDate, String paramLienSuivi,
            List<LigneDeCommandeDto> paramLignesDeCommande, MethodeLivraisonDto paramMethodeLivraison, ClientDto paramClient,
            CommandeDto paramCommandeParente, AdresseDto paramAdresseFacturation, AdresseDto paramAdresseLivraison, TypeCBDto paramTypeCB,
            EtatCommandeDto paramEtat, CodeReductionDto paramCodeReduction, RibDto paramRib) {
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

    public CommandeDto(Integer paramId, String paramNumero, Double paramTotal, Date paramDate, String paramLienSuivi,
            List<LigneDeCommandeDto> paramLignesDeCommande, MethodeLivraisonDto paramMethodeLivraison, ClientDto paramClient,
            List<CommandeDto> paramSousCommandes, CommandeDto paramCommandeParente, AdresseDto paramAdresseFacturation,
            AdresseDto paramAdresseLivraison, TypeCBDto paramTypeCB, EtatCommandeDto paramEtat, CodeReductionDto paramCodeReduction,
            RibDto paramRib) {
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

    public List<LigneDeCommandeDto> getLignesDeCommande() {
        return lignesDeCommande;
    }

    public void setLignesDeCommande(List<LigneDeCommandeDto> paramLignesDeCommande) {
        lignesDeCommande = paramLignesDeCommande;
    }

    public MethodeLivraisonDto getMethodeLivraison() {
        return methodeLivraison;
    }

    public void setMethodeLivraison(MethodeLivraisonDto paramMethodeLivraison) {
        methodeLivraison = paramMethodeLivraison;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto paramClient) {
        client = paramClient;
    }

    public List<CommandeDto> getSousCommandes() {
        return sousCommandes;
    }

    public void setSousCommandes(List<CommandeDto> paramSousCommandes) {
        sousCommandes = paramSousCommandes;
    }

    public CommandeDto getCommandeParente() {
        return commandeParente;
    }

    public void setCommandeParente(CommandeDto paramCommandeParente) {
        commandeParente = paramCommandeParente;
    }

    public AdresseDto getAdresseFacturation() {
        return adresseFacturation;
    }

    public void setAdresseFacturation(AdresseDto paramAdresseFacturation) {
        adresseFacturation = paramAdresseFacturation;
    }

    public AdresseDto getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(AdresseDto paramAdresseLivraison) {
        adresseLivraison = paramAdresseLivraison;
    }

    public TypeCBDto getTypeCB() {
        return typeCB;
    }

    public void setTypeCB(TypeCBDto paramTypeCB) {
        typeCB = paramTypeCB;
    }

    public EtatCommandeDto getEtat() {
        return etat;
    }

    public void setEtat(EtatCommandeDto paramEtat) {
        etat = paramEtat;
    }

    public CodeReductionDto getCodeReduction() {
        return codeReduction;
    }

    public void setCodeReduction(CodeReductionDto paramCodeReduction) {
        codeReduction = paramCodeReduction;
    }

    public RibDto getRib() {
        return rib;
    }

    public void setRib(RibDto paramRib) {
        rib = paramRib;
    }

    public String getLienSuivi() {
        return lienSuivi;
    }

    public void setLienSuivi(String lienSuivi) {
        this.lienSuivi = lienSuivi;
    }
}