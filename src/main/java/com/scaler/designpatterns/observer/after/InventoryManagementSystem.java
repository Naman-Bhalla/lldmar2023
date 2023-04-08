package com.scaler.designpatterns.observer.after;

public class InventoryManagementSystem implements OrderPlacedSubscriber {

    InventoryManagementSystem(Flipkart flipkart) {
        flipkart.addSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        update(order.productId);
    }

    public void update(Long productId) {
        System.out.println("InventoryManagementSystem: Order is placed. Updating inventory.");
    }
}
