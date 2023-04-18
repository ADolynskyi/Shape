package org.example;

public class Triangle extends Shape {

    private String name="Triangle";
    @Override
    public void printName() {
        System.out.println(name);
    }
    @Override
    public void draw() {
        System.out.println("Drawing the "+name);
        System.out.println("    /\\    ");
        System.out.println("   /  \\   ");
        System.out.println("  /____\\  ");
    }
}
