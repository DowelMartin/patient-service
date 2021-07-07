package pl.wsiiz.patientservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wsiiz.patientservice.model.Examination;
import pl.wsiiz.patientservice.model.Patient;
import pl.wsiiz.patientservice.service.ExaminationService;
import pl.wsiiz.patientservice.service.PatientService;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController extends BaseController<Patient> {
    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @Override
    public List<List<String>> list() {
        {
            functionsMap.put("Imię", Patient::getName);
            functionsMap.put("Nazwisko", Patient::getLastName);
            functionsMap.put("Pesel", Patient::getPesel);
            functionsMap.put("Miasto", Patient::getCity);
            functionsMap.put("Lekarz rodzinny", Patient::getFamilyDoctor);
            return convertForListing(service.getAll(), functionsMap);
        }
    }
}
