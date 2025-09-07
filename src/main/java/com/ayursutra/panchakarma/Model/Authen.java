package com.ayursutra.panchakarma.Model;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Component
@Entity
public class Authen {
	@Id
	private	Integer userid;
	private	String email;
	private	String username;
	private	String password;
	private Boolean isdocter;
	
	public Authen() {
	}
	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Boolean getIsdocter() {
		return isdocter;
	}

	public void setIsdocter(Boolean isdocter) {
		this.isdocter = isdocter;
	}
	public Authen(Integer userid, String email, String username, String password, Boolean isdocter) {
		super();
		this.userid = userid;
		this.email = email;
		this.username = username;
		this.password = password;
		this.isdocter = isdocter;
	}
	@Override
	public String toString() {
		return "Authen [userid=" + userid + ", email=" + email + ", username=" + username + ", password=" + password
				+ ", isdocter=" + isdocter + "]";
	}
}
