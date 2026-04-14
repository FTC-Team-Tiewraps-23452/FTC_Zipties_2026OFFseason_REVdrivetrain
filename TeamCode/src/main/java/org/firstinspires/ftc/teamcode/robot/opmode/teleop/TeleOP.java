package org.firstinspires.ftc.teamcode.robot.opmode.teleop;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.robot.subsystem.TankDriveTrain2;


@TeleOp(name="TeleOP-DECODE-", group="Iterative Opmode")
public class TeleOP extends OpMode {
    private final ElapsedTime runtime = new ElapsedTime();

    private TankDriveTrain2 tankDrivetrain;

    @Override
    public void init() {
        telemetry.addData("Status", "Initializing");

        tankDrivetrain = new TankDriveTrain2(hardwareMap);

        telemetry.addData("Status", "Initialized");
    }

    @Override
    public void start() {
        // Restart the timer
        runtime.reset();
    }

    @Override
    public void loop() {
        if ( Math.abs(gamepad1.left_stick_y) > 0.1){
            tankDrivetrain.setDrivePower(gamepad1.left_stick_y);
        } else if (Math.abs(gamepad1.right_stick_x) > 0.1) {
            tankDrivetrain.setRotationPower(gamepad1.right_stick_x, -gamepad1.right_stick_x);
        } else  {
            tankDrivetrain.setDrivePower(0);
        }
        telemetry.addData("Status", "Run Time: " + runtime.toString());

    }
}