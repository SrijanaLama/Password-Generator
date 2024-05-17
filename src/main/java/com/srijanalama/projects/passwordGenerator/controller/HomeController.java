package com.srijanalama.projects.passwordGenerator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping(value = {"/","/home"})
    public String displayHomePage(){
        return "home/index";
    }
}
