package pl.wsiiz.patientservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wsiiz.patientservice.model.Examination;
import pl.wsiiz.patientservice.service.ExaminationService;

import java.util.List;

@Controller
@RequestMapping("/referrals")
public class ReferralController extends BaseController<Examination> {
    private final ExaminationService service;

    public ReferralController(ExaminationService service) {
        this.service = service;
    }

    @Override
    public List<List<String>> list() {
        {
            functionsMap.put("Data", exam->exam.getDate().toString());
            functionsMap.put("Doktor", Examination::getDoctor);
            functionsMap.put("Opis", Examination::getDescription);
            return convertForListing(service.getAll(), functionsMap);
        }
    }
}
