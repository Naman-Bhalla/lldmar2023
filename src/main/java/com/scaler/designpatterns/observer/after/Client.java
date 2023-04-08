package com.scaler.designpatterns.observer.after;

public class Client {

    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(flipkart);
        EmailService emailService = new EmailService(flipkart);
        SMSService smsService = new SMSService(flipkart);
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem(flipkart);

//
//        flipkart.addSubscriber(invoiceGenerator);
//        flipkart.addSubscriber(emailService);
//        flipkart.addSubscriber(smsService);
//        flipkart.addSubscriber(inventoryManagementSystem);
    }
}
