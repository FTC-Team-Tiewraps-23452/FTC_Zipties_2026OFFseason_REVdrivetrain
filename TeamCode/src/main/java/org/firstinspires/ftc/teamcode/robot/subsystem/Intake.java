package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    private final DcMotor intakemotor;

    public Intake (HardwareMap hardwareMap){
        intakemotor = hardwareMap.get(DcMotor.class, "Intake");
        intakemotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        intakemotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }
    public void setIntakePower(double intakePower) {
        intakemotor.setPower(intakePower);


    }}
