package com.telly.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="users")
public class User implements Serializable {


	private static final long serialVersionUID = 5362437768854142524L;


	@Id
	@Column(name = "username")
	private String username;

	@NotBlank()
	@Size(min = 8, max = 15, groups = {FormValidationGroup.class})
	private String password;

	private String email;

	private boolean enabled = false;
	private String authority;


	public User() {

	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", enabled=" + enabled
				+ ", authority=" + authority + "]";
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}