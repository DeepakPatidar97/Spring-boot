package com.projectDeveloper.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectDeveloper.app.modal.UserDAO;
import com.projectDeveloper.app.repository.UserReponsitory;

@Service
public class RegisterService {
	
	@Autowired
	private UserReponsitory reponsitory;

	public String userRegister(UserDAO user) {
		String response;
		if(reponsitory.save(user)!=null) {
			response ="Succesfull added";
		}else {
			response ="somthing want wrong";
		}
		return response;
	}

}
