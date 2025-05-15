package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class WebController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome!");
        return "index";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name, Model model) {
        model.addAttribute("message", "Hello, " + name + "!");
        return "greet";
    }
}