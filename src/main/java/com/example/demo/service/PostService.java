package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("Котики - это круто!", 964));
        posts.add(new Post("Что бы спина не болела надо всего лишь перед сном...", 10));
        posts.add(new Post("Абоба", -1));
        return  posts;
    }
}
