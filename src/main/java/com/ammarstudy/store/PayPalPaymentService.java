package com.ammarstudy.store;

import org.springframework.stereotype.Service;

//@Service("PayPal")
public class PayPalPaymentService implements  PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("amount: " + amount);
    }
}
