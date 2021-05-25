package pl.wsiiz.patientservice.dto;

import java.util.Date;

public class Person {
    private String name;
    private String lastName;
    private String city;
    private String postalCode;
    private String street;
    private String telNumber;
    private String pesel;
    private String fathersName;
    private String mothersName;
    private Date dateOfBirth;

    //TODO:
    public int getWiek(){
        // wiek = obecny rok - rok urodzenia
        int wiek = 20;
        return wiek;
    }

    //TODO:
    public boolean checkPesel(){
        // 990512 .... 12.05.2021
        // dłudość pesel
        return true;
    }

    public Person(String pesel) {
        this.pesel = pesel;
    }

    public Person(String name, String lastName, String pesel) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
