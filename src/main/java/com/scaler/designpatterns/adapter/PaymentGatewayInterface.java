package com.scaler.designpatterns.adapter;

public interface PaymentGatewayInterface {
//    boolean checkStatus();

    void initiate(String orderNumber);

    boolean checkStatus(String orderNumber);
}
