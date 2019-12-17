package com.kirmt.KIRMT_Rest.Entity;

import com.kirmt.KIRMT_Rest.Converter.LocalDateConverter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "devicehistory")
public class Deviceservice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate serviceDate;

    @ManyToOne
    @JoinColumn(name = "device", nullable = false)
    private Device device;

}
