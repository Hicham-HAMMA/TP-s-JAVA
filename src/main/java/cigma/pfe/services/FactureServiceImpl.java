package cigma.pfe.services;

import cigma.pfe.models.Facture;
import cigma.pfe.repositories.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class FactureServiceImpl implements FactureService {

    @Autowired
    private FactureRepository factureRepository;

    @Transactional
    @Override
    public Facture saveFacture(Facture f) {
        return factureRepository.save(f);
    }

    @Transactional
    @Override
    public Facture modifyFacture(Facture fn) {
        Facture fold = factureRepository.findById(fn.getId()).get();
        fold.setAmount(fn.getAmount());
        fold.setDate(fn.getDate());
        return factureRepository.save(fold);
    }

    @Override
    public void removeFacture(long id) {
        factureRepository.deleteById(id);
    }


    @Override
    public Facture getByIdFacture(long id) {
        return factureRepository.findById(id).get();
    }

    @Override
    public List<Facture> getAllFactureByDate(Date d) {
        return factureRepository.getFactureByDate(d);
    }

    public List<Facture> findAllFactures() {
        return (List<Facture>) factureRepository.findAll();
    }

}
