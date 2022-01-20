package com.vicko.java.decorator;

public class EmailCore implements Email{

    private String Subject;
    private String Body;
    private String Attatchments;

    public EmailCore(String subject, String body, String attatchments){
        this.Subject = subject;
        this.Body = body;
        this.Attatchments = attatchments;
    }

    @Override
    public void send() {
        System.out.println("Sending mail to....");
    }

    @Override
    public void receive() {
        System.out.println("Reciving mail from...");
    }
}
