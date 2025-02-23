package com.example.demo.model;

import java.util.Random;

public class Post {
    private final String text;
    private final String creationDate;
    private Integer likes;

    public Post(String text, String creationDate){
        this.text =text;
        this.creationDate = creationDate;
        Random rnd = new Random();
        this.likes = rnd.nextInt(1000);
    }
    public int getLikes(){
        return likes;
    }
    public String getText(){
        return text;
    }
    public String getCreationDate(){
        return creationDate;
    }
}
