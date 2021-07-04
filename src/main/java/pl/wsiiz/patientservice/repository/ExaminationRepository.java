package pl.wsiiz.patientservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wsiiz.patientservice.model.Drug;
import pl.wsiiz.patientservice.model.Examination;

@Repository
public interface ExaminationRepository extends CrudRepository<Examination, Long> {
}
