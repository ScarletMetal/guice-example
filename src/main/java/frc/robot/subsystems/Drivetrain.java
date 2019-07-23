package frc.robot.subsystems;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import frc.robot.commands.Drive;

import java.util.function.Supplier;

public class Drivetrain extends Subsystem {

    private DifferentialDrive differentialDrive;


    @Inject
    public Drivetrain(@Named("drivetrain-left-sp") SpeedController leftSpeedController,
                      @Named("drivetrain-right-sp") SpeedController rightSpeedController) {
        super("drivetrain");
        differentialDrive = new DifferentialDrive(leftSpeedController, rightSpeedController);
    }


    public void move(double move, double rotate) {
        differentialDrive.curvatureDrive(move, rotate, true);
    }

    public void stop() {
        move(0, 0);
    }

    public Command createDrive(Supplier<Double> move, Supplier<Double> rotate) {
        Command drive = new Drive(move, rotate);
        Robot.injector.injectMembers(drive);
        return drive;
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(createDrive(Robot.oi::getMoveValue, Robot.oi::getRotateValue));
    }
}
