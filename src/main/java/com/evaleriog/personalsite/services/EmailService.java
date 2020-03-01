package com.evaleriog.personalsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service("mailService")
public class EmailService {

    @Autowired
    public JavaMailSender emailSender;

    @Value("${spring.mail.to}")
    private String to;

    public void sendEmail(String from, String name, String message){
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom(from);
        msg.setTo(to);
        msg.setSubject("Message from: " + name);
        msg.setText(message);
        try{
            this.emailSender.send(msg);
        }catch (MailException ex){
            System.err.println(ex.getMessage());
        }

    }
}
