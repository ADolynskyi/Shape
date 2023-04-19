package org.example;

public class Quad extends Shape {

    private String name;
    
    public Quad(){
        this.name="Quad";
    }
    @Override
    public void printName() {
        System.out.println("Quad");
    }
    @Override
    public void draw() {
        System.out.println("Drawing the "+name);
        System.out.println("  ______    ");
        System.out.println("  |    |   ");
        System.out.println("  |____|   ");
    }
}
