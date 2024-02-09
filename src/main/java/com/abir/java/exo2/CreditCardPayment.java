package com.abir.java.exo2;

//Stratégie concrète : Paiement par carte de crédit
public class CreditCardPayment implements PaymentStrategy {
 private String cardNumber;
 private String expirationDate;
 private String cvv;

 public CreditCardPayment(String cardNumber, String expirationDate, String cvv) {
     this.cardNumber = cardNumber;
     this.expirationDate = expirationDate;
     this.cvv = cvv;
 }

 @Override
 public void pay(int amount) {
     System.out.println("Paying " + amount + " dollars with credit card ending in " + cardNumber.substring(cardNumber.length() - 4));
 }
}
