package fr.s2re.dto;

import java.io.Serializable;
import java.util.List;

public class MessagerieDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private List<MessageInboxDto> messages;
    private ClientDto demandeur;
    private ProduitDto produit;

    public MessagerieDto() {
        super();
    }

    public MessagerieDto(Integer paramId, ClientDto paramDemandeur, ProduitDto paramProduit) {
        super();
        id = paramId;
        demandeur = paramDemandeur;
        produit = paramProduit;
    }

    public MessagerieDto(Integer paramId, List<MessageInboxDto> paramMessages, ClientDto paramDemandeur, ProduitDto paramProduit) {
        super();
        id = paramId;
        messages = paramMessages;
        demandeur = paramDemandeur;
        produit = paramProduit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public List<MessageInboxDto> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageInboxDto> paramMessages) {
        messages = paramMessages;
    }

    public ClientDto getDemandeur() {
        return demandeur;
    }

    public void setDemandeur(ClientDto paramDemandeur) {
        demandeur = paramDemandeur;
    }

    public ProduitDto getProduit() {
        return produit;
    }

    public void setProduit(ProduitDto paramProduit) {
        produit = paramProduit;
    }
}