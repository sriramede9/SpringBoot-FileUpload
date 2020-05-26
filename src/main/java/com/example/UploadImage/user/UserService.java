package com.example.UploadImage.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private	UserRepository userRepository;
	
	public void saveUser(User u) {
		userRepository.save(u);
	
	}
	
	public User getUser(int id) {
	return	userRepository.getOne(id);
	}
}
       