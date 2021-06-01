package pl.wsiiz.patientservice.jpa;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import pl.wsiiz.patientservice.entity.PatientEntity;

public interface PatientRepository extends CrudRepository<PatientEntity, Long>{
}
