/*
 * Créé le 20 juin 2016 par Jérome LE BARON
 */
package fr.s2re.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Description de la classe
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@ManagedBean
@SessionScoped
public class AdministrationMB {

    /**
     * Login pour la connexion
     */
    private String login;
    /**
     * Mot de passe pour la connexion.
     */
    private String motDePasse;

    /**
     * Pour vérifier sur la connexion
     * @return sur la page d'administration
     */
    public String connexion() {
        return "administrationaccueil.jsf?faces-redirect=true";
    }

    /**
     * Accesseur en lecture du champ <code>login</code>.
     * @return le champ <code>login</code>.
     */
    public String getLogin() {
        return login;
    }

    /**
     * Accesseur en écriture du champ <code>login</code>.
     * @param paramLogin la valeur à écrire dans <code>login</code>.
     */
    public void setLogin(String paramLogin) {
        login = paramLogin;
    }

    /**
     * Accesseur en lecture du champ <code>motDePasse</code>.
     * @return le champ <code>motDePasse</code>.
     */
    public String getMotDePasse() {
        return motDePasse;
    }

    /**
     * Accesseur en écriture du champ <code>motDePasse</code>.
     * @param paramMotDePasse la valeur à écrire dans <code>motDePasse</code>.
     */
    public void setMotDePasse(String paramMotDePasse) {
        motDePasse = paramMotDePasse;
    }

}
