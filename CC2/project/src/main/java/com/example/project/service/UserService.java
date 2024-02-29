package com.example.project.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.User;
import com.example.project.repository.UserRepo;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
     
    public User adduser(User user)
    {
        return userRepo.save(user);
    }
    public List<User> getuser()
    {
        return userRepo.findAll();
    }
    public User getUserByEmail(String email)
    {
        User user=userRepo.getUserByEmail(email);
        return user;
    }
    public User putuser(Long userId,User user)
	{
		User userAvail=userRepo.findById(userId).orElse(null);
		if(userAvail!=null)
        {
            userAvail.setEmail(user.getEmail());
            userAvail.setFname(user.getFname());
            userAvail.setPassword(user.getPassword());
            return userRepo.saveAndFlush(userAvail);
        }
        else
        return null;
	}
    public String deleteuser(Long userId)
    {
        userRepo.deleteById(userId);
        return("userdeleted");
    }
}
