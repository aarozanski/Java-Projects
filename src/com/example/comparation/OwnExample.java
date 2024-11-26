package com.example.comparation;

import java.util.ArrayList;
import java.util.List;

public class OwnExample {
    public static void main(String[] args) {

        List <Resturant> resturant = new ArrayList<>();
        Resturant rest1 = new Resturant("Tzuco", 5, 7);
        Resturant rest2 = new Resturant("RPM", 4, 5);
        Resturant rest3 = new Resturant("Ema", 3, 6);
        Resturant rest4 = new Resturant("Aba", 4, 6);
        Resturant rest5 = new Resturant("Nico", 2, 4);
        System.out.println("Before sorting \n" + resturant);
    }
}

class Resturant {
    String name;
    int ratingStar;
    int numOfYears;

    @Override
    public String toString() {
        return "Resturant{" +
                "name='" + name + '\'' +
                ", ratingStar=" + ratingStar +
                ", numOfYears=" + numOfYears +
                '}';
    }

    public Resturant(String name, int ratingStar, int numOfYears) {
        this.name = name;
        this.ratingStar = ratingStar;
        this.numOfYears = numOfYears;
    }
}