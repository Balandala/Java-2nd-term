package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private  Long id;
    private  String text;
    private  Date creationDate;
    private Integer likes;

    public Post(){

    }
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
