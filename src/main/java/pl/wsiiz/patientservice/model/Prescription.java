package pl.wsiiz.patientservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Prescription {
    @Id
    @GeneratedValue
    private Long id;
    private static int daysToExpiry =90;
    private Date releaseDate;
    private double price;

    public Prescription() {
    }

    public Long getId() {
        return id;
    }

    public int getDaysToExpiry() {
        return daysToExpiry;
    }

    public void setDaysToExpiry(int daysToExpiry) {
        Prescription.daysToExpiry = daysToExpiry;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
