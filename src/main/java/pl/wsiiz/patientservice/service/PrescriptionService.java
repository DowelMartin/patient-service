package pl.wsiiz.patientservice.service;

import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import pl.wsiiz.patientservice.model.Examination;
import pl.wsiiz.patientservice.model.Prescription;
import pl.wsiiz.patientservice.repository.ExaminationRepository;
import pl.wsiiz.patientservice.repository.PrescriptionRepository;

import java.util.List;

@Service
public class PrescriptionService {

    private final PrescriptionRepository prescriptionRepository;

    public PrescriptionService(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }
    public List<Prescription> getAll() {
        return  Streamable.of(prescriptionRepository.findAll()).toList();
    }

}
