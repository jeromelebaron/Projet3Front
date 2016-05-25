package fr.s2re.managedbean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.NoteClientDto;
import fr.s2re.dto.NoteDto;
import fr.s2re.dto.NoteProduitDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.iuc.IUcClient;
import fr.s2re.iuc.IUcUtilisateur;
import fr.s2re.iuc.IUcVendeur;

@ManagedBean
@SessionScoped
public class EvaluationMb {
    private static Logger log = Logger.getLogger(EvaluationMb.class);

    private Double valeurNote;

    private String commentaire;

    private ClientDto client;

    private ProduitDto produit;

    private ClientDto vendeur;

    private List<NoteDto> listNoteVendeur;

    @ManagedProperty(value = "#{connectionMb}")
    private ConnectionMb connectionMb;

    @EJB
    private IUcClient ucClient;

    @EJB
    private IUcUtilisateur ucUtilisateur;

    @EJB
    private IUcVendeur ucVendeur;

    @PostConstruct
    public void init() {
        if (connectionMb.getUser().getClass() == ClientDto.class) {
            client = (ClientDto) connectionMb.getUser();
        } else {
            client = null;
        }
    }

    public String versNoteProduit(Integer paramId) {
        produit = new ProduitDto();
        produit = ucUtilisateur.getById(paramId);
        return "/formulaireEvaluation.xhtml?faces-redirect=true";
    }

    public String versNoteVendeur(Integer paramId) {
        vendeur = new ClientDto();
        vendeur = ucVendeur.getVendeurByIdProduit(paramId);
        listNoteVendeur = ucVendeur.getNotesByNoteur(client, vendeur);
        return "/formulaireEvaluationVendeur.xhtml?faces-redirect=true";
    }

    public String noteProduit() {
        log.info("produit noté = " + produit.getId());
        if (client != null) {
            log.info("client coco = " + client.getId());
            NoteProduitDto note = new NoteProduitDto();
            if (valeurNote != null) {
                log.info(valeurNote + " ikiii " + commentaire);
                note.setNote(valeurNote);
                note.setCommentaire(commentaire);
                note.setNoteur(client);
                note.setProduit(produit);
                log.info("note = " + note.getNote() + " com = " + note.getCommentaire());
                ucClient.noter(note);
            }
        }
        return "/detailCommande.xhtml?faces-redirect=true";
    }

    public String noteVendeur() {
        if (client != null) {
            NoteClientDto note = new NoteClientDto();
            if (valeurNote != null) {
                log.info(valeurNote + " ikiii " + commentaire);
                note.setNote(valeurNote);
                note.setCommentaire(commentaire);
                note.setNoteur(client);
                note.setVendeur(vendeur);
                log.info("note = " + note.getNote() + " com = " + note.getCommentaire());
                ucClient.noter(note);
            }
        }
        return "/detailCommande.xhtml?faces-redirect=true";
    }

    public List<NoteDto> getListNoteVendeur() {
        return listNoteVendeur;
    }

    public void setListNoteVendeur(List<NoteDto> paramListNoteVendeur) {
        listNoteVendeur = paramListNoteVendeur;
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

    public IUcUtilisateur getUcUtilisateur() {
        return ucUtilisateur;
    }

    public void setUcUtilisateur(IUcUtilisateur paramUcUtilisateur) {
        ucUtilisateur = paramUcUtilisateur;
    }

    public Double getValeurNote() {
        return valeurNote;
    }

    public void setValeurNote(Double paramValeurNote) {
        valeurNote = paramValeurNote;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String paramCommentaire) {
        commentaire = paramCommentaire;
    }

    public final ProduitDto getProduit() {
        return produit;
    }

    public final void setProduit(ProduitDto paramProduit) {
        produit = paramProduit;
    }

    public ClientDto getVendeur() {
        return vendeur;
    }

    public void setVendeur(ClientDto paramVendeur) {
        vendeur = paramVendeur;
    }

    public IUcVendeur getUcVendeur() {
        return ucVendeur;
    }

    public void setUcVendeur(IUcVendeur paramUcVendeur) {
        ucVendeur = paramUcVendeur;
    }
}
