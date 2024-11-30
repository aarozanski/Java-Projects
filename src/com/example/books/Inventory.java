package com.example.books;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends Product<?>> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public void removeProduct(T product) {
        products.remove(product);
    }

    public void displayAllProducts() {
        for (T product : products) {
            System.out.println(product);
        }
    }
}

