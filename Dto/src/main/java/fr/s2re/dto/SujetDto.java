package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SujetDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String titre;
    private Date date;
    private Date dateCloture;
    private Boolean publie;
    private List<MessageForumDto> messages;
    private TypeSujetDto type;
    private RubriqueDto rubrique;

    public SujetDto() {
        super();
    }

    public SujetDto(Integer paramId, String paramTitre, Date paramDate, Date paramDateCloture, Boolean paramPublie, TypeSujetDto paramType,
            RubriqueDto paramRubrique) {
        super();
        id = paramId;
        titre = paramTitre;
        date = paramDate;
        dateCloture = paramDateCloture;
        publie = paramPublie;
        type = paramType;
        rubrique = paramRubrique;
    }

    public SujetDto(Integer paramId, String paramTitre, Date paramDate, Date paramDateCloture, Boolean paramPublie,
            List<MessageForumDto> paramMessages, TypeSujetDto paramType, RubriqueDto paramRubrique) {
        super();
        id = paramId;
        titre = paramTitre;
        date = paramDate;
        dateCloture = paramDateCloture;
        publie = paramPublie;
        messages = paramMessages;
        type = paramType;
        rubrique = paramRubrique;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String paramTitre) {
        titre = paramTitre;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date paramDate) {
        date = paramDate;
    }

    public Date getDateCloture() {
        return dateCloture;
    }

    public void setDateCloture(Date paramDateCloture) {
        dateCloture = paramDateCloture;
    }

    public Boolean getPublie() {
        return publie;
    }

    public void setPublie(Boolean paramPublie) {
        publie = paramPublie;
    }

    public List<MessageForumDto> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageForumDto> paramMessages) {
        messages = paramMessages;
    }

    public TypeSujetDto getType() {
        return type;
    }

    public void setType(TypeSujetDto paramType) {
        type = paramType;
    }

    public RubriqueDto getRubrique() {
        return rubrique;
    }

    public void setRubrique(RubriqueDto paramRubrique) {
        rubrique = paramRubrique;
    }
}