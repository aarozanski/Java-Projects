package com.example;

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
    public static void displayInventory(Inventory<? extends Product> inventory) {
        inventory.displayAllProducts();
    }
}

// 5. Main Method
public class Main {
    public static void main(String[] args) {
        // Create instances of Book, Electronics, and Clothes
        Book book = new Book("J.K. Rowling", 400);
        Electronics electronic = new Electronics("Sony", 2);
        Clothes clothes = new Clothes("L", "Cotton");

        // Create Inventory for each type
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Electronics> electronicInventory = new Inventory<>();
        Inventory<Clothes> clothesInventory = new Inventory<>();

        // Add products to each inventory
        bookInventory.addProduct(new Product<>("Harry Potter", 19.99, book));
        electronicInventory.addProduct(new Product<>("TV", 299.99, electronic));
        clothesInventory.addProduct(new Product<>("T-Shirt", 29.99, clothes));

        // Display contents using generic methods
        System.out.println("Books Inventory:");
        InventoryUtils.displayInventory(bookInventory);

        System.out.println("Electronics Inventory:");
        InventoryUtils.displayInventory(electronicInventory);

        System.out.println("Clothes Inventory:");
        InventoryUtils.displayInventory(clothesInventory);
    }
}

