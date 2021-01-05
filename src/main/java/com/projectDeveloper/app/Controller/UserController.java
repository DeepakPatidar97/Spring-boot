package com.projectDeveloper.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.projectDeveloper.app.modal.UserDAO;
import com.projectDeveloper.app.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/profileUpdate" , method = RequestMethod.POST)
	public ModelAndView profileUpdate(@RequestBody UserDAO user, @RequestParam("userimage") MultipartFile multipartFile) {
		ModelAndView view = new ModelAndView("home.html");
		service.profileUpdate(user,multipartFile);
		return view;
	}
}
