package com.classroom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroom.dao.UserDao;
import com.classroom.modal.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public User createUser(User user) {
		return userDao.save(user);
	}

	public User updateUser(User user) {
		return userDao.update(user);
	}

	public User getUserById(String USN) {
		return userDao.findById(USN);
	}

	public User deleteUser(User user) {
		return userDao.deleteById(user);
	}

}
