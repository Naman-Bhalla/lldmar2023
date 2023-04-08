package com.scaler.designpatterns.observer.after;

public class SMSService implements OrderPlacedSubscriber {

    SMSService(Flipkart flipkart) {
        flipkart.addSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        sendSMS(order.customerPhoneNumber, "Your order is placed successfully.");
    }

    public void sendSMS(String to, String body) {
        System.out.println(
            "Sending SMS to " + to + " with body: " + body
        );
    }
}
