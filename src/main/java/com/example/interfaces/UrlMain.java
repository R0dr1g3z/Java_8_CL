package com.example.interfaces;

public class UrlMain {
    public static void main(String[] args) {
        String url = "url_example?param1=99&param2=string";
        Url urlMatcher = new StandardUrl();
        System.out.println(urlMatcher.getParam("param1", url));
    }
}
