package com.example.books;

public class InventoryUtils {
    // Modify the method to use a wildcard that allows any Product subtype.
    public static void displayInventory(Inventory<? extends Product<?>> inventory) {
        inventory.displayAllProducts();
    }
}
