package com.bank.Web.bank.controllers;

import com.bank.Web.bank.WebBankApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class insertController {
    @GetMapping("/insert")
    public String home(Model model) {
        if(WebBankApplication.name==null||WebBankApplication.money==null)
            return "redirect:/";
        else {
            model.addAttribute("amount", WebBankApplication.money);
            return "insert";
        }
    }
}
