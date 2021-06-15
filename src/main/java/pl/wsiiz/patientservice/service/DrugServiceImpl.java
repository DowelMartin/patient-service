package pl.wsiiz.patientservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import pl.wsiiz.patientservice.model.Drug;
import pl.wsiiz.patientservice.repository.DrugRepository;

import java.util.Arrays;
import java.util.List;

@Service
public class DrugServiceImpl implements DrugService {

    private final DrugRepository drugRepository;

    public DrugServiceImpl(DrugRepository drugRepository) {
        this.drugRepository = drugRepository;
    }

    @Override
    public List<Drug> getAll() {
        return  Streamable.of(drugRepository.findAll()).toList();
    }

    @Override
    public Drug getById(Long id) {
        return drugRepository.findById(id).orElse(null);
    }

    @Override
    public Drug saveOrUpdate(Drug drug) {
        return drugRepository.save(drug);
    }

    @Override
    public Boolean delete(Long id) {
        drugRepository.delete(getById(id));
        return getById(id)==null;
    }
}
