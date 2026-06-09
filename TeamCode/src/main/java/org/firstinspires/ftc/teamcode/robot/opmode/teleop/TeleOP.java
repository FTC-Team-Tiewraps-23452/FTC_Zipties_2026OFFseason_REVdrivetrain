package org.firstinspires.ftc.teamcode.robot.opmode.teleop;


import static java.lang.Math.abs;

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
        if (gamepad1.right_trigger >0.1){
            storage.setRotationPower(0.5);
        }

        if (gamepad1.right_bumper){
            intake.setIntakePower ();}
        else if (gamepad1.left_bumper){
            intake.reverse();}
        else {
            intake.stop();}


            if (abs(gamepad1.left_stick_y) > 0.1) {
                tankDrivetrain.setDrivePower(gamepad1.left_stick_y);
            } else if (abs(gamepad1.right_stick_x) > 0.1) {
                tankDrivetrain.setTurnPower(gamepad1.right_stick_x, -gamepad1.right_stick_x);
            }

        telemetry.addData("Status", "Run Time: " + runtime.toString());
}}