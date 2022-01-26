package com.vicko.java.Bridge;

public class AdvancedControl extends BasicControl{
    public AdvancedControl(Device device) {
        super(device);
    }

    void mute(){
        device.setVolume(0);
    }
}
