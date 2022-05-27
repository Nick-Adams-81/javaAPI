package com.example.javaapi.Controllers;

import com.example.javaapi.Models.User;
import com.example.javaapi.Repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    private UserRepository userDao;

    public UserController(UserRepository userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/")
    public String showUser(Model model) {
        model.addAttribute("user", new User());
        return "users";
    }

    @PostMapping("/")
    public String saveUser(@ModelAttribute User user) {
        userDao.save(user);
        return "users";
    }




}
