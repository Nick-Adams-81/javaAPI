package com.example.javaapi.Controllers;

import com.example.javaapi.Repositories.UserRepository;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserRepository userDao;

    public UserController(UserRepository userDao) {
        this.userDao = userDao;
    }


}
