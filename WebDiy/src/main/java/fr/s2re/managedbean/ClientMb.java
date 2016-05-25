package fr.s2re.managedbean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import fr.s2re.dto.AdresseDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.iuc.IUcClient;
import fr.s2re.iuc.IUcUtilisateur;

@ManagedBean
@SessionScoped
public class ClientMb {
    private static Logger log = Logger.getLogger(ClientMb.class);

    private String cpL;

    private String villeL;

    private String cpF;

    private String villeF;

    private UtilisateurDto user;

    private AdresseDto adresseLCusto = new AdresseDto();

    private AdresseDto adresseFCusto = new AdresseDto();

    private List<AdresseDto> adressesLivraison = new ArrayList<>();

    private List<AdresseDto> adressesFacturation = new ArrayList<>();

    private List<AdresseDto> adresses = new ArrayList<>();

    private int adresseLivraisonChoisie;

    private int adresseFacturationChoisie;

    private AdresseDto adresseDisplay = new AdresseDto();

    @EJB
    private IUcClient ucClient;

    @EJB
    private IUcUtilisateur ucUtilisateur;

    @ManagedProperty(value = "#{connectionMb}")
    private ConnectionMb connectionMb;

    @PostConstruct
    public void init() {
        if (connectionMb != null && connectionMb.getUser() != null) {
            user = connectionMb.getUser();
            log.info("user = " + user.getId());
        } else {
            user = null;
        }
    }

    public String ajouterAdresseL() {
        if (connectionMb != null && connectionMb.getUser() != null) {
            user = connectionMb.getUser();
        }
        adresseLCusto.setClient((ClientDto) user);
        adresseLCusto.setVille(ucClient.getVillesByCpNom(cpL, villeL));
        adresseLCusto.setPublie(true);
        adresseLCusto.setType("livraison");

        AdresseDto aDto = new AdresseDto(null, adresseLCusto.getLibelle(), adresseLCusto.getNumero(), adresseLCusto.getRue(),
                adresseLCusto.getPublie(), adresseLCusto.getType(), null, null, adresseLCusto.getClient(), adresseLCusto.getVille());

        adresseLCusto = ucClient.ajouterAdresse(aDto);
        adressesLivraison.add(adresseLCusto);
        cpL = "";
        villeL = "";
        return "";
    }

    public String ajouterAdresseF() {
        if (connectionMb != null && connectionMb.getUser() != null) {
            user = connectionMb.getUser();
        }
        adresseFCusto.setClient((ClientDto) user);
        adresseFCusto.setVille(ucClient.getVillesByCpNom(cpF, villeF));
        adresseFCusto.setPublie(true);
        adresseFCusto.setType("facturation");

        AdresseDto aDto = new AdresseDto(null, adresseFCusto.getLibelle(), adresseFCusto.getNumero(), adresseFCusto.getRue(),
                adresseFCusto.getPublie(), adresseFCusto.getType(), null, null, adresseFCusto.getClient(), adresseFCusto.getVille());
        adresseFCusto = ucClient.ajouterAdresse(aDto);
        adressesFacturation.add(adresseFCusto);
        cpF = "";
        villeF = "";
        return "";
    }

    public void afficherAdresse() {
        // adresseDisplay = ucUtilisateur.retournerAdresseParId(adresseLivraisonChoisie);
    }

    public String supprimerAdresseL() {
        AdresseDto aTmp = new AdresseDto();
        aTmp = ucUtilisateur.retournerAdresseParId(adresseLivraisonChoisie);
        aTmp.setPublie(false);
        aTmp = ucClient.supprimerAdresseDuCarnet(aTmp);
        // on suppr de la liste des adresses récuperée.
        Iterator<AdresseDto> iterator = adressesLivraison.iterator();
        while (iterator.hasNext()) {
            Integer idAdresse = iterator.next().getId();
            if (idAdresse == aTmp.getId()) {
                // On supprime l'élément courant de la liste
                iterator.remove();
            }
        }
        return "";
    }

    public String supprimerAdresseF() {
        AdresseDto aTmp = new AdresseDto();
        aTmp = ucUtilisateur.retournerAdresseParId(adresseFacturationChoisie);
        aTmp.setPublie(false);
        aTmp = ucClient.supprimerAdresseDuCarnet(aTmp);
        // on suppr de la liste des adresses récuperée.
        Iterator<AdresseDto> iterator = adressesFacturation.iterator();
        while (iterator.hasNext()) {
            Integer idAdresse = iterator.next().getId();
            if (idAdresse == aTmp.getId()) {
                // On supprime l'élément courant de la liste
                iterator.remove();
            }
        }
        return "";
    }

    public UtilisateurDto getUser() {
        return user;
    }

    public void setUser(UtilisateurDto paramUser) {
        user = paramUser;
    }

    public AdresseDto getAdresseLCusto() {
        return adresseLCusto;
    }

    public void setAdresseLCusto(AdresseDto paramAdresseLCusto) {
        adresseLCusto = paramAdresseLCusto;
    }

    public AdresseDto getAdresseFCusto() {
        return adresseFCusto;
    }

    public void setAdresseFCusto(AdresseDto paramAdresseFCusto) {
        adresseFCusto = paramAdresseFCusto;
    }

    public List<AdresseDto> getAdressesLivraison() {
        return adressesLivraison;
    }

    public void setAdressesLivraison(List<AdresseDto> paramAdressesLivraison) {
        adressesLivraison = paramAdressesLivraison;
    }

    public List<AdresseDto> getAdressesFacturation() {
        return adressesFacturation;
    }

    public void setAdressesFacturation(List<AdresseDto> paramAdressesFacturation) {
        adressesFacturation = paramAdressesFacturation;
    }

    public List<AdresseDto> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<AdresseDto> paramAdresses) {
        adresses = paramAdresses;
    }

    public int getAdresseLivraisonChoisie() {
        return adresseLivraisonChoisie;
    }

    public void setAdresseLivraisonChoisie(int paramAdresseLivraisonChoisie) {
        adresseLivraisonChoisie = paramAdresseLivraisonChoisie;
    }

    public int getAdresseFacturationChoisie() {
        return adresseFacturationChoisie;
    }

    public void setAdresseFacturationChoisie(int paramAdresseFacturationChoisie) {
        adresseFacturationChoisie = paramAdresseFacturationChoisie;
    }

    public IUcClient getUcClient() {
        return ucClient;
    }

    public void setUcClient(IUcClient paramUcClient) {
        ucClient = paramUcClient;
    }

    public IUcUtilisateur getUcUtilisateur() {
        return ucUtilisateur;
    }

    public void setUcUtilisateur(IUcUtilisateur paramUcUtilisateur) {
        ucUtilisateur = paramUcUtilisateur;
    }

    public ConnectionMb getConnectionMb() {
        return connectionMb;
    }

    public void setConnectionMb(ConnectionMb paramConnectionMb) {
        connectionMb = paramConnectionMb;
    }

    public String getCpL() {
        return cpL;
    }

    public void setCpL(String paramCpL) {
        cpL = paramCpL;
    }

    public String getVilleL() {
        return villeL;
    }

    public void setVilleL(String paramVilleL) {
        villeL = paramVilleL;
    }

    public String getCpF() {
        return cpF;
    }

    public void setCpF(String paramCpF) {
        cpF = paramCpF;
    }

    public String getVilleF() {
        return villeF;
    }

    public void setVilleF(String paramVilleF) {
        villeF = paramVilleF;
    }

    public AdresseDto getAdresseDisplay() {
        return adresseDisplay;
    }

    public void setAdresseDisplay(AdresseDto paramAdresseDisplay) {
        adresseDisplay = paramAdresseDisplay;
    }
}
