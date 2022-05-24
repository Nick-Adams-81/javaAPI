package com.example.javaapi.Controllers;

import com.example.javaapi.Models.User;
import com.example.javaapi.Repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private UserRepository userDao;

    public UserController(UserRepository userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/")
    public String showUser(Model model) {
        model.addAttribute("user", new User());
        return "user";
    }


}
