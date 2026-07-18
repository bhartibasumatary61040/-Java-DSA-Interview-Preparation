package org.java.designpattern.prototype;

public class Main {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        Employee emp1 = new Employee("Bharti");

        Employee emp2 = emp1.clone();

        emp1.display();

        emp2.display();

        System.out.println(emp1 == emp2);
    }
}
