package com.example.demo.services;

import java.util.List;


import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	  @Autowired
	  public UserRepository userRepository;
	  
	  public User addUser(User user) {
	        return userRepository.save(user);
	    }

	    public User updateUser(User user) {
	        return userRepository.save(user);
	    }

	    public void deleteUser(int id) {
	        userRepository.deleteById(id);
	    }

	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }
	    
	    public User getUserById(int id) {
	        return userRepository.findById(id).orElse(null);
	    }
    
}  
    
    
   