package cigma.pfe.services;

import cigma.pfe.models.Facture;
import cigma.pfe.repositories.FactureRepository;

import java.util.List;

public class FactureServiceImpl implements FactureService{

    FactureRepository factureRepository;
    public Facture create(Facture f) {
        return factureRepository.create(f);
    }
    public List<Facture> read() {
        return factureRepository.read();
    }
    public void delete(long id) {
        factureRepository.deleteFactureById(id);
    }
    public Facture update(Facture f) {
        return factureRepository.update(f);
    }
}
