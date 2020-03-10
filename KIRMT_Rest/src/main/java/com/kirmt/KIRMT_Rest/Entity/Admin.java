package com.kirmt.KIRMT_Rest.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
@DiscriminatorValue("Admin")
public class Admin extends User {
    private String firstname;
    private String lastname;
}
