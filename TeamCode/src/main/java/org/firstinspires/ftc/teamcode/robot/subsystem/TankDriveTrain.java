package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TankDriveTrain {
    private final DcMotor leftDrive;
    private final DcMotor rightDrive;

    public TankDriveTrain(HardwareMap hardwareMap) {
        leftDrive = hardwareMap.get(DcMotor.class, "LeftMotor");
        rightDrive = hardwareMap.get(DcMotor.class, "RightMotor");

        leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        rightDrive.setDirection(DcMotorSimple.Direction.FORWARD);

        leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        leftDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void setDrivePower(double power) {
        leftDrive.setPower(power);
        rightDrive.setPower(power);
    }

    public void setRotationPower(double powerLeft, double powerRight) {
        leftDrive.setPower(powerLeft);
        rightDrive.setPower(powerRight);
    }
}