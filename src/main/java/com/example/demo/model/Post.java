package com.example.demo.model;

public class Post {
    private final String text;
    private Integer likes;

    public Post(String text, int likes){
        this.text =text;
        this.likes = likes;
    }
    public int getLikes(){
        return likes;
    }
    public String getText(){
        return text;
    }
}
