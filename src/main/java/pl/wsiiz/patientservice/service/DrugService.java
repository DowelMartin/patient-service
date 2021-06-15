package pl.wsiiz.patientservice.service;

import pl.wsiiz.patientservice.model.Drug;

import java.util.List;

public interface DrugService {
    public List<Drug> getAll();
    public Drug getById(Long id);
    public Drug saveOrUpdate(Drug drug);
    public Boolean delete(Long id);
}
