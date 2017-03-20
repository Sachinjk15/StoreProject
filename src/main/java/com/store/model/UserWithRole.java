package com.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="user")
public class UserWithRole {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue
	private Long id;
	
	
	@Column(name="user_name")
	@NotEmpty
	private String name;
	
	
	@Column(name="user_email")
	@NotEmpty
	private String email;
	

	@Column(name="user_phone")
	@NotEmpty
	private String phone;
	

	@Column(name="user_pwd")
	@NotEmpty
	private String password;
	
	@Column(name="user_role")
	@NotEmpty
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}