package pl.wsiiz.patientservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wsiiz.patientservice.model.Drug;
import pl.wsiiz.patientservice.model.Prescription;

@Repository
public interface PrescriptionRepository extends CrudRepository<Prescription, Long> {
}
