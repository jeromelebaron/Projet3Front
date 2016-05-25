package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NoteDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Double note;
    private String commentaire;
    private Date date;
    private Boolean publie;
    private ClientDto noteur;
    private List<AlerteCommentaireDto> alertes;

    public NoteDto() {
        super();
    }

    public NoteDto(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, ClientDto paramNoteur) {
        super();
        id = paramId;
        note = paramNote;
        commentaire = paramCommentaire;
        date = paramDate;
        publie = paramPublie;
        noteur = paramNoteur;
    }

    public NoteDto(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, ClientDto paramNoteur,
            List<AlerteCommentaireDto> paramAlertes) {
        super();
        id = paramId;
        note = paramNote;
        commentaire = paramCommentaire;
        date = paramDate;
        publie = paramPublie;
        noteur = paramNoteur;
        alertes = paramAlertes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double paramNote) {
        note = paramNote;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String paramCommentaire) {
        commentaire = paramCommentaire;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date paramDate) {
        date = paramDate;
    }

    public ClientDto getNoteur() {
        return noteur;
    }

    public void setNoteur(ClientDto paramNoteur) {
        noteur = paramNoteur;
    }

    public List<AlerteCommentaireDto> getAlertes() {
        return alertes;
    }

    public void setAlertes(List<AlerteCommentaireDto> paramAlertes) {
        alertes = paramAlertes;
    }

    public Boolean getPublie() {
        return publie;
    }

    public void setPublie(Boolean paramPublie) {
        publie = paramPublie;
    }
}