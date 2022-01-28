package com.vicko.java.Adapter;

public class Test {

    public static void main(String args[]){
        TankAttacker tank = new TankAttacker();

        RobotAttacker robot = new RobotAttacker();

        EnemyAttacker robotAdapter = new RobotAttackerAdapter(robot);

        robotAdapter.assignDriver("Mariano");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

        tank.assignDriver("Carlos");
        tank.driveForward();
        tank.fireWeapon();
    }
}
