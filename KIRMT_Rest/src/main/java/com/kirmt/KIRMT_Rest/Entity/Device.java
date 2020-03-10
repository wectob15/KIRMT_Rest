package com.kirmt.KIRMT_Rest.Entity;


import com.kirmt.KIRMT_Rest.Converter.LocalDateConverter;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "device")
public class Device implements Serializable {
    @Id
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

    @Transient
    private int classroom_id;
}
