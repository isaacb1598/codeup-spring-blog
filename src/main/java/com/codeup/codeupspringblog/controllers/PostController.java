package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/post")
    @ResponseBody
    public String getAllPosts(){
        return "post index page";
    }

    @GetMapping("/post/{id}")
    @ResponseBody
    public String getPostById(@PathVariable long id){
        return "view an additional post " + id;
    }

    @GetMapping("/post/create")
    @ResponseBody
    public String getCreatePage(){
        return "view the form for creating a post";
    }

    @PostMapping("/post/create")
    @ResponseBody
    public String submitForm(){
        return "create a new post";
    }
}
