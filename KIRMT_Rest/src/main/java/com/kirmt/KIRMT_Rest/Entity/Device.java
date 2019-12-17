package com.kirmt.KIRMT_Rest.Entity;


import com.kirmt.KIRMT_Rest.Converter.LocalDateConverter;

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
    private String status;
    private String brand;
    private String model;
    private double price;
    @Convert(converter = LocalDateConverter.class)
    private LocalDate acquisitionDate;



    public Device() {
    }

    public Device(String beschreibung, String category, String status, String brand, double price, LocalDate acquisitionDate) {
        this.beschreibung = beschreibung;
        this.category = category;
        this.status = status;
        this.brand = brand;
        this.price = price;
        this.acquisitionDate = acquisitionDate;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
