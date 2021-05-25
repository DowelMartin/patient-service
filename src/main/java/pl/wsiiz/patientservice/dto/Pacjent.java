package pl.wsiiz.patientservice.dto;

import java.util.List;

public class Pacjent extends Person {
    private int ID;
    private Person lekarzRodzinny;
    private List<Prescription> recepty;
    private List<Drug> leki;
    private List<Examination> badania;
    private List<Referral> skierowania;

    public Pacjent(String pesel) {
        super(pesel);
    }

    public Pacjent(String imie, String nazwisko, String pesel) {
        super(imie, nazwisko, pesel);
    }
}
