package pl.wsiiz.patientservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiiz.patientservice.dto.Patient;
import pl.wsiiz.patientservice.entity.PatientEntity;
import pl.wsiiz.patientservice.jpa.PatientRepository;

import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient findbyId(long id) {
        Optional<PatientEntity> res = patientRepository.findById(id);
        if (res.isPresent()) {
            PatientEntity pat = res.get();
            return new Patient(pat.getFirstName(), pat.getLastName(), pat.getPesel());
        }
        return new Patient("None", "None", "None");
    }
}
