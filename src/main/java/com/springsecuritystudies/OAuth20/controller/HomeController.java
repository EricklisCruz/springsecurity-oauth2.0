package com.springsecuritystudies.OAuth20.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/")
    public String home(){
        return "HELLO, WELCOME";
    }

    @GetMapping(value = "/security")
    public String secured() {
        return "HELLO, SECURED";
    }
}
