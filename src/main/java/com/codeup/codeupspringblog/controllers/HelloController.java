package com.codeup.codeupspringblog.controllers;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String landingpage(){
        return "This is the landing page!";
    }

    private int counter;

    @GetMapping("/counter/{counterInit}")
    @ResponseBody
    public String initCounter(@PathVariable int counterInit) {
        counter = counterInit;
        return "counter reset to " + counter;
    }

    @GetMapping("/increment")
    @ResponseBody
    public String incrementCounter() {
        counter++;
        return "counter is now " + counter;
    }

    @GetMapping("/hello/{personName}")
    public String hello(@PathVariable String personName, Model model) {
        model.addAttribute("name", personName);
        return "hello";
    }

    @GetMapping(value = "/hello-msh/{personName}", produces = "application/json")
    @ResponseBody
    public String helloMessage(@PathVariable String personName) {
        return String.format("Hello from JSON! %s %s", personName, LocalDateTime.now());
    }

}
