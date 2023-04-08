package com.scaler.designpatterns.observer.before;


public class EmailService {



    void sendEmail(String to, String body) {
        System.out.println(
            "Sending email to " + to + " with body: " + body
        );
    }
}
