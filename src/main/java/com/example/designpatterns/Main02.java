package com.example.designpatterns;

import com.example.designpatterns.observer.FacebookObserver;
import com.example.designpatterns.observer.Post;

public class Main02 {
    public static void main(String[] args) {
        Post post = new Post();
        post.setTitle("Hi I'm Amanda");
        post.setContent("This is my first post");
        post.attach(new FacebookObserver());
        post.share();

    }

}
