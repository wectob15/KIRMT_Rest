package com.kirmt.KIRMT_Rest.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class DeviceStatus implements Serializable {
    @Id
    private LocalDate statusDate;
    @Id
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
    @Id
    @ManyToOne
    @JoinColumn(name = "device_id")
    private Device device;

    private String progress;

    private String description;
}
