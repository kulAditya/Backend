package com.example.demo.entities;

public class LoginCheck {

	String emailid,pwd;

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public LoginCheck(String emailid, String pwd) {
		super();
		this.emailid = emailid;
		this.pwd = pwd;
	}

	
}
