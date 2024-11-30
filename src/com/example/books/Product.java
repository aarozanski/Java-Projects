package com.example.books;

import java.util.ArrayList;
import java.util.List;

// 1. Generic Class Product
class Product<T> {
    private String name;
    private double price;
    private T details;

    public Product(String name, double price, T details) {
        this.name = name;
        this.price = price;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", details=" + details + "}";
    }
}

// 2. Product Types
class Book {
    private String author;
    private int pages;

    public Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{author='" + author + "', pages=" + pages + "}";
    }
}

class Electronics {
    private String brand;
    private int warranty; // in years

    public Electronics(String brand, int warranty) {
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Electronics{brand='" + brand + "', warranty=" + warranty + " years}";
    }
}

class Clothes {
    private String size;
    private String material;

    public Clothes(String size, String material) {
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Clothes{size='" + size + "', material='" + material + "'}";
    }
}

// 3. Generic Inventory Class
class Inventory<T> {
    private List<Product<T>> products = new ArrayList<>();

    public void addProduct(Product<T> product) {
        products.add(product);
    }

    public void removeProduct(Product<T> product) {
        products.remove(product);
    }

    public void displayAllProducts() {
        for (Product<T> product : products) {
            System.out.println(product);
        }
    }
}

// 4. Implement Wildcards
class InventoryUtils {
    public static void displayInventory(Inventory<Clothes> inventory) {
        inventory.displayAllProducts();
    }
}

