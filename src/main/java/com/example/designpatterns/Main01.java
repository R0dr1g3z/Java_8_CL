package com.example.designpatterns;

import com.example.designpatterns.fabric.Product;
import com.example.designpatterns.fabric.ProductConstructor;
import com.example.designpatterns.facade.AtmApi;

public class Main01 {
    public static void main(String[] args) {
        Product product = new ProductConstructor().createProduct("VirtualProduct");
        System.out.println(product.getName());
        System.out.println("------");
        new AtmApi().start();
    }
}
