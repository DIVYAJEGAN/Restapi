package com.example.project.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.User;
import com.example.project.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class UserController {
    @Autowired
    UserService projectService;

    @PostMapping("/postuser")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        try {
            
            if (user == null) {
                return ResponseEntity.badRequest().build();
            }            
            User addedUser = projectService.adduser(user);

            
            return ResponseEntity.status(HttpStatus.CREATED).body(addedUser);
        } catch (Exception e) {
            
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
   
    

    @GetMapping("/getuser")
    public List<User> getuser() {
        return projectService.getuser();
    }
    @GetMapping("/user/{email}")
    public User getuserbyid(@PathVariable String email) {
        return projectService.getUserByEmail(email);

    }

    @PutMapping("putuser/{userId}")
    public  User putuser(@PathVariable Long userId, @RequestBody User user) {
        //TODO: process PUT request
        
        return projectService.putuser(userId,user);
    }
    
    @DeleteMapping("/deleteuser/{userId}")
    public String deleteuser(@PathVariable Long userId)
    {
        return projectService.deleteuser(userId);
    }
    
}
