package com.ammarstudy.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {
    @Value("${server.port}")
    private String currentPort;
    @Value("${logging.localhost}")
    private String localHost;
    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Sending email to " + recipientEmail + " on port " + currentPort + " at " + localHost);
        System.out.println("Message: " + message +"you are registered successfully!");
    }
}
