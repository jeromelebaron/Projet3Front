package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MessageDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String message;
    private Date date;
    private Date dateModif;
    private Boolean publie;
    private List<AlerteMessageDto> alertes;

    public MessageDto() {
        super();
    }

    public MessageDto(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie) {
        super();
        id = paramId;
        message = paramMessage;
        date = paramDate;
        dateModif = paramDateModif;
        publie = paramPublie;
    }

    public MessageDto(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie,
            List<AlerteMessageDto> paramAlertes) {
        super();
        id = paramId;
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

    public List<AlerteMessageDto> getAlertes() {
        return alertes;
    }

    public void setAlertes(List<AlerteMessageDto> paramAlertes) {
        alertes = paramAlertes;
    }

    public Boolean getPublie() {
        return publie;
    }

    public void setPublie(Boolean paramPublie) {
        publie = paramPublie;
    }
}