package com.example.demo.model;

import java.util.Date;
import java.util.Random;

public class Post {
    private final Long id;
    private final String text;
    private final Date creationDate;
    private Integer likes;

    public Post(Long id, String text, Date creationDate){
        this.text =text;
        this.creationDate = creationDate;
        this.id = id;
        likes = 0;
    }
    public int getLikes(){
        return likes;
    }
    public String getText(){
        return text;
    }
    public Date getCreationDate(){
        return creationDate;
    }
    public void setLikes(int likes){
        this.likes=likes;
    }
    public Long getId(){
        return this.id;
    }
}
