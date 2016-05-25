package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;

public class AlerteDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Date dateCreation;
    private Date dateCloture;
    private UtilisateurDto emetteur;
    private ObjetAlerteDto objet;

    public AlerteDto() {
        super();
    }

    public AlerteDto(Integer paramId, Date paramDateCreation, Date paramDateCloture, UtilisateurDto paramEmetteur,
            ObjetAlerteDto paramObjet) {
        super();
        id = paramId;
        dateCreation = paramDateCreation;
        dateCloture = paramDateCloture;
        emetteur = paramEmetteur;
        objet = paramObjet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date paramDateCreation) {
        dateCreation = paramDateCreation;
    }

    public Date getDateCloture() {
        return dateCloture;
    }

    public void setDateCloture(Date paramDateCloture) {
        dateCloture = paramDateCloture;
    }

    public UtilisateurDto getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(UtilisateurDto paramEmetteur) {
        emetteur = paramEmetteur;
    }

    public ObjetAlerteDto getObjet() {
        return objet;
    }

    public void setObjet(ObjetAlerteDto paramObjet) {
        objet = paramObjet;
    }
}