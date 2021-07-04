package pl.wsiiz.patientservice.api;

import org.springframework.web.bind.annotation.*;
import pl.wsiiz.patientservice.model.Drug;
import pl.wsiiz.patientservice.service.DrugService;

import java.util.List;

@RestController
@RequestMapping("/api/drugs")
public class DrugRestController {
    private final DrugService service;

    public DrugRestController(DrugService service) {
        this.service = service;
    }

    @GetMapping
    public List<Drug> getAll() {
        return service.getAll();
    }

    @PostMapping
    public void saveDrug(@RequestBody Drug newDrug){
        service.saveOrUpdate(newDrug);
    }
}