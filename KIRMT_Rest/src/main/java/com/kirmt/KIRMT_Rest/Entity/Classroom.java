package com.kirmt.KIRMT_Rest.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "classroom")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int classroom_id;
    private String classname;
    private String floor;

    @OneToMany(mappedBy = "classroom")
    private Set<Device> devices;

    @OneToOne
    private ClassResponsible classresponsible;

    public Classroom() {
    }

    public Classroom(String classname, String floor) {
        this.classname = classname;
        this.floor = floor;
    }


    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getClassroom_id() {
        return classroom_id;
    }

    public void setClassroom_id(int classroom_id) {
        this.classroom_id = classroom_id;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}
