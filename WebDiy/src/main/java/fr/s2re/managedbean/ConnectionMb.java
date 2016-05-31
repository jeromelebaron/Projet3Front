package fr.s2re.managedbean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import fr.s2re.dto.AdministrateurDto;
import fr.s2re.dto.AssociationDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.GerantDto;
import fr.s2re.dto.ModerateurDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.iuc.IUcUtilisateur;

@ManagedBean
@SessionScoped
public class ConnectionMb {

    private static final String URL_ACCUEIL = "/accueil.xhtml?faces-redirect=true";

    private static Logger log = Logger.getLogger(ConnectionMb.class);

    private UtilisateurDto user = null;

    private String mail;

    private String mdp;

    @EJB
    private IUcUtilisateur uc;

    public String seConnecter() {
        user = uc.seConnecter(mail, mdp);
        if (user == null) {
            return "/login.xhtml?faces-redirect=true";
        } else {
            if (user.getClass() == ClientDto.class) {
                return "/profilClient.xhtml?faces-redirect=true";
            }
            if (user.getClass() == AssociationDto.class) {
                return URL_ACCUEIL;
            }
            if (user.getClass() == ModerateurDto.class || user.getClass() == GerantDto.class
                    || user.getClass() == AdministrateurDto.class) {
                return "/profilModerateur.xhtml?faces-redirect=true";
            } else {
                return URL_ACCUEIL;
            }
        }
    }

    public String afficherProfil() {
        if (user == null) {
            return URL_ACCUEIL;
        } else {
            if (user.getClass() == ClientDto.class) {
                return "/profilClient.xhtml?faces-redirect=true";
            }
            if (user.getClass() == ModerateurDto.class || user.getClass() == GerantDto.class
                    || user.getClass() == AdministrateurDto.class) {
                return "/profilModerateur.xhtml?faces-redirect=true";
            } else {
                return URL_ACCUEIL;
            }
        }
    }

    public String seDeconnecter() {
        ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest())
                .getSession().invalidate();
        return URL_ACCUEIL;
    }

    public UtilisateurDto getUser() {
        return user;
    }

    public void setUser(UtilisateurDto paramUser) {
        user = paramUser;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String paramMail) {
        mail = paramMail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String paramMdp) {
        mdp = paramMdp;
    }

    public IUcUtilisateur getUc() {
        return uc;
    }

    public void setUc(IUcUtilisateur paramUc) {
        uc = paramUc;
    }
}
