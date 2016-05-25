package fr.s2re.managedbean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.s2re.dto.CategorieDto;
import fr.s2re.iuc.IUcInit;

@ManagedBean
@SessionScoped
public class MenuMb {
    private List<CategorieDto> listCategoriesMere;

    @EJB
    private IUcInit ucInit;

    @PostConstruct
    public void init() {
        listCategoriesMere = ucInit.getCatRacine();
    }

    public List<CategorieDto> getListCategoriesMere() {
        return listCategoriesMere;
    }

    public void setListCategoriesMere(List<CategorieDto> paramListCategoriesMere) {
        listCategoriesMere = paramListCategoriesMere;
    }

    public IUcInit getUcInit() {
        return ucInit;
    }

    public void setUcInit(IUcInit paramUcInit) {
        ucInit = paramUcInit;
    }
}
