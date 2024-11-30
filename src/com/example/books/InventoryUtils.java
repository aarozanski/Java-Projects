package com.example.books;

public class InventoryUtils {
    public static void displayInventory(Inventory<? extends Product> inventory) {
        inventory.displayAllProducts();
    }
}