package com.scaler.designpatterns.factory.version3;

public class PostgreSQLDBFactory implements DatabaseFactory {

    @Override
    public Query createQuery() {
        return new PostgreSQLQuery();
    }
}
