package org.firstinspires.ftc.teamcode.robot.opmode.teleop;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.robot.subsystem.Intake;
import org.firstinspires.ftc.teamcode.robot.subsystem.Storage;
import org.firstinspires.ftc.teamcode.robot.subsystem.TankDrivetrain;


@TeleOp(name="TeleOP-IntoTheDeep-", group="Iterative Opmode")
public class TeleOP extends OpMode {
    private final ElapsedTime runtime = new ElapsedTime();

    private TankDrivetrain tankDrivetrain;
    private  Intake intake;
    private Storage storage;


    @Override
    public void init() {
        telemetry.addData("Status", "Initializing");
        tankDrivetrain = new TankDrivetrain(hardwareMap);
        telemetry.addData("Status", "Initialized");
        telemetry.addData("Status", "Initializing");
        intake = new Intake(hardwareMap);
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
    public void stop() {
    }


    @Override
    public void loop() {
        if (gamepad1.right_bumper){
            storage.setRotationPower(0.5);
        }

        intake.setIntakePower(gamepad1.left_trigger);
        intake.setIntakePower(-gamepad1.right_trigger);
        tankDrivetrain.setDrivePower(gamepad1.left_stick_y);
        tankDrivetrain.setTurnPower(gamepad1.right_stick_x, -gamepad1.right_stick_x);

        telemetry.addData("Status", "Run Time: " + runtime.toString());
    }
}