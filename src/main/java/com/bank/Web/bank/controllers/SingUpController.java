package com.bank.Web.bank.controllers;

import com.bank.Web.bank.models.User;
import com.bank.Web.bank.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SingUpController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/singup")
    public String singup(Model model) {
        return "singup";
    }
    @PostMapping("/singup")
    public String userAdd(@RequestParam String firstName,@RequestParam String lastName,@RequestParam String Login,@RequestParam String Password, Model model) {
            User user = new User(firstName, lastName, Login, Password);
            userRepository.save(user);
            return "redirect:/singin";
    }
}

