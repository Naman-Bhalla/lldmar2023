package com.scaler.designpatterns.adapter;

import com.scaler.designpatterns.adapter.thirdparty.RazorpayPG;

public class RazorpayPGAdapter implements PaymentGatewayInterface {
    private RazorpayPG razorpayPG = new RazorpayPG();

    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }

    @Override
    public void initiate(String orderNumber) {

    }
}
