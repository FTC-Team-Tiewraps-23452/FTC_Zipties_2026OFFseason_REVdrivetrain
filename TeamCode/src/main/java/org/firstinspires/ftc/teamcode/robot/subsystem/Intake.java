package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    private DcMotor intakeMotor;
    public Intake (HardwareMap hardwareMap){
        intakeMotor= hardwareMap.get(DcMotor.class,"intakeMotor");
        intakeMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }
    public void setIntakePower(){
        intakeMotor.setPower(0.7);
    }
    public void stop(){
        intakeMotor.setPower(0);
    }
    public void reverse() {
        intakeMotor.setPower(-0.7);
    }
}
