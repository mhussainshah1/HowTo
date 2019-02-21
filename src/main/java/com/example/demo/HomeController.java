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

    @GetMapping("/project")
    public String getProject(){
        return "project";
    }

    @GetMapping("/compile")
    public String getCompile(){
        return "compile";
    }

    @GetMapping("/run")
    public String getRun(){
        return "run";
    }

    @GetMapping("/signin")
    public String getSignIn(){
        return "signin";
    }

    @GetMapping("/form")
    public String getForm(){
        return "form";
    }

    @RequestMapping("/index2")
    public String getIndex2(){
        return "index2";
    }
}