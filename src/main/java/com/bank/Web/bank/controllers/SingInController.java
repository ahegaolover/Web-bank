package com.bank.Web.bank.controllers;

import com.bank.Web.bank.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SingInController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/singin")
    public String home(Model model) {
        return "singin";
    }
    @PostMapping("/singin")
    public String singin(@RequestParam String Login, @RequestParam String Password,Model model) {
        return "singin";
    }
}
