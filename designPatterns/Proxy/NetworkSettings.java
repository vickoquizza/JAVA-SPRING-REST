package com.vicko.java.Proxy;

public class NetworkSettings {
    public ISP getInternet(){
        return new ISPProxy();
    }

    public ISP getISP(){
        return new TigoUne();
    }
}
