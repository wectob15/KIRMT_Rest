package com.kirmt.KIRMT_Rest.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "classroom")
public class Classroom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int classroom_id;
    private String classname;
    private String floor;

    @Transient
    private int user_id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
