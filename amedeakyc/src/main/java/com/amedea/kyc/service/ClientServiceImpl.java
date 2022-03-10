package com.amedea.kyc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.amedea.kyc.model.Client;

@Service
public class ClientServiceImpl implements ClientService {

	private List<Client> clientList;

	public ClientServiceImpl() {
		clientList = new ArrayList<>();
		Client cc1 = new Client(1, "Dominos", "Pune");
		Client cc2 = new Client(2, "KFC", "Pune");
		Client cc3 = new Client(3, "Pizzahut", "Mumbai");
		Client cc4 = new Client(4, "Varan-Bhat", "pune");

		clientList.add(cc1);
		clientList.add(cc2);
		clientList.add(cc3);
		clientList.add(cc4);
	}

	@Override
	public List<Client> getClientList() {
		return clientList;
	}

}
