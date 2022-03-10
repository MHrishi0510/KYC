package com.amedea.kyc.model;

public class Agent {
	
	private Integer AgentId;
	private String AgentName;
	private String AgentCity;
	private String AgentPhoneNo;
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Agent(Integer agentId, String agentName, String agentCity, String agentPhoneNo) {
		super();
		AgentId = agentId;
		AgentName = agentName;
		AgentCity = agentCity;
		AgentPhoneNo = agentPhoneNo;
	}


	public Integer getAgentId() {
		return AgentId;
	}


	public void setAgentId(Integer agentId) {
		AgentId = agentId;
	}


	public String getAgentName() {
		return AgentName;
	}


	public void setAgentName(String agentName) {
		AgentName = agentName;
	}


	public String getAgentCity() {
		return AgentCity;
	}


	public void setAgentCity(String agentCity) {
		AgentCity = agentCity;
	}


	public String getAgentPhoneNo() {
		return AgentPhoneNo;
	}


	public void setAgentPhoneNo(String agentPhoneNo) {
		AgentPhoneNo = agentPhoneNo;
	}


	@Override
	public String toString() {
		return "Agent [AgentId=" + AgentId + ", AgentName=" + AgentName + ", AgentCity=" + AgentCity + ", AgentPhoneNo="
				+ AgentPhoneNo + "]";
	}
	
	
}