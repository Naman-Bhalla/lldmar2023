package com.scaler.designpatterns.observer.before;

public class Flipkart {
    private EmailService emailService;
    private SMSService smsService;
    private InvoiceGenerator invoiceGenerator;
    private InventoryManagementSystem inventoryManagementSystem;

    public Flipkart(EmailService emailService,
                    SMSService smsService,
                    InvoiceGenerator invoiceGenerator,
                    InventoryManagementSystem inventoryManagementSystem) {
        this.emailService = emailService;
        this.smsService = smsService;
        this.invoiceGenerator = invoiceGenerator;
        this.inventoryManagementSystem = inventoryManagementSystem;
    }

    public void orderPlaced(Order order) {
        emailService.sendEmail(order.customerEmail, "Your order is placed.");
        smsService.sendSMS(order.customerPhoneNumber, "Your order is placed.");
        invoiceGenerator.generateInvoice(order.orderId);
        inventoryManagementSystem.update(order.productId);
    }
}
