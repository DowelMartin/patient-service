package pl.wsiiz.patientservice.model;

import java.util.Date;
import java.util.List;

public class Prescription {
    private static int daysToExpiry =90;
    private Date releaseDate;
    private List<Drug> drugList;
    private double price;

    //TODO:
    public boolean checkWaznosc(){
        // roznica pomiedzy wystawieniem a dzies <ileWazna
        return true;
    }
}
