package com.verizon.wallet;

public class RegisteredUser {
	
	Integer userId;

	String fullName;

	String userName;

	String pwd;

	public RegisteredUser() {

	}

	public RegisteredUser(String fullName, String userName, String pwd) {

	this.fullName = fullName;

	this.userName = userName;

	this.pwd = pwd;

	}

	public Integer getUserId() {

	return userId;

	}

	public void setUserId(Integer userId) {

	this.userId = userId;

	}

	public String getFullName() {

	return fullName;

	}

	public void setFullName(String fullName) {

	this.fullName = fullName;

	}

	public String getUserName() {

	return userName;

	}

	public void setUserName(String userName) {

	this.userName = userName;

	}

	public String getPwd() {

	return pwd;

	}

	public void setPwd(String pwd) {

	this.pwd = pwd;

	}

	@Override

	public String toString() {

	return "RegisteredUser [userid=" + userId + ", fullName=" + fullName + ", userName=" + userName + ", pwd=" + pwd

	+ "]";

	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
