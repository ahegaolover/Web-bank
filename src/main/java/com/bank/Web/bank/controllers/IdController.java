package com.bank.Web.bank.controllers;

import com.bank.Web.bank.WebBankApplication;
import com.bank.Web.bank.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IdController {
    @GetMapping("/id")
    public String home(Model model) {
        model.addAttribute("id", WebBankApplication.id);
        return "id";
    }
}
