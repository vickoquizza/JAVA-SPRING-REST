package com.vicko.java.Bridge;

public class Client {
    public static void main(String args[]){
        BasicControl basicRemoteTV = new BasicControl(new TV());

        BasicControl basicRemoteRadio = new BasicControl(new TV());

        basicRemoteRadio.device.printStatus();
        basicRemoteRadio.power();
        basicRemoteRadio.channelUp();
        basicRemoteRadio.device.printStatus();
    }
}
