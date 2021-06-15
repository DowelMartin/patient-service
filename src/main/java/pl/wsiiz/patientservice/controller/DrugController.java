package pl.wsiiz.patientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wsiiz.patientservice.model.Drug;
import pl.wsiiz.patientservice.service.DrugService;

import java.util.List;

@RestController
@RequestMapping("/drugs")
public class DrugController {
    private final DrugService service;

    public DrugController(DrugService service) {
        this.service = service;
    }

    @GetMapping
    public List<Drug> getAll() {
        return service.getAll();
    }
}
