package com.example.genericsExample;

public class IntegerPrinter {
    Integer thingsToPrint;

    public IntegerPrinter(Integer thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }

    public void print(){
        System.out.println(thingsToPrint);
    }
}
