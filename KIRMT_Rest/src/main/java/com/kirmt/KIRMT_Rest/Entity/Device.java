package com.kirmt.KIRMT_Rest.Entity;


import com.kirmt.KIRMT_Rest.Converter.LocalDateConverter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "device")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long inventar_nr;
    private String description;
    private String category;
    private String status;
    private String brand;
    private String model;
    private double price;

    @Convert(converter = LocalDateConverter.class)
    private LocalDate acquisitionDate;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    @OneToMany(mappedBy = "device")
    private List<Deviceservice> services = new ArrayList<>();

    public Device() {
    }

    public List<Deviceservice> getServices() {
        return services;
    }

    public void setServices(List<Deviceservice> services) {
        this.services = services;
    }

    public Device(String description, String category, String status, String brand, double price, LocalDate acquisitionDate) {
        this.description = description;
        this.category = category;
        this.status = status;
        this.brand = brand;
        this.price = price;
        this.acquisitionDate = acquisitionDate;
    }

    public long getInventar_nr() {
        return inventar_nr;
    }

    public void setInventar_nr(long inventar_nr) {
        this.inventar_nr = inventar_nr;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
