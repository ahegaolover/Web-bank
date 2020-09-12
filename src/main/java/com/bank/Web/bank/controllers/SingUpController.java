package com.bank.Web.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SingUpController {
    @GetMapping("/singup")
    public String home() {
        return "singup";
    }
}
