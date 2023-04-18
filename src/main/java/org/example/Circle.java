package org.example;

public class Circle extends Shape {

    private String name="Circle";

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing the "+name);
    }
}
