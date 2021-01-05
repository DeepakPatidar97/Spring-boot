package com.projectDeveloper.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectDeveloper.app.modal.UserDAO;
import com.projectDeveloper.app.repository.UserReponsitory;

@Service
public class LoginService {

	@Autowired
	private UserReponsitory reponsitory;

	public UserDAO userLogin(String email, String password) {
		return reponsitory.findByEmailAndPassword(email,password);
	}
}
