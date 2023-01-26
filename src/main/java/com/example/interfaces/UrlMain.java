package com.example.interfaces;

public class UrlMain {
    public static void main(String[] args) {
        String url = "url_example?param1=99&param2=string";
        String url2 = "url_example/param1.55/param2.byte";
        Url urlMatcher = new StandardUrl();
        Url urlMatcher2 = new ExtendedUrl();
        System.out.println(urlMatcher.getParam("param1", url));
        System.out.println(urlMatcher2.getParam("param1", url2));
        System.out.println(urlMatcher2.getParam("param2", url2));
    }
}
