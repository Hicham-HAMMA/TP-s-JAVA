package cigma.pfe.services;

import cigma.pfe.models.Facture;

import java.util.Date;
import java.util.List;

public interface FactureService {
    Facture saveFacture(Facture f);
    Facture modifyFacture(Facture f);
    void removeFacture(long id);
    Facture getByIdFacture(long id);
    List<Facture> getAllFactureByDate(Date d);
    List<Facture> findAllFactures();
}
