package org.firstinspires.ftc.teamcode.robot.opmode.teleop;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.robot.subsystem.TankDriveTrain;


@TeleOp(name="TeleOP-DECODE-", group="Iterative Opmode")
public class TeleOP extends OpMode {
    private final ElapsedTime runtime = new ElapsedTime();

    private TankDriveTrain tankDrivetrain;

    @Override
    public void init() {
        telemetry.addData("Status", "Initializing");

        tankDrivetrain = new TankDriveTrain(hardwareMap);

        telemetry.addData("Status", "Initialized");
    }

    @Override
    public void init_loop() {
    }

    @Override
    public void start() {
        // Restart the timer
        runtime.reset();
    }


    @Override
    public void loop() {
        //drivetrain
        tankDrivetrain.setMotorPower(gamepad1.left_trigger, gamepad1.right_trigger);

        telemetry.addData("Status", "Run Time: " + runtime.toString());
    }

    @Override
    public void stop() {
    }

}