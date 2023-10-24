package com.adm.usersmanager.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.adm.usersmanager.model.User;
import com.adm.usersmanager.repository.UserRepository;

@Controller
@RequestMapping("/")
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ModelAndView listUsers() {
        ModelAndView modelAndView = new ModelAndView("users.html");

        List<User> users = userRepository.findAll();
        modelAndView.addObject("users", users);

        return modelAndView;
    }    
}