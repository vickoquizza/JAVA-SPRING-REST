package com.vicko.java.Bridge;

public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    void setVolume(int volume);

    int getVolume();

    void setChannel(int channel);

    int getChannel();

    void printStatus();
}
