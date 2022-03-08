package com.amedea.kyc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.amedea.kyc.constants.KycConstants;
import com.amedea.kyc.model.Client;

@RestController
@CrossOrigin
public class WelcomeController {

	@GetMapping(value = KycConstants.WELCOME_URL)
	public String WelcomeMessage() {
		return KycConstants.WELCOME_MESSAGE;
	}
	
	@GetMapping(value = KycConstants.GET_CLIENT)
	public List<Client> getClients() {
		List<Client> clientList = new ArrayList<>();
		Client cc=new Client();
		cc.setClientID(1);
		cc.setClientName("Dominos");
		cc.setClientCity("Pune");
		clientList.add(cc);
		return clientList;
	}
}
