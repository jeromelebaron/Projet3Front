package fr.s2re.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.dto.NoteProduitDto;
import fr.s2re.iuc.IUcClient;

@ManagedBean
@SessionScoped
public class HistoriqueCommandeMb {

    private static Logger log = Logger.getLogger(HistoriqueCommandeMb.class);

    /**
     * la liste des commandes parentes
     */
    private List<CommandeDto> commandes = null;
    /**
     * liste d'une commande suivi de ses sous commandes
     */
    private List<CommandeDto> commandeDetails = null;
    /**
     * liste des ligne de commandes d'une commande et de ses sous commandes
     */
    private List<LigneDeCommandeDto> lignesDeCommande = new ArrayList<>();

    private CommandeDto commandeRecherche = new CommandeDto();

    private ClientDto client;

    @EJB
    private IUcClient ucClient;

    @ManagedProperty(value = "#{connectionMb}")
    private ConnectionMb connectionMb;

    @PostConstruct
    public void init() {
        if (connectionMb.getUser() != null && connectionMb != null
                && connectionMb.getUser().getClass() == ClientDto.class) {
            client = (ClientDto) connectionMb.getUser();
        } else {
            client = null;
        }
    }

    public String afficherHistoriqueCommande() {
        if (client == null) {
            return "login.xhtml?faces-redirect=true";
        } else {
            commandes = ucClient.consulterHistorique(client);
            // for (CommandeDto c : commandes) {
            // log.info("sous commande : " + c.getSousCommandes().size());
            // }
            return "/historiqueCommande.xhtml?faces-redirect=true";
        }
    }

    public String afficherDetailCommande(int paramIdRecherche) {
        lignesDeCommande = new ArrayList<>();
        commandeRecherche = ucClient.rechercherParId(paramIdRecherche);
        commandeDetails = ucClient.afficherSsCommandes(commandeRecherche);
        if (!commandeDetails.isEmpty()) {
            for (CommandeDto c : commandeDetails) {
                c.setLignesDeCommande(ucClient.afficherLignesDeCommande(c));
                lignesDeCommande.addAll(c.getLignesDeCommande());

                c.setLignesDeCommande(ucClient.afficherLignesDeCommande(c));
            }
        }
        return "/detailCommande.xhtml?faces-redirect=true";
    }

    public boolean verifNoteProduit(List<NoteProduitDto> paramList) {
        boolean retour = false;
        for (NoteProduitDto noteProduitDto : paramList) {
            if (noteProduitDto.getNoteur().getId() == client.getId()) {
                retour = true;
                break;
            }
        }
        return retour;
    }

    public List<CommandeDto> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<CommandeDto> paramCommandes) {
        commandes = paramCommandes;
    }

    public IUcClient getUcClient() {
        return ucClient;
    }

    public void setUcClient(IUcClient paramUcClient) {
        ucClient = paramUcClient;
    }

    public ConnectionMb getConnectionMb() {
        return connectionMb;
    }

    public void setConnectionMb(ConnectionMb paramConnectionMb) {
        connectionMb = paramConnectionMb;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto paramClient) {
        client = paramClient;
    }

    public List<CommandeDto> getCommandeDetails() {
        return commandeDetails;
    }

    public void setCommandeDetails(List<CommandeDto> paramCommandeDetails) {
        commandeDetails = paramCommandeDetails;
    }

    public CommandeDto getCommandeRecherche() {
        return commandeRecherche;
    }

    public void setCommandeRecherche(CommandeDto paramCommandeRecherche) {
        commandeRecherche = paramCommandeRecherche;
    }

    public List<LigneDeCommandeDto> getLignesDeCommande() {
        return lignesDeCommande;
    }

    public void setLignesDeCommande(List<LigneDeCommandeDto> paramLignesDeCommande) {
        lignesDeCommande = paramLignesDeCommande;
    }
}
