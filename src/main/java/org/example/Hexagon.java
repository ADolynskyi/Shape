package org.example;

public class Hexagon extends Shape{

    private String name="Hexagon";
    @Override
    public void printName() {
        System.out.println(name);
    }
    @Override
    public void draw() {
        System.out.println("Drawing the "+name);
    }
}
