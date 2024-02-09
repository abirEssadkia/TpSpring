package com.abir.java.exo2;

//Classe Context
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    private int totalAmount;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        this.totalAmount = amount; 
        paymentStrategy.pay(amount);
    }

    public int getTotalAmount() {
        return totalAmount;
    }
}


