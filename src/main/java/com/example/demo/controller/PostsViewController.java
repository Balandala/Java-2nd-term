package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import com.example.demo.service.PostService;

@Controller
public class PostsViewController {
    //@Autowired
    //PostService posetService;

    @GetMapping(path = "/")
    public String list(Model model) {
        model.addAttribute("appName", "Моё куртое приложение");
        return "list";
    }

    @ResponseBody
    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
    public String single(@PathVariable("id") Long id) {
        return "Здесь будет страница поста #" + id;
    }
}
