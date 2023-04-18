package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Shape circle= new Circle();
        Shape quad= new Quad();

        circle.printName();
        circle.draw();

        quad.printName();
        quad.draw();
    }



}