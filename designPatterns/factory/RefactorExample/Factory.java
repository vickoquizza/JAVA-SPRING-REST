package com.vicko.java.factory.RefactorExample;

public class Factory {


    public static Creator configureButton(String mode){
        switch (mode){
            case "Windows":
                return new WindowsEvent();
            case "Mac":
                return new MacEvent();
            default:
                System.out.println("Neither event has this System");
                return null;
        }
    }
}
