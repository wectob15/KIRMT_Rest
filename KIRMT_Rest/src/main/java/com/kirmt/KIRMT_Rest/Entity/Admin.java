package com.kirmt.KIRMT_Rest.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Admin extends User {
    private String firstname;
    private String lastname;

    public Admin() {
    }

    public Admin(String firstname, String lastname, String email, String username, String password){
        super(username, password, email);
        this.lastname = lastname;
        this.firstname = firstname;
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
