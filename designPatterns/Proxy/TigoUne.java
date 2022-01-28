package com.vicko.java.Proxy;

public class TigoUne implements ISP{

    @Override
    public String getResource(String site) {
        switch (site){
            case "www.google.com":
                return "216.239.32.10";
            case "www.facebook.com":
                return "129.134.30.12";
            default:
                return "No ip founded for this";
        }
    }
}
