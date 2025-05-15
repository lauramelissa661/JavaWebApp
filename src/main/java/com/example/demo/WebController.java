package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WebController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to our Java Web App!");
        return "index";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name, Model model) {
        model.addAttribute("message", "Hello, " + name + "!");
        return "index";
    }
}