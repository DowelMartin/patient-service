package pl.wsiiz.patientservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wsiiz.patientservice.model.Examination;
import pl.wsiiz.patientservice.model.Referral;
import pl.wsiiz.patientservice.service.ExaminationService;
import pl.wsiiz.patientservice.service.ReferralService;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/referrals")
public class ReferralController extends BaseController<Referral> {
    private final ReferralService service;

    public ReferralController(ReferralService service) {
        this.service = service;
    }

    @Override
    public List<List<String>> list() {
        {
            functionsMap.put("Data wygasniecia", s -> new SimpleDateFormat("dd-MM-yyy").format(s.getExpirationDate()));
            functionsMap.put("Doktor", Referral::getDoctor);
            functionsMap.put("Nazwa badania", Referral::getExaminationName);
            return convertForListing(service.getAll(), functionsMap);
        }
    }
}
