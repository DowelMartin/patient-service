package pl.wsiiz.patientservice.service;

import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import pl.wsiiz.patientservice.model.Examination;
import pl.wsiiz.patientservice.model.Referral;
import pl.wsiiz.patientservice.repository.ExaminationRepository;
import pl.wsiiz.patientservice.repository.ReferralRepository;

import java.util.List;

@Service
public class ReferralService {

    private final ReferralRepository referralRepository;

    public ReferralService(ReferralRepository referralRepository) {
        this.referralRepository = referralRepository;
    }
    public List<Referral> getAll() {
        return  Streamable.of(referralRepository.findAll()).toList();
    }

}
