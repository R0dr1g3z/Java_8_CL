package com.example.designpatterns.observer;

public class FacebookObserver implements Observer {

    @Override
    public void update() {
        System.out.println("Added post");
    }

}
