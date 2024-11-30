package com.example.books;

public class Clothes extends Product<Object> {
    private String size;
    private String material;

    public Clothes(String size, String material) {
        super();
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}

