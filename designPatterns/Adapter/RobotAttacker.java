package com.vicko.java.Adapter;

import java.util.Random;

public class RobotAttacker {

    Random gen = new Random();

    public void attackWithPunch(){
        int damagePoints = gen.nextInt(10) + 1;
        System.out.println("The punch did " + damagePoints);
    }

    public void walkForward(){
        int movement = gen.nextInt(5) + 1;
        System.out.println("The robot move " + movement + "tiles");
    }

    public void reactToHuman(String human){
        System.out.println("The robot react to " + human);
    }
}
