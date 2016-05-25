package fr.s2re.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.assembleur.AssembleurDto;
import fr.s2re.dto.MethodeLivraisonDto;
import fr.s2re.ibusiness.IBusinessMethodeLivraison;
import fr.s2re.idao.IDaoMethodeLivraison;

@Remote(IBusinessMethodeLivraison.class)
@Stateless
public class BusinessMethodeLivraison implements IBusinessMethodeLivraison {
    @EJB
    private IDaoMethodeLivraison daoMethodeLivraison;

    @Override
    public List<MethodeLivraisonDto> getAll() {
        return AssembleurDto.listMethodeLivraisonDtoFromListMethodeLivraison(daoMethodeLivraison.getAll());
    }

    @Override
    public MethodeLivraisonDto getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}