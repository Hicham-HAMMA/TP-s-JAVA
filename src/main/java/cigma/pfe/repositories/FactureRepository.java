package cigma.pfe.repositories;


import cigma.pfe.models.Facture;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface FactureRepository extends CrudRepository<Facture,Long> {
        List<Facture> getFactureByDate(Date d);
    }

