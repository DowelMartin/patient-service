package pl.wsiiz.patientservice.service;

import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import pl.wsiiz.patientservice.model.Examination;
import pl.wsiiz.patientservice.model.Patient;
import pl.wsiiz.patientservice.repository.ExaminationRepository;
import pl.wsiiz.patientservice.repository.PatientRepository;

import java.awt.*;
import java.util.List;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    public List<Patient> getAll() {
        return  Streamable.of(patientRepository.findAll()).toList();
    }

}
