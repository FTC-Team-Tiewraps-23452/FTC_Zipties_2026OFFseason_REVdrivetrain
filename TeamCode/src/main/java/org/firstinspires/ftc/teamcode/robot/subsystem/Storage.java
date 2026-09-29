package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Storage {

    private final CRServo ServoTop;
    public Storage (HardwareMap hardwareMap){
        ServoTop = hardwareMap.get(CRServo.class, "StorageTop");
        ServoTop.setDirection(CRServo.Direction.FORWARD);
    }
    public void setRotationPower (double power){
        ServoTop.setPower(power);
    }
}
