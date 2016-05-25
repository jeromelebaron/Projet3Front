package fr.s2re.uc;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import fr.s2re.dto.CategorieDto;
import fr.s2re.ibusiness.IBusinessCategorie;
import fr.s2re.iuc.IUcInit;

@Remote(IUcInit.class)
@Stateless
public class UcInit implements IUcInit {
    private static Logger log = Logger.getLogger(UcInit.class);

    @EJB
    private IBusinessCategorie bCategorie;

    @Override
    public List<CategorieDto> getAllCategorie() {
        List<CategorieDto> list = new ArrayList<>();
        for (CategorieDto c : bCategorie.getAll()) {
            c.setCategories(bCategorie.getCategories(c));
            c.setProduits(bCategorie.getProduits(c));
            for (CategorieDto sousCat : list) {
                sousCat.setCategories(bCategorie.getCategories(sousCat));
                sousCat.setProduits(bCategorie.getProduits(sousCat));
            }
            list.add(c);
        }
        return list;
    }

    @Override
    public List<CategorieDto> getSousCategorie(CategorieDto paramCategorie) {
        List<CategorieDto> list = new ArrayList<>();
        for (CategorieDto c : bCategorie.getSousCategorie(paramCategorie)) {
            c.setCategories(bCategorie.getCategories(c));
            c.setProduits(bCategorie.getProduits(c));
            list.add(c);
        }
        return list;
    }

    // Rendre ca recursif si on a le tps =)
    // retourne liste de cat arborescente
    @Override
    public List<CategorieDto> getCatRacine() {
        List<CategorieDto> list = new ArrayList<>();
        /*
         * for (CategorieDto c : bCategorie.getAll()) { if (c.getCategorieParent() == null) { c.setCategories(bCategorie.getCategories(c));
         * c.setProduits(bCategorie.getProduits(c)); for (CategorieDto sousCat : c.getCategories()) {
         * sousCat.setCategories(bCategorie.getCategories(sousCat)); sousCat.setProduits(bCategorie.getProduits(sousCat)); } list.add(c); }
         * }
         */
        // version iterative
        list.addAll(bCategorie.getAllParents());
        iterSousCat(list);
        // Test
        // recurTestLogInfo(list);
        return list;
    }

    private void recurTestLogInfo(List<CategorieDto> list) {
        for (CategorieDto c : list) {
            log.info(c.getLibelle());
            recurTestLogInfo(c.getCategories());

        }
    }

    private void iterSousCat(List<CategorieDto> list) {
        for (CategorieDto c : list) {
            List<CategorieDto> listeEnfants = new ArrayList<>();
            listeEnfants = bCategorie.getSousCategorie(c);
            c.setCategories(listeEnfants);
            iterSousCat(listeEnfants);
        }
    }
}
