package com.kirmt.KIRMT_Rest.Entity;

import javax.persistence.*;

@Entity
@Table(name = "class_responsible")
public class ClassResponsible {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int cr_id;
    private String firstname;
    private String lastname;
    private String email;

    public ClassResponsible() {
    }

    public ClassResponsible(String firstname, ) {
    }
}
