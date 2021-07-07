package pl.wsiiz.patientservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wsiiz.patientservice.model.Examination;
import pl.wsiiz.patientservice.service.ExaminationService;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/examinations")
public class ExaminationController extends BaseController<Examination> {
    private final ExaminationService service;

    public ExaminationController(ExaminationService service) {
        this.service = service;
    }

    @Override
    public List<List<String>> list() {
        {
            functionsMap.put("Data", exam-> new SimpleDateFormat("dd-MM-yyy").format(exam.getDate()));
            functionsMap.put("Doktor", Examination::getDoctor);
            functionsMap.put("Opis", Examination::getDescription);
            return convertForListing(service.getAll(), functionsMap);
        }
    }
}
