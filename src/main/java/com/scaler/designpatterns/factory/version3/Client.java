package com.scaler.designpatterns.factory.version3;

public class Client {

    public static void main(String[] args) {
        Database db;//  = DatabasePracticalFactory.createDatabaseForInput();

        DatabaseFactory dbf = db.createDatabaseFactory();

//        if (db instanceof MySQLDatabase) {
//            dbf = new MySQLDBFactory();
//        } else if (db instanceof PostgreSQLDatabase) {
//            dbf = new PostgreSQLDBFactory();
//        }

        Query q = dbf.createQuery();

        
    }
}
