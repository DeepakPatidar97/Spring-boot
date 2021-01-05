package com.projectDeveloper.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.projectDeveloper.app.modal.UserDAO;
import com.projectDeveloper.app.service.RegisterService;

@RestController
public class RegisterController {
	@Autowired
	private RegisterService service;
	
		@RequestMapping(value = "/register")
	public ModelAndView userRegister(@RequestParam(value = "name") String name, @RequestParam(value = "email") String email,
			@RequestParam(value = "mobile") String mobile, @RequestParam(value = "password") String password) {
		UserDAO user = new UserDAO();
		user.setName(name);
		user.setEmail(email);
		user.setMobile(mobile);
		user.setPassword(password);
		service.userRegister(user); 
		return new ModelAndView("login"); 
				 
	}
}
