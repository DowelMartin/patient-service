package pl.wsiiz.patientservice.model;

import java.util.Date;

public class Referral {
    private Date expirationDate;
    private Person doctor;
    private String examinationName;
    private Status statusReferral;
}
