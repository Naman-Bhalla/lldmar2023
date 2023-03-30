package com.scaler.designpatterns.factory.version2;

public class PostgreSQLDatabase implements Database {

    @Override
    public Query createQuery() {
        return new PostgreSQLQuery();
    }
}
