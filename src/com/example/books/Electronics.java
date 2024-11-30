package com.example.books;

public class Electronics {
    private String brand;
    private int warranty; // in years

    public Electronics(String brand, int warranty) {
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", warranty=" + warranty +
                '}';
    }
}

