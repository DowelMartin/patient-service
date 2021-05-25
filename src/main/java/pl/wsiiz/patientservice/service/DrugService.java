package pl.wsiiz.patientservice.service;

import org.springframework.stereotype.Service;
import pl.wsiiz.patientservice.dto.Drug;

@Service
public class DrugService {
    private Drug[] drugs = {new Drug("Ibuprom","Sanofi"),
            new Drug("szczepionka","Astra"),
            new Drug("Paracetamol","Polfa")};

    public Drug findDrug(String name){
        for(Drug drug: drugs)
        {
            if(drug.getName().equals(name))
            {
                return drug;
            }
        }
        return new Drug(name); //Throw new exception
    }
}
