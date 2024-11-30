package com.example.books;

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

