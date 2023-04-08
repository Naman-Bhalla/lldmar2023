package com.scaler.designpatterns.observer.after;

public class EmailService implements OrderPlacedSubscriber {

    public EmailService(Flipkart flipkart) {
        flipkart.addSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        sendEmail(order.customerEmail, "Your order is placed successfully.");
    }

    void sendEmail(String to, String body) {
        System.out.println(
            "Sending email to " + to + " with body: " + body
        );
    }
}
