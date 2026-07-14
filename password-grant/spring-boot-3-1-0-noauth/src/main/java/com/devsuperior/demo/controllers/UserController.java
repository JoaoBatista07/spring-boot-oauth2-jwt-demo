package com.devsuperior.demo.controllers;

import com.devsuperior.demo.entities.User;
import com.devsuperior.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {


    @Autowired
    private UserService service;

    @GetMapping("/{email}")
    public ResponseEntity<User> getUsers(@PathVariable String email){

        User user = service.loadUserByUsername("alex@gmail.com");

        return ResponseEntity.ok(user);
    }

}
