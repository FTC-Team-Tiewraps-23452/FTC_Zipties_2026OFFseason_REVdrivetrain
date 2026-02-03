package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TankDriveTrain {
    private DcMotor LeftDrive;
    private DcMotor RightDrive;

    public TankDriveTrain(HardwareMap hardwareMap) {
        LeftDrive = hardwareMap.get(DcMotor.class, "LeftMotor");
        RightDrive = hardwareMap.get(DcMotor.class, "RightMotor");
        LeftDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        RightDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void setMotorPower (double leftpower, double rightpower){
        LeftDrive.setPower(leftpower);
        RightDrive.setPower(rightpower);
    }

}
