package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class PostService {
    private final ArrayList<Post> posts = new ArrayList<>();


    @Autowired
    PostRepository postRepository;
    public PostService(){
    }

    public List<Post> listAllPosts(){
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }

    public void create(String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
