package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    private final ArrayList<Post> posts = new ArrayList<>();
    private final static ArrayList<PostService> services = new ArrayList<>();

    public static PostService getPostService(){
        if (services.isEmpty())
            services.add(new PostService());
        return services.getFirst();
    }

    private PostService(){
        this.create("Котики - это круто!");;

    }

    public ArrayList<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long)posts.size(), text, new Date()));
    }
}
