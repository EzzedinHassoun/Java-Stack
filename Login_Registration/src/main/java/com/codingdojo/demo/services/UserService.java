package com.codingdojo.demo.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.demo.models.LoginUser;
import com.codingdojo.demo.models.User;
import com.codingdojo.demo.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public User createUser(User u) {
		return userRepository.save(u);
	}
	public User findUser(Long id) {
		Optional<User> optional = userRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null ;
				
	}
	
	public User register(User newUser, BindingResult result) {
        Optional<User> optional = userRepository.findByEmail(newUser.getEmail());
        if(optional.isPresent()) {
        	result.rejectValue("email","UNIQUE","Email  is already used");
        }
        String passwordEntered = newUser.getPassword();
        if(!passwordEntered.equals(newUser.getConfirmPassword())) {
        	 result.rejectValue("confirmPassword", "Matches", "The Confirm Password must match Password!");
        }
        if(result.hasErrors()) {
            return null;
        }
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashed);
       return userRepository.save(newUser);
        
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
        Optional<User> optional = userRepository.findByEmail(newLoginObject.getEmail());

    	
        if(!optional.isPresent()) {
        	result.rejectValue("email","NOTFOUND","Email is Not Found");
        	return null;
        }
        
        User user = optional.get();
        if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
            result.rejectValue("password", "Matches", "Invalid Password!");
        }

    
        if(result.hasErrors()) {
            return null;
        }
        

        return user;
    }
}
