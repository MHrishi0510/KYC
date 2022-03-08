package com.amedea.kyc.model;

public class Client {

	private Integer ClientID;
	private String ClientName;
	private String ClientCity;

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(Integer clientID, String clientName, String clientCity) {
		super();
		ClientID = clientID;
		ClientName = clientName;
		ClientCity = clientCity;
	}

	public Integer getClientID() {
		return ClientID;
	}

	public void setClientID(Integer clientID) {
		ClientID = clientID;
	}

	public String getClientName() {
		return ClientName;
	}

	public void setClientName(String clientName) {
		ClientName = clientName;
	}

	public String getClientCity() {
		return ClientCity;
	}

	public void setClientCity(String clientCity) {
		ClientCity = clientCity;
	}

	@Override
	public String toString() {
		return "Client [ClientID=" + ClientID + ", ClientName=" + ClientName + ", ClientCity=" + ClientCity + "]";
	}
	
	
}
