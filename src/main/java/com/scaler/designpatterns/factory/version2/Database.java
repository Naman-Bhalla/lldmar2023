package com.scaler.designpatterns.factory.version2;


public interface Database {

    Query createQuery();

    // createConnection
    // createTransaction
    // createSecurityLayer
}
