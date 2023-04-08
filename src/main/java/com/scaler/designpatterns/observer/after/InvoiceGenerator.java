package com.scaler.designpatterns.observer.after;

public class InvoiceGenerator implements OrderPlacedSubscriber {

    InvoiceGenerator(Flipkart flipkart) {
        flipkart.addSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        generateInvoice(order.orderId);
    }

    public void generateInvoice(Long orderId) {
        System.out.println("Generating invoice for order: " + orderId);
    }
}
