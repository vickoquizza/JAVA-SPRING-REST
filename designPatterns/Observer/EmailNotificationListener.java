package com.vicko.java.Observer;

import java.io.File;

public class EmailNotificationListener implements EventListener{
    private String Email;

    public EmailNotificationListener(String email){
        this.Email = email;
    }
    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + Email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
