package com.vicko.java.Proxy;

import java.util.Scanner;

public class Browser {

    Scanner scan = new Scanner(System.in);

    public void sendRequest(){
        String site = scan.nextLine();
        String response = getInternetProvider().getResource(site);
        loadResponse(response);
    }

    public void loadResponse(String response){
        System.out.println(response);
    }

    public ISP getInternetProvider(){
        return new NetworkSettings().getInternet();
    }
}
