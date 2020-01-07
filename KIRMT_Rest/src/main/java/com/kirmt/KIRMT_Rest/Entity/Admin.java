package com.kirmt.KIRMT_Rest.Entity;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @OneToOne
    private User admin_id;
    private String firstname;
    private String lastname;

    public Admin() {
    }

    public Admin(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public User getUser_id() {
        return admin_id;
    }

    public void setUser_id(User admin_id) {
        this.admin_id = admin_id;
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
