package org.java.designpattern.strategy;

public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {

        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {

        if (paymentStrategy == null) {

            System.out.println("Please Select Payment Method");
            return;
        }

        paymentStrategy.pay(amount);
    }
}
