package pl.wsiiz.patientservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wsiiz.patientservice.model.Drug;
import pl.wsiiz.patientservice.service.DrugService;

import java.util.List;

@Controller
@RequestMapping("/drugs")
public class DrugController extends BaseController<Drug> {
    private final DrugService service;

    public DrugController(DrugService service) {
        this.service = service;
    }

    @Override
    public List<List<String>> list() {
        {
            functionsMap.put("Nazwa", Drug::getName);
            functionsMap.put("Cena", drug -> String.valueOf(drug.getPrice()));
            functionsMap.put("Producent", Drug::getManufacturer);
            functionsMap.put("Wymagana recepta", drug -> String.valueOf(drug.isPrescriptionNeeded()));
            return convertForListing(service.getAll(), functionsMap);
        }
    }
}
