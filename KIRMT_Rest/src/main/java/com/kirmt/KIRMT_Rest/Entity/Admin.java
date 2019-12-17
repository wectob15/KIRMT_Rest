package com.kirmt.KIRMT_Rest.Entity;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int admin_id;
    private String firstname;

}
