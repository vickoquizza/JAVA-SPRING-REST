package com.vicko.java.Observer;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogNotificationListener("test.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
