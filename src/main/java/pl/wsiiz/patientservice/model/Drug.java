package pl.wsiiz.patientservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Boolean prescriptionNeeded;
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

    public Long getId() {
        return id;
    }

    public Boolean getPrescriptionNeeded() {
        return prescriptionNeeded;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drug drug = (Drug) o;
        return name.equals(drug.name) && price.equals(drug.price) && prescriptionNeeded.equals(drug.prescriptionNeeded) && manufacturer.equals(drug.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, prescriptionNeeded, manufacturer);
    }
}
