package com.projectDeveloper.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.projectDeveloper.app.modal.UserDAO;
import com.projectDeveloper.app.repository.UserReponsitory;

@Service
public class UserService {
	@Autowired
	private UserReponsitory reponsitory;
	
	
	public void profileUpdate(UserDAO user, MultipartFile multipartFile) {
		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        user.setPhoto(fileName);
		reponsitory.save(user);
	}
}
