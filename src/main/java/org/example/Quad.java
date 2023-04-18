package org.example;

public class Quad extends Shape {

    private String name="Quad";
    @Override
    public void printName() {
        System.out.println("Quad");
    }
    @Override
    public void draw() {
        System.out.println("Drawing the "+name);
    }
}
