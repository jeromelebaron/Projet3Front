package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "message")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type_message")
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "message", length = 1000, nullable = false)
    private String message;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date", nullable = false)
    private Date date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_modif", nullable = true)
    private Date dateModif;

    @Column(name = "publie", nullable = false)
    private Boolean publie;

    @OneToMany(mappedBy = "message")
    private List<AlerteMessage> alertes;

    public Message() {
        super();
    }

    public Message(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie) {
        super();
        id = paramId;
        message = paramMessage;
        date = paramDate;
        dateModif = paramDateModif;
        publie = paramPublie;
    }

    public Message(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie,
            List<AlerteMessage> paramAlertes) {
        super();
        id = paramId;
        message = paramMessage;
        date = paramDate;
        dateModif = paramDateModif;
        publie = paramPublie;
        alertes = paramAlertes;
    }

    public Message(String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie) {
        super();
        message = paramMessage;
        date = paramDate;
        dateModif = paramDateModif;
        publie = paramPublie;
    }

    public Message(String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie, List<AlerteMessage> paramAlertes) {
        super();
        message = paramMessage;
        date = paramDate;
        dateModif = paramDateModif;
        publie = paramPublie;
        alertes = paramAlertes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String paramMessage) {
        message = paramMessage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date paramDate) {
        date = paramDate;
    }

    public Date getDateModif() {
        return dateModif;
    }

    public void setDateModif(Date paramDateModif) {
        dateModif = paramDateModif;
    }

    public List<AlerteMessage> getAlertes() {
        return alertes;
    }

    public void setAlertes(List<AlerteMessage> paramAlertes) {
        alertes = paramAlertes;
    }

    public Boolean getPublie() {
        return publie;
    }

    public void setPublie(Boolean paramPublie) {
        publie = paramPublie;
    }
}