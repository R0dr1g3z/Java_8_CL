package com.example.designpatterns;

public class ProductConstructor implements Constructor {

    @Override
    public Product createProduct(String type) {
        Product product = null;
        if (type.equals("SimpleProduct")) {
            product = new SimpleProduct();
        } else if (type.equals("AdvancedProduct")) {
            product = new AdvancedProduct();
        } else if (type.equals("VirtualProduct")) {
            product = new VirtualProduct();
        }
        return product;
    }

}
