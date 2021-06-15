package pl.wsiiz.patientservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wsiiz.patientservice.model.Drug;

@Repository
public interface DrugRepository extends CrudRepository<Drug, Long> {
}
