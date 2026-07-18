package org.java.designpattern.prototype;

public class Employee implements Cloneable {

    private String name;

    public Employee(String name) {

        this.name = name;
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {

        return (Employee) super.clone();
    }

    public void display() {

        System.out.println("Employee : " + name);
    }
}
