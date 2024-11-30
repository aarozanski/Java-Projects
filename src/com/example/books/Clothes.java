package com.example.books;

public class Clothes extends Product<Object> {
    private String size;
    private String material;

    public Clothes(String size, String material) {
        super();
        this.size = size;
        this.material = material;
    }

    public Clothes(String name, double price, Object details) {
        super(name, price, details);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}

