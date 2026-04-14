package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Storage {

    private final DcMotor MotorTop, MotorBottom;

    public Storage (HardwareMap hardwareMap){
        MotorTop = hardwareMap.get(DcMotor.class, "StorageTop");
        MotorBottom = hardwareMap.get(DcMotor.class,"StorageBottom");
        MotorBottom.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        MotorTop.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void setRotationPower (double power){
        MotorTop.setPower(power);
        MotorBottom.setPower(power);
    }
}
