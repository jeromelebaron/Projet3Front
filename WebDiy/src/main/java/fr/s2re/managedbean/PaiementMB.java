/**
 * Créé le 21 mai 2016 par Jérome LE BARON
 */
package fr.s2re.managedbean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.s2re.banque.servicebanque.CarteBancaireDto;
import fr.s2re.dto.CartePaiementDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.iuc.IUcClient;
import fr.s2re.iuc.IUcTransactionBancaire;

/**
 * Pour réaliser les actions de paiement.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@ManagedBean
@SessionScoped
public class PaiementMB {

    /**
     * Pour effectuer la transation bancaire
     */
    @EJB
    private IUcTransactionBancaire ucTransactionBancaire;

    /**
     * Pour faire une commande.
     */
    @EJB
    private IUcClient ucClient;
    /**
     * L'utilisateur connecté.
     */
    private UtilisateurDto user;
    /**
     * nom titulaire carte
     */
    private String nomTitulaire;

    /**
     * La Commande à payer
     */
    private CommandeDto commandeDto;
    /**
     * carteBancaireClient
     */
    private CarteBancaireDto carteDto = new CarteBancaireDto();
    /**
     * La carte bancaire pour la transaction
     */
    private CartePaiementDto cartePaiementDto;
    /**
     * Le message en cas d'erreur de paiement.
     */
    private String messageErreurPaiement;
    /**
     * Pour récupérer la commande en cours.
     */
    @ManagedProperty(value = "#{commandeMb}")
    private CommandeMb commandeMb;
    /**
     * Pour vider le panier une fois que le paiement est validée.
     */
    @ManagedProperty(value = "#{panierMb}")
    private PanierMb panierMb;
    /**
     * Pour récupérer l'utilisateur connecté.
     */
    @ManagedProperty(value = "#{connectionMb}")
    private ConnectionMb connectionMb;

    /**
     * Pour effectuer le paiement.
     * @return sur la page de confirmation de la commande si le paiement est validé.
     */
    public String payer() {
        if (connectionMb != null && connectionMb.getUser() != null) {
            user = connectionMb.getUser();
            commandeDto = commandeMb.getCommande();
            if (ucTransactionBancaire.verifierSolde(nomTitulaire,
                    commandeMb.getMontantTotalCommande(), carteDto)) {
                commandeDto = ucClient.passerCommande((ClientDto) user,
                        commandeMb.getListLigneDeCommande(), commandeDto);
                panierMb.getCommandeDto().getLignesDeCommande().clear();
                panierMb.getMapLigneCmd().clear();
                panierMb.setTotalProduits(0);
                return "confirmationCommande.jsf?faces-redirect=true";
            } else {
                messageErreurPaiement = "Erreur avec vos informations bancaires, veuillez réessayer";
                return messageErreurPaiement;
            }
        } else {
            return "/login.xhtml?faces-redirect=true";
        }
    }

    /**
     * Accesseur en lecture du champ <code>user</code>.
     * @return le champ <code>user</code>.
     */
    public UtilisateurDto getUser() {
        return user;
    }

    /**
     * Accesseur en écriture du champ <code>user</code>.
     * @param paramUser la valeur à écrire dans <code>user</code>.
     */
    public void setUser(UtilisateurDto paramUser) {
        user = paramUser;
    }

    /**
     * Accesseur en lecture du champ <code>commandeDto</code>.
     * @return le champ <code>commandeDto</code>.
     */
    public CommandeDto getCommandeDto() {
        return commandeDto;
    }

    /**
     * Accesseur en écriture du champ <code>commandeDto</code>.
     * @param paramCommandeDto la valeur à écrire dans <code>commandeDto</code>.
     */
    public void setCommandeDto(CommandeDto paramCommandeDto) {
        commandeDto = paramCommandeDto;
    }

    /**
     * Accesseur en lecture du champ <code>cartePaiementDto</code>.
     * @return le champ <code>cartePaiementDto</code>.
     */
    public CartePaiementDto getCartePaiementDto() {
        return cartePaiementDto;
    }

    /**
     * Accesseur en écriture du champ <code>cartePaiementDto</code>.
     * @param paramCartePaiementDto la valeur à écrire dans <code>cartePaiementDto</code>.
     */
    public void setCartePaiementDto(CartePaiementDto paramCartePaiementDto) {
        cartePaiementDto = paramCartePaiementDto;
    }

    /**
     * Accesseur en lecture du champ <code>messageErreurPaiement</code>.
     * @return le champ <code>messageErreurPaiement</code>.
     */
    public String getMessageErreurPaiement() {
        return messageErreurPaiement;
    }

    /**
     * Accesseur en écriture du champ <code>messageErreurPaiement</code>.
     * @param paramMessageErreurPaiement la valeur à écrire dans <code>messageErreurPaiement</code>.
     */
    public void setMessageErreurPaiement(String paramMessageErreurPaiement) {
        messageErreurPaiement = paramMessageErreurPaiement;
    }

    /**
     * Accesseur en lecture du champ <code>commandeMb</code>.
     * @return le champ <code>commandeMb</code>.
     */
    public CommandeMb getCommandeMb() {
        return commandeMb;
    }

    /**
     * Accesseur en écriture du champ <code>commandeMb</code>.
     * @param paramCommandeMb la valeur à écrire dans <code>commandeMb</code>.
     */
    public void setCommandeMb(CommandeMb paramCommandeMb) {
        commandeMb = paramCommandeMb;
    }

    /**
     * Accesseur en lecture du champ <code>connectionMb</code>.
     * @return le champ <code>connectionMb</code>.
     */
    public ConnectionMb getConnectionMb() {
        return connectionMb;
    }

    /**
     * Accesseur en écriture du champ <code>connectionMb</code>.
     * @param paramConnectionMb la valeur à écrire dans <code>connectionMb</code>.
     */
    public void setConnectionMb(ConnectionMb paramConnectionMb) {
        connectionMb = paramConnectionMb;
    }

    /**
     * Accesseur en lecture du champ <code>panierMb</code>.
     * @return le champ <code>panierMb</code>.
     */
    public PanierMb getPanierMb() {
        return panierMb;
    }

    /**
     * Accesseur en écriture du champ <code>panierMb</code>.
     * @param paramPanierMb la valeur à écrire dans <code>panierMb</code>.
     */
    public void setPanierMb(PanierMb paramPanierMb) {
        panierMb = paramPanierMb;
    }

    /**
     * Accesseur en lecture du champ <code>ucTransactionBancaire</code>.
     * @return le champ <code>ucTransactionBancaire</code>.
     */
    public IUcTransactionBancaire getUcTransactionBancaire() {
        return ucTransactionBancaire;
    }

    /**
     * Accesseur en écriture du champ <code>ucTransactionBancaire</code>.
     * @param paramUcTransactionBancaire la valeur à écrire dans <code>ucTransactionBancaire</code>.
     */
    public void setUcTransactionBancaire(IUcTransactionBancaire paramUcTransactionBancaire) {
        ucTransactionBancaire = paramUcTransactionBancaire;
    }

    /**
     * Accesseur en lecture du champ <code>ucClient</code>.
     * @return le champ <code>ucClient</code>.
     */
    public IUcClient getUcClient() {
        return ucClient;
    }

    /**
     * Accesseur en écriture du champ <code>ucClient</code>.
     * @param paramUcClient la valeur à écrire dans <code>ucClient</code>.
     */
    public void setUcClient(IUcClient paramUcClient) {
        ucClient = paramUcClient;
    }

    public CarteBancaireDto getCarteDto() {
        return carteDto;
    }

    public void setCarteDto(CarteBancaireDto carteDto) {
        this.carteDto = carteDto;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }
}
