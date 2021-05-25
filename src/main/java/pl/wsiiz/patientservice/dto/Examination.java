package pl.wsiiz.patientservice.dto;

import java.util.Date;

public class Examination {
    private Date date;
    private String description;
    private String type;
    private Person doctor;
    private String examinationPlace;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Person getDoctor() {
        return doctor;
    }

    public void setDoctor(Person doctor) {
        this.doctor = doctor;
    }

    public String getExaminationPlace() {
        return examinationPlace;
    }

    public void setExaminationPlace(String examinationPlace) {
        this.examinationPlace = examinationPlace;
    }
}
