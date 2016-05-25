package fr.s2re.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.assembleur.AssembleurDto;
import fr.s2re.dto.CategorieDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.ibusiness.IBusinessCategorie;
import fr.s2re.idao.IDaoCategorie;

@Remote(IBusinessCategorie.class)
@Stateless
public class BusinessCategorie implements IBusinessCategorie {
    @EJB
    private IDaoCategorie daoCategorie;

    @Override
    public List<CategorieDto> getAll() {
        return AssembleurDto.listCategorieDtoFromListCategorie(daoCategorie.getAll());
    }

    @Override
    public List<CategorieDto> getSousCategorie(CategorieDto paramCategorie) {
        return AssembleurDto
                .listCategorieDtoFromListCategorie(daoCategorie.getSousCategorie(AssembleurDto.categorieFromCategorieDto(paramCategorie)));
    }

    @Override
    public CategorieDto getById(int paramId) {
        return AssembleurDto.categorieDtoFromCategorie(daoCategorie.getById(paramId));
    }

    @Override
    public CategorieDto getCatParent(CategorieDto paramCategorie) {
        return AssembleurDto.categorieDtoFromCategorie(daoCategorie.getCatParent(AssembleurDto.categorieFromCategorieDto(paramCategorie)));
    }

    @Override
    public List<CategorieDto> getCategories(CategorieDto paramCategorie) {
        return AssembleurDto
                .listCategorieDtoFromListCategorie(daoCategorie.getCategories(AssembleurDto.categorieFromCategorieDto(paramCategorie)));
    }

    @Override
    public List<ProduitDto> getProduits(CategorieDto paramCategorie) {
        return AssembleurDto.listPdtDtoFromListPdt(daoCategorie.getProduits(AssembleurDto.categorieFromCategorieDto(paramCategorie)));
    }

    @Override
    public List<CategorieDto> getAllParents() {
        return AssembleurDto.listCategorieDtoFromListCategorie(daoCategorie.getAllParents());
    }
}