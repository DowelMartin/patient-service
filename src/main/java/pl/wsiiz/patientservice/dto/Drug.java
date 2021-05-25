package pl.wsiiz.patientservice.dto;

public class Drug {
    private String name;
    private double price;
    private boolean prescriptionNeeded;
    private String manufacturer;

    public Drug() {
    }

    public Drug(String name) {
        this.name = name;
    }

    public Drug(String name, double price, boolean prescriptionNeeded, String manufacturer) {
        this.name = name;
        this.price = price;
        this.prescriptionNeeded = prescriptionNeeded;
        this.manufacturer = manufacturer;
    }

    public Drug(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPrescriptionNeeded() {
        return prescriptionNeeded;
    }

    public void setPrescriptionNeeded(boolean prescriptionNeeded) {
        this.prescriptionNeeded = prescriptionNeeded;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
