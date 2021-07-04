package pl.wsiiz.patientservice.service;

import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import pl.wsiiz.patientservice.model.Drug;
import pl.wsiiz.patientservice.repository.DrugRepository;

import java.util.List;

@Service
public class DrugService {

    private final DrugRepository drugRepository;

    public DrugService(DrugRepository drugRepository) {
        this.drugRepository = drugRepository;
    }

    public List<Drug> getAll() {
        return Streamable.of(drugRepository.findAll()).toList();
    }

    public Drug getById(Long id) {
        return drugRepository.findById(id).orElse(null);
    }

    public Drug saveOrUpdate(Drug drug) {
        return drugRepository.getDrugsByNameEqualsAndManufacturerEquals(drug.getName(), drug.getManufacturer()).contains(drug) ? null : drugRepository.save(drug);
    }

    public Boolean delete(Long id) {
        drugRepository.delete(getById(id));
        return getById(id) == null;
    }
}
