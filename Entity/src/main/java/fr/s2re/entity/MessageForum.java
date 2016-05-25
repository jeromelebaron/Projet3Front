package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value = "FORUM")
public class MessageForum extends Message implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "id_sujet", nullable = false)
    private Sujet sujet;

    @ManyToOne
    @JoinColumn(name = "id_auteur", nullable = false)
    private Utilisateur auteur;

    public MessageForum() {
        super();
    }

    public MessageForum(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie,
            List<AlerteMessage> paramAlertes) {
        super(paramId, paramMessage, paramDate, paramDateModif, paramPublie, paramAlertes);
    }

    public MessageForum(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie) {
        super(paramId, paramMessage, paramDate, paramDateModif, paramPublie);
    }

    public MessageForum(String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie, List<AlerteMessage> paramAlertes) {
        super(paramMessage, paramDate, paramDateModif, paramPublie, paramAlertes);
    }

    public MessageForum(String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie) {
        super(paramMessage, paramDate, paramDateModif, paramPublie);
    }

    public MessageForum(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie,
            List<AlerteMessage> paramAlertes, Sujet paramSujet, Utilisateur paramAuteur) {
        super(paramId, paramMessage, paramDate, paramDateModif, paramPublie, paramAlertes);
        sujet = paramSujet;
        auteur = paramAuteur;
    }

    public MessageForum(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie, Sujet paramSujet,
            Utilisateur paramAuteur) {
        super(paramId, paramMessage, paramDate, paramDateModif, paramPublie);
        sujet = paramSujet;
        auteur = paramAuteur;
    }

    public MessageForum(String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie, List<AlerteMessage> paramAlertes,
            Sujet paramSujet, Utilisateur paramAuteur) {
        super(paramMessage, paramDate, paramDateModif, paramPublie, paramAlertes);
        sujet = paramSujet;
        auteur = paramAuteur;
    }

    public MessageForum(String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie, Sujet paramSujet,
            Utilisateur paramAuteur) {
        super(paramMessage, paramDate, paramDateModif, paramPublie);
        sujet = paramSujet;
        auteur = paramAuteur;
    }

    public Sujet getSujet() {
        return sujet;
    }

    public void setSujet(Sujet paramSujet) {
        sujet = paramSujet;
    }

    public Utilisateur getAuteur() {
        return auteur;
    }

    public void setAuteur(Utilisateur paramAuteur) {
        auteur = paramAuteur;
    }
}