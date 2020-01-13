package com.kirmt.KIRMT_Rest.Entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "dbuser")
public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	private String username;
	private String password;
	private String email;

	public User() {
	}

	public User(String username, String password, String email){
		this.email = email;
		this.password = password;
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUser_id() { return user_id; }
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
