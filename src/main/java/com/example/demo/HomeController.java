package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/") //or @GetMapping("/index")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/index2")
    public String getIndex2(){
        return "index2";
    }

    @GetMapping("/compile")
    public String getCompile(){
        return "compile";
    }

    @GetMapping("/run")
    public String getRun(){
        return "run";
    }

    @GetMapping("/test")
    public String getTest(){
        return "test";
    }

    @GetMapping("/form")
    public String getForm(){
        return "form";
    }

    @GetMapping("/signin")
    public String getSignIn(){
        return "signin";
    }
}