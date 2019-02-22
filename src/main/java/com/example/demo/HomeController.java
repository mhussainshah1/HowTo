package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/") //or @GetMapping("/index")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/project")
    public String getProject() {
        return "project";
    }

    @GetMapping("/compile")
    public String getCompile() {
        return "compile";
    }

    @GetMapping("/createjar")
    public String getCreateJar() {
        return "createjar";
    }

    @GetMapping("/run")
    public String getRun() {
        return "run";
    }

}