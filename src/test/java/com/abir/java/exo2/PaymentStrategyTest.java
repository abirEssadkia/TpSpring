package com.abir.java.exo2;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PaymentStrategyTest {

    @Test
    public void testCreditCardPaymentOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PaymentStrategy paymentStrategy = new CreditCardPayment("1122334455667788", "10/26", "555");
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(paymentStrategy);
        cart.checkout(100);

        String expectedOutput = "Paying 100 dollars with credit card ending in 7788\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testCreditCardPaymentTotalAmount() {
        PaymentStrategy paymentStrategy = new CreditCardPayment("1122334455667788", "10/26", "555");
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(paymentStrategy);
        cart.checkout(100);
        System.out.println("Total amount paid: " + cart.getTotalAmount());

        assertEquals(100, cart.getTotalAmount());
    }

    @Test
    public void testPayPalPaymentOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PaymentStrategy paymentStrategy = new PayPalPayment("abir@gmail.com", "abir123");
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(paymentStrategy);
        cart.checkout(50);

        String expectedOutput = "Paying 50 dollars with PayPal account abir@gmail.com\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testPayPalPaymentTotalAmount() {
        PaymentStrategy paymentStrategy = new PayPalPayment("abir@gmail.com", "abir123");
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(paymentStrategy);
        cart.checkout(50);
        System.out.println("Total amount paid: " + cart.getTotalAmount());

        assertEquals(50, cart.getTotalAmount());
    }
}
