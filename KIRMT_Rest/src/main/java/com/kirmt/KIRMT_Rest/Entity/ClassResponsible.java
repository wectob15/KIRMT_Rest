package com.kirmt.KIRMT_Rest.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ClassResponsible extends User {
    private String classname;

    public ClassResponsible() {
    }

    public ClassResponsible(String username, String password, String email) {
        super(username, password, email);
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
