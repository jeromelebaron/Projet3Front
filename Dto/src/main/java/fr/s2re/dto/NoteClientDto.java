package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NoteClientDto extends NoteDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private ClientDto vendeur;

    public NoteClientDto() {
        super();
    }

    public NoteClientDto(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie,
            ClientDto paramNoteur, ClientDto paramVendeur) {
        super(paramId, paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur);
        vendeur = paramVendeur;
    }

    public NoteClientDto(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie,
            ClientDto paramNoteur, List<AlerteCommentaireDto> paramAlertes, ClientDto paramVendeur) {
        super(paramId, paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur, paramAlertes);
        vendeur = paramVendeur;
    }

    public ClientDto getVendeur() {
        return vendeur;
    }

    public void setVendeur(ClientDto paramVendeur) {
        vendeur = paramVendeur;
    }
}