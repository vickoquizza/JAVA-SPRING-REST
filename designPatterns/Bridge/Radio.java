package com.vicko.java.Bridge;

public class Radio implements Device{
    private boolean status;
    private int volume = 50;
    private int channel = 10;

    @Override
    public boolean isEnabled() {
        return status;
    }

    @Override
    public void enable() {
        this.status = true;
    }

    @Override
    public void disable() {
        this.status = false;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void printStatus() {
        if(status){
            System.out.println("------------------------------------------------------");
            System.out.println("You are using a Radio, the volume of the Radio is" + volume);
            System.out.println("The channel is " + channel + "FM");
            System.out.println("------------------------------------------------------");
        }else{
            System.out.println("the device is off");
        }

    }
}
