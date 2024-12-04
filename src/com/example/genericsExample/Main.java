package com.example.genericsExample;

public class Main {

    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(67);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(99.9);
        printer.print();

    }
}
