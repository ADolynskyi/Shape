package org.example;

public class Octagon extends Shape  {
    private String name="Octagon";
    @Override
    public void printName() {
        System.out.println(name);
    }
    @Override
    public void draw() {
        System.out.println("Drawing the "+name);
    }
}
