package com.scaler.designpatterns.observer.before;


public class Client {

    public static void main(String[] args) {

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        EmailService emailService = new EmailService();
        SMSService smsService = new SMSService();
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem();

        Flipkart flipkart = new Flipkart(
            emailService,
            smsService,
            invoiceGenerator,
            inventoryManagementSystem
        );

        flipkart.orderPlaced(new Order());
    }
}
