package pl.wsiiz.patientservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
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

    @GetMapping(path="/id")
    @ResponseBody
    public Drug drugId(@RequestParam Long id) {

        return service.getById(id);
    }

    @RequestMapping(value = "/addDrug", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("form", "drug", new Drug());
    }

    @RequestMapping(value = "/newDrug", method = RequestMethod.POST)
    public String submit(@Validated @ModelAttribute("drug")Drug drug,
                         BindingResult result, ModelMap model) {
        model.addAttribute("name", drug.getName());
        model.addAttribute("price", drug.getPrice());
        model.addAttribute("prescriptionNeeded", drug.isPrescriptionNeeded());
        model.addAttribute("manufacturer", drug.getManufacturer());
        service.saveOrUpdate(drug);
        return "newItem";
    }
}
