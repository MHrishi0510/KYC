package com.amedea.kyc.model;

public class User {

	private Integer UsertID;
	private String UserName;
	private String UserEmail;
	private String UserPhone;
	private String UserCity;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(Integer usertID, String userName, String userEmail, String userPhone, String userCity) {
		super();
		UsertID = usertID;
		UserName = userName;
		UserEmail = userEmail;
		UserPhone = userPhone;
		UserCity = userCity;
	}


	public Integer getUsertID() {
		return UsertID;
	}


	public void setUsertID(Integer usertID) {
		UsertID = usertID;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getUserEmail() {
		return UserEmail;
	}


	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}


	public String getUserPhone() {
		return UserPhone;
	}


	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	}


	public String getUserCity() {
		return UserCity;
	}


	public void setUserCity(String userCity) {
		UserCity = userCity;
	}


	@Override
	public String toString() {
		return "User [UsertID=" + UsertID + ", UserName=" + UserName + ", UserEmail=" + UserEmail + ", UserPhone="
				+ UserPhone + ", UserCity=" + UserCity + "]";
	}


	
	
}
