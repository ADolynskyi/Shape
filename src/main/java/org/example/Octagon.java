package org.example;

public class Octagon extends Shape  {
    private String name;

    public Octagon(){
        this.name="Octagon";
    }
    @Override
    public void printName() {
        System.out.println(name);
    }
    @Override
    public void draw() {
        System.out.println("Drawing the "+name);
        System.out.println("    ___  ");
        System.out.println("   /   \\  ");
        System.out.println("  |     | ");
        System.out.println("   \\___/ ");
    }
}
