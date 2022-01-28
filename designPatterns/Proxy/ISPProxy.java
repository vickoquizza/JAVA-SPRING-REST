package com.vicko.java.Proxy;

import java.util.Calendar;

public class ISPProxy implements ISP{

    @Override
    public String getResource(String site) {
        logRequest(site);
        if(isBlocked(site)){
            System.out.println("This site is blocked by the company");
        }
        NetworkSettings netConfig = new NetworkSettings();
        return netConfig.getISP().getResource(site);
    }

    public void logRequest(String site){
        System.out.println(Calendar.getInstance().getTime() + "Site reached " + site );
    }

    public boolean isBlocked(String site){
        switch (site){
            case "www.google.com":
            case "www.linkedin.com" :
                return false;
            case "www.facebook.com":
            default:
                return true;
        }
    }
}
