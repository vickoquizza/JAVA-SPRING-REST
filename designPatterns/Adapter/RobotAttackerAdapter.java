package com.vicko.java.Adapter;

public class RobotAttackerAdapter implements EnemyAttacker{

    RobotAttacker robot;

    public RobotAttackerAdapter(RobotAttacker robot){
        this.robot = robot;
    }
    @Override
    public void fireWeapon() {
        robot.attackWithPunch();
    }

    @Override
    public void driveForward() {
        robot.walkForward();
    }

    @Override
    public void assignDriver(String DriverName) {
        robot.reactToHuman(DriverName);
    }
}
