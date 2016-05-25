package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;

public class AlerteProduitDto extends AlerteDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private ProduitDto produit;

    public AlerteProduitDto() {
        super();
    }

    public AlerteProduitDto(Integer paramId, Date paramDateCreation, Date paramDateCloture, UtilisateurDto paramEmetteur,
            ObjetAlerteDto paramObjet, ProduitDto paramProduit) {
        super(paramId, paramDateCreation, paramDateCloture, paramEmetteur, paramObjet);
        produit = paramProduit;
    }

    public ProduitDto getProduit() {
        return produit;
    }

    public void setProduit(ProduitDto paramProduit) {
        produit = paramProduit;
    }
}