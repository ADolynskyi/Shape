package org.example;

public class Hexagon extends Shape{

    private String name;

    public Hexagon(){
        this.name="Hexagon";
    }
    @Override
    public void printName() {
        System.out.println(name);
    }
    @Override
    public void draw() {
        System.out.println("Drawing the "+name);
        System.out.println("   ___  ");
        System.out.println("  /   \\");
        System.out.println("  \\___/");

    }
}
