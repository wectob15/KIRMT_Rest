package com.kirmt.KIRMT_Rest.Entity;

import lombok.*;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "dbuser")
@DiscriminatorColumn(name = "typ", discriminatorType = DiscriminatorType.STRING)
public abstract class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	private String username;
	private String password;
	private String email;

	@Column(name = "typ", insertable = false, updatable = false)
	private String typ;
}
