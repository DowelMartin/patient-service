package pl.wsiiz.patientservice.service;

import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import pl.wsiiz.patientservice.model.Examination;
import pl.wsiiz.patientservice.repository.ExaminationRepository;

import java.util.List;

@Service
public class ExaminationService{

    private final ExaminationRepository examinationRepository;

    public ExaminationService(ExaminationRepository examinationRepository) {
        this.examinationRepository = examinationRepository;
    }
    public List<Examination> getAll() {
        return  Streamable.of(examinationRepository.findAll()).toList();
    }

}
