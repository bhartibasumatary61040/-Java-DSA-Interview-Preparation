package org.java.designpattern.strategy;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());

        cart.checkout(5000);

        cart.setPaymentStrategy(new UpiPayment());

        cart.checkout(2500);

        cart.setPaymentStrategy(new PaypalPayment());

        cart.checkout(1000);
    }
}
