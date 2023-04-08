package com.scaler.designpatterns.adapter.thirdparty;

public class RazorpayPG {

    public String initiatePayment(String cardNumber) {
        System.out.println("Payment started using Razorpay");
        return "Razorpay";
    }
}
