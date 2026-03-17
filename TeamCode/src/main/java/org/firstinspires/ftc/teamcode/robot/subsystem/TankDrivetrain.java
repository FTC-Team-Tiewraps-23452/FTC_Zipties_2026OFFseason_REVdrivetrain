package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TankDrivetrain {
private final DcMotor motorleft, motorright;

public TankDrivetrain (HardwareMap hardwaremap){
    motorleft = hardwaremap.get(DcMotor.class, "TankLeft");
    motorright = hardwaremap.get(DcMotor.class, "TankRight");
    motorleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    motorright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    motorleft.setDirection(DcMotorSimple.Direction.FORWARD);
    motorright.setDirection(DcMotorSimple.Direction.REVERSE);
}
public void setDrivePower(double power){
    motorright.setPower(power);
    motorleft.setPower(power);
}
public void setTurnPower(double turnLeft, double turnRight){
    motorright.setPower(turnRight);
    motorleft.setPower(turnLeft);
}


}
