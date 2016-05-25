package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "sujet")
public class Sujet implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "titre", length = 50, nullable = false)
    private String titre;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date", nullable = false)
    private Date date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_cloture", nullable = true)
    private Date dateCloture;

    @Column(name = "publie", nullable = false)
    private Boolean publie;

    @OneToMany(mappedBy = "sujet")
    private List<MessageForum> messages;

    @ManyToOne
    @JoinColumn(name = "id_type", nullable = false)
    private TypeSujet type;

    @ManyToOne
    @JoinColumn(name = "id_rubrique", nullable = false)
    private Rubrique rubrique;

    public Sujet() {
        super();
    }

    public Sujet(Integer paramId, String paramTitre, Date paramDate, Date paramDateCloture, Boolean paramPublie, TypeSujet paramType,
            Rubrique paramRubrique) {
        super();
        id = paramId;
        titre = paramTitre;
        date = paramDate;
        dateCloture = paramDateCloture;
        publie = paramPublie;
        type = paramType;
        rubrique = paramRubrique;
    }

    public Sujet(Integer paramId, String paramTitre, Date paramDate, Date paramDateCloture, Boolean paramPublie,
            List<MessageForum> paramMessages, TypeSujet paramType, Rubrique paramRubrique) {
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

    public Sujet(String paramTitre, Date paramDate, Date paramDateCloture, Boolean paramPublie, TypeSujet paramType,
            Rubrique paramRubrique) {
        super();
        titre = paramTitre;
        date = paramDate;
        dateCloture = paramDateCloture;
        publie = paramPublie;
        type = paramType;
        rubrique = paramRubrique;
    }

    public Sujet(String paramTitre, Date paramDate, Date paramDateCloture, Boolean paramPublie, List<MessageForum> paramMessages,
            TypeSujet paramType, Rubrique paramRubrique) {
        super();
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

    public List<MessageForum> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageForum> paramMessages) {
        messages = paramMessages;
    }

    public TypeSujet getType() {
        return type;
    }

    public void setType(TypeSujet paramType) {
        type = paramType;
    }

    public Rubrique getRubrique() {
        return rubrique;
    }

    public void setRubrique(Rubrique paramRubrique) {
        rubrique = paramRubrique;
    }
}