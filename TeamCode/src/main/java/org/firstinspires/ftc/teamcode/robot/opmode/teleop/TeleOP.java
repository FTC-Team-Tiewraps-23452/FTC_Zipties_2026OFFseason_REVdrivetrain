package org.firstinspires.ftc.teamcode.robot.opmode.teleop;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.teamcode.robot.subsystem.Intake;
import org.firstinspires.ftc.teamcode.robot.subsystem.Tankdrivetrain;


@TeleOp(name="TeleOP-IntoTheDeep-", group="Iterative Opmode")
public class TeleOP extends OpMode {
    private final ElapsedTime runtime = new ElapsedTime();
    private Intake intake;
    private Tankdrivetrain tankdrivetrain;


    @Override
    public void init() {
        telemetry.addData("Status", "Initializing");

        intake = new Intake(hardwareMap);
        tankdrivetrain = new Tankdrivetrain(hardwareMap);

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
        if (gamepad1.left_bumper){
            intake.setIntakePower();
        }
        else if (gamepad1.right_bumper){
            intake.reverse();
        }
        else {
            intake.stop();
        }

        if (Math.abs(gamepad1.left_stick_y) > 0.1){
            tankdrivetrain.setDrivePower(gamepad1.left_stick_y);
        } else if (Math.abs(gamepad1.right_stick_x) > 0.1){
            tankdrivetrain.setRotationPower(gamepad1.right_stick_x, -gamepad1.right_stick_x);
        } else {
            tankdrivetrain.setDrivePower(0);
        }
        telemetry.addData("Status", "Run Time: " + runtime.toString());
    }

    @Override
    public void stop() {
    }

}