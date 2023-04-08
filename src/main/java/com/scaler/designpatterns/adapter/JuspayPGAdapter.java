package com.scaler.designpatterns.adapter;

import com.scaler.designpatterns.adapter.thirdparty.JuspayPG;

public class JuspayPGAdapter implements PaymentGatewayInterface {
    private JuspayPG juspayPG = new JuspayPG();
    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }

    @Override
    public void initiate(String orderNumber) {

    }
}
