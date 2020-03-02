package com.kirmt.KIRMT_Rest.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Status {
    @Id
    @GeneratedValue
    private int statusid;
    private String statusname;

    @OneToMany(mappedBy = "status")
    private List<DeviceStatus> deviceStatusList;
}
