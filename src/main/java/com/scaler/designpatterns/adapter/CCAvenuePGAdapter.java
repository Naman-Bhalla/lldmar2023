package com.scaler.designpatterns.adapter;

import com.scaler.designpatterns.adapter.thirdparty.CCAvenuePG;

public class CCAvenuePGAdapter implements PaymentGatewayInterface {
    private CCAvenuePG ccAvenuePG = new CCAvenuePG();

    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }

    @Override
    public void initiate(String orderNumber) {
        ccAvenuePG.startPayment(orderNumber);
    }
}
