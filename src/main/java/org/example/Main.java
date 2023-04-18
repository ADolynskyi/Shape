package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Shape circle= new Circle();
        Shape quad= new Quad();
        Shape triangle=new Triangle();
        Shape hexagon = new Hexagon();
        Shape octagon =new Octagon();
        circle.printName();
        circle.draw();

        quad.printName();
        quad.draw();

         new Printer(triangle);
         new Printer(hexagon);
         new Printer(octagon);

    }



}