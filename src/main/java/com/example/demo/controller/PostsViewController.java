package com.example.demo.controller;

import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import com.example.demo.service.PostService;

@Controller
public class PostsViewController {
    @Autowired
    PostService postsService;
    @GetMapping(path = "/")
    public String list(Model model) {
        model.addAttribute("appName", "Моё крутое приложение");

        postsService = PostService.getPostService();
        var posts = postsService.listAllPosts();
        model.addAttribute("posts", posts);
        return "list";
    }

    @ResponseBody
    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
    public String single(@PathVariable("id") Long id) {
        return "Здесь будет страница поста #" + id;
    }

}
