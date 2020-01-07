package com.kirmt.KIRMT_Rest.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "classresponsible")
public class ClassResponsible implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String firstname;
    private String lastname;

    public ClassResponsible() {
    }

    public ClassResponsible(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
