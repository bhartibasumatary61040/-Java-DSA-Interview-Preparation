package org.java.designpattern.factory;

public class Main {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("Circle");
        shape1.draw();

        Shape shape2 = factory.getShape("Rectangle");
        shape2.draw();
    }

}
