package cigma.pfe.controllers;

import cigma.pfe.models.Facture;
import cigma.pfe.services.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller("fctrl")
public class FactureController {

    @Autowired
    FactureService factureService;

    public Facture saveFacture(Facture f){
        return factureService.saveFacture(f);
    }

    public void modifierFacture(Facture f){
        factureService.saveFacture(f);
    }
    public void deleteFacture(long id){
        factureService.removeFacture(id);
    }

    public Facture getFacturebyId(long id){
        return factureService.getByIdFacture(id);
    }

    public List<Facture> getAllFactures(Date date){
        return factureService.getAllFactureByDate(date);
    }
    public List<Facture> findAllFactures(){
        return factureService.findAllFactures();
    }


}