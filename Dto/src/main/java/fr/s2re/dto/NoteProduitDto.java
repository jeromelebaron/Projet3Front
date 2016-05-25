package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NoteProduitDto extends NoteDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private ProduitDto produit;

    public NoteProduitDto() {
        super();
    }

    public NoteProduitDto(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie,
            ClientDto paramNoteur, ProduitDto paramProduit) {
        super(paramId, paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur);
        produit = paramProduit;
    }

    public NoteProduitDto(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie,
            ClientDto paramNoteur, List<AlerteCommentaireDto> paramAlertes, ProduitDto paramProduit) {
        super(paramId, paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur, paramAlertes);
        produit = paramProduit;
    }

    public ProduitDto getProduit() {
        return produit;
    }

    public void setProduit(ProduitDto paramProduit) {
        produit = paramProduit;
    }
}