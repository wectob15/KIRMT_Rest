package com.kirmt.KIRMT_Rest.Entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "device")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int inventar_nr;
    private String beschreibung;
    private String category;
    private double price;
    private LocalDate acquisitionDate;
    private LocalDate serviceDate;

    public int getInventar_nr() {
        return inventar_nr;
    }

    public void setInventar_nr(int inventar_nr) {
        this.inventar_nr = inventar_nr;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(LocalDate acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }
}
