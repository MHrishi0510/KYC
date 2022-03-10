package com.amedea.kyc.model;

public class Agent {
	
	private Integer AgentId;
	private String AgentName;
	
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agent(Integer agentId, String agentName) {
		super();
		AgentId = agentId;
		AgentName = agentName;
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

	@Override
	public String toString() {
		return "Agent [AgentId=" + AgentId + ", AgentName=" + AgentName + "]";
	}
	
	
	
	

}
