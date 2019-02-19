package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/compile")
    public String getCompile(){
        return "compile";
    }

    @GetMapping("/run")
    public String getRun(){
        return "run";
    }
}