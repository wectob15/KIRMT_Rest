package com.kirmt.KIRMT_Rest.Entity;

import javax.persistence.*;

@Entity
@Table(name = "classresponsible")
public class ClassResponsible {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int cr_id;
    private String firstname;
    private String lastname;
    private String email;

    public ClassResponsible() {
    }

    public ClassResponsible(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getCr_id() {
        return cr_id;
    }

    public void setCr_id(int cr_id) {
        this.cr_id = cr_id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
