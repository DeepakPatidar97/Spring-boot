package com.projectDeveloper.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectDeveloper.app.modal.UserDAO;

public interface UserReponsitory extends JpaRepository<UserDAO, Integer> {
	UserDAO findByEmailAndPassword(String email,String password);
}
