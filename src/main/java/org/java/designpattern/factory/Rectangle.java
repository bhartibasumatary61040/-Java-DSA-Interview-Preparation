package org.java.designpattern.factory;

import org.java.designpattern.factory.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {

        System.out.println("Drawing Rectangle");
    }
}
