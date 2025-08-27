package com.example.springmvcjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// @RequestGetMapping("/") // DispatcherServlet 어쩌구저쩌구
public class HelloController {
    @GetMapping("/greeting")
    public String greet(Model model) {
        // key, value
        model.addAttribute("username", "김다은");
        model.addAttribute("message", "아자차카타파하");
        return "greet";
        // web-app/WEB-INF/views/ + {...} + .jsp
    }
}
