package com.example.genericsExample;

public class Main {

    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(67);
        printer.print();

        Printer<String> stringPrinter = new Printer<>("hello");
        printer.print();

    }
}
