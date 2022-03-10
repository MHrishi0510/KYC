package com.amedea.kyc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.amedea.kyc.constants.KycConstants;
import com.amedea.kyc.model.Client;
import com.amedea.kyc.service.ClientService;

@RestController
@CrossOrigin
public class WelcomeController {

	@Autowired
	private ClientService service;

	@GetMapping(value = KycConstants.WELCOME_URL)
	public String WelcomeMessage() {
		return KycConstants.WELCOME_MESSAGE;
	}

	@GetMapping(value = KycConstants.GET_CLIENT)
	public List<Client> getClients() {

		return service.getClientList();
	}
	
	

}
