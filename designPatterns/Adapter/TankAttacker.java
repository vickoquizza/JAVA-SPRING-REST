package com.vicko.java.Adapter;

import javax.sound.midi.SysexMessage;
import java.util.Random;

public class TankAttacker implements EnemyAttacker{

    Random gen = new Random();
    @Override
    public void fireWeapon() {
        int damagePoints = gen.nextInt(10) + 1;
        System.out.println("The tank do " + damagePoints);
    }

    @Override
    public void driveForward() {
        int movement = gen.nextInt(5) + 1;
        System.out.println("The tank mode " + movement + "tiles");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + "Is driving the thank");
    }
}
