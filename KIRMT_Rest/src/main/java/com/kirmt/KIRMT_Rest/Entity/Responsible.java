package com.kirmt.KIRMT_Rest.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@DiscriminatorValue("Responsible")
public class Responsible extends User {
    private String classname;
}
