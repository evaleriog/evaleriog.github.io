package com.evaleriog.personalsite.controllers;

import com.evaleriog.personalsite.models.Email;
import com.evaleriog.personalsite.services.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    private final EmailService emailService;

    public IndexController(EmailService emailService){
        this.emailService = emailService;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("email", new Email());
        return "index";
    }

    @PostMapping("/send-message")
    public String sendMessage(@ModelAttribute Email email,
                              Model model){

        boolean checkName = email.getName() != null && !email.getName().equals("");
        boolean checkEmail = (email.getEmail() != null) && !(email.getEmail().equals(""));
        boolean checkMessage = email.getMessage() != null && !email.getMessage().equals("");

        if(checkName && checkEmail && checkMessage){
            emailService.sendEmail(email.getEmail(), email.getName(), email.getMessage());
        }

        if(!checkName){
            model.addAttribute("nameError", "Name can not be empty");
        }

        if(!checkMessage) {
            model.addAttribute("messageError", "Message can not be empty");
        }

        return "index";
    }
}
