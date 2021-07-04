package pl.wsiiz.patientservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wsiiz.patientservice.model.Examination;
import pl.wsiiz.patientservice.model.Prescription;
import pl.wsiiz.patientservice.service.ExaminationService;
import pl.wsiiz.patientservice.service.PrescriptionService;

import java.util.List;

@Controller
@RequestMapping("/prescriptions")
public class PrescriptionController extends BaseController<Prescription> {
    private final PrescriptionService service;

    public PrescriptionController(PrescriptionService service) {
        this.service = service;
    }

    @Override
    public List<List<String>> list() {
        {
            functionsMap.put("Data wydania", p->p.getReleaseDate().toString());
            functionsMap.put("Cena", p->String.valueOf(p.getPrice()));
            functionsMap.put("Dni to końca ważności", p->String.valueOf(p.getDaysToExpiry()));
            return convertForListing(service.getAll(), functionsMap);
        }
    }
}
