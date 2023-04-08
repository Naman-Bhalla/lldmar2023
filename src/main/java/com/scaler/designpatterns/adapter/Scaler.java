package com.scaler.designpatterns.adapter;

import com.scaler.designpatterns.adapter.thirdparty.RazorpayPG;

import java.util.List;

public class Scaler {
    List<PaymentGatewayInterface> paymentGateways = List.of(
            new RazorpayPGAdapter()
    );

    Scaler(List<PaymentGatewayInterface> paymentGateways) {
        this.paymentGateways = paymentGateways;
    }

    void admitStudent() {
        paymentGateways.get(0).initiate("12345678");
    }


}
