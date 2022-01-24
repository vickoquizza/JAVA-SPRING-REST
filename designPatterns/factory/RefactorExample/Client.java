package com.vicko.java.factory.RefactorExample;


public class Client {
        public static void main(String args[]){
            Creator newEvent = Factory.configureButton("Windows");
            newEvent.clickButton();
        }

}
