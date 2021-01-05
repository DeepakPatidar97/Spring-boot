package com.projectDeveloper.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.projectDeveloper.app.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView userLogin(@RequestParam(value = "email") String email,@RequestParam(value = "password")String password) {
		ModelAndView view = new ModelAndView();
		if(service.userLogin(email, password)!=null) {
			view.setViewName("home");
		}else {
			view.setViewName("register");
		}
		return view;
	}
}
