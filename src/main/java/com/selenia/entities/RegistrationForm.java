package com.selenia.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class RegistrationForm {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="firstname")
	private String first_name;
	
	@Column(name="lastname")
	private String last_name;
	
	@Column(name="mail")
	private String email;
	
	@Column(name="pass")
	private String password;
	
	@Column(name="rep_pass")
	private String repeat_password;
	
	@Column(name="createdOn")
	private Timestamp created_on;
	
	@Column(name="updatedOn")
	private Timestamp updated_on;
	
	@Column(name="createdBy")
	private String created_by;
	
	@Column(name="updatedBy")
	private String updated_by;
	
	@Column(name="mobile")
	private long mobile;

	
	public RegistrationForm(){	
	}
	
	
	public RegistrationForm(String first_name, String last_name,String email, String password,String repeat_password,long mobile) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.repeat_password = repeat_password;
		this.created_on = created_on;
		this.updated_on = updated_on;
		this.created_by = created_by;
		this.updated_by = updated_by;
		this.mobile = mobile;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepeat_password() {
		return repeat_password;
	}

	public void setRepeat_password(String repeat_password) {
		this.repeat_password = repeat_password;
	}

	public Timestamp getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}

	public Timestamp getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(Timestamp updated_on) {
		this.updated_on = updated_on;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
	
	
}
