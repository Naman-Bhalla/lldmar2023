package com.scaler.designpatterns.factory.version3;

public interface DatabaseFactory {

    Query createQuery();

    // createConnection
    // createTransaction
    // createSecurityLayer
}
