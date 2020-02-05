package com.kirmt.KIRMT_Rest.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
