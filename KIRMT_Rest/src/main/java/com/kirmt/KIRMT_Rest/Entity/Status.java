package com.kirmt.KIRMT_Rest.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Status implements Serializable {
    @Id
    @GeneratedValue
    private int statusid;
    private String statusname;

}
