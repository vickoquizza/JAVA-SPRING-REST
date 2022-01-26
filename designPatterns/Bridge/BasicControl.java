package com.vicko.java.Bridge;

public class BasicControl implements Control{
    protected Device device;

    public BasicControl(Device device){
        this.device = device;
    }
    @Override
    public void power() {
        System.out.println("Toggle power");
        if(device.isEnabled()){
            device.disable();
        }else{
            device.enable();
        }
    }

    @Override
    public void channelUp() {
        System.out.println("channel dial up");
        device.setChannel(device.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        System.out.println("Channel dial down");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void volumeUp() {
        System.out.println("volume dial up");
        device.setVolume(device.getVolume() + 1);
    }

    @Override
    public void volumeDown() {
        System.out.println("volume dial down");
        device.setVolume(device.getVolume() - 1);
    }
}
