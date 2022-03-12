package com.amedea.kyc.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amedea.kyc.constants.KycConstants;
import com.amedea.kyc.service.UserService;
import com.amedea.kyc.model.User;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping(value = KycConstants.USER)
	public String WelcomeMessage() {
		return KycConstants.USER_MESSAGE;
	}
	
	@GetMapping (value= KycConstants.USER_DATA)
	public List<User> getUsers(){
		
		return service.getUserList();
	}
}
