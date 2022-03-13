package com.amedea.kyc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.amedea.kyc.model.User;

@Service
public class UserServiceImpl implements UserService {

	private List<User> userList;
	
	public UserServiceImpl(){
		
		userList = new ArrayList<>();
		User us1 = new User(101, "Vedika", "vedika09@redmail.com", "365298","Pune");
		User us2 = new User(102, "Priya", "priya35@redmail.com", "236598","Mumbai");
		User us3 = new User(103, "Amruta", "amruta25@redmail.com", "659874","Delhi");
		User us4 = new User(104,"Gudiya", "gudiya78@redmail.com", "985642","Nasik");
		User us5 = new User(105, "Swara", "swara52@redmail.com", "759842","Ratnagiri");
	
		userList.add(us1);
		userList.add(us2);
		userList.add(us3);
		userList.add(us4);
		userList.add(us5);
	
	
	}
	
	@Override
	public List<User> getUserList() {
		
		return userList;
	}

}
