package fr.s2re.managedbean;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import fr.s2re.bigdata.backend.mongo.dao.impl.DaoProduit;
import fr.s2re.bigdata.backend.mongo.idao.IDaoProduit;
import fr.s2re.bigdata.backend.wrapper.ProduitWrapper;

@ManagedBean
public class MeilleurVenteMb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ProduitWrapper> produits;
    
   
    private IDaoProduit daoProduit = new DaoProduit();
     
    @PostConstruct
    public void init() {
       produits = daoProduit.getMeilleuresVentes(5);
    }

	public List<ProduitWrapper> getProduits() {
		return produits;
	}

	public void setProduits(List<ProduitWrapper> produits) {
		this.produits = produits;
	}
 
   
 
   

}
