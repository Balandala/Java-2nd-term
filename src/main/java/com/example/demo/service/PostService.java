package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("Котики - это круто!", "29.07.2024"));
        posts.add(new Post("Что бы спина не болела надо всего лишь перед сном...", "02.02.2002"));
        posts.add(new Post("Абоба", "24.02.2025"));
        return  posts;
    }
}
