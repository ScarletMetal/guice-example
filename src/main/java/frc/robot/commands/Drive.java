package frc.robot.commands;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Drivetrain;

import java.util.function.Supplier;

public class Drive extends Command {

    private Supplier<Double> moveSupplier, rotateSupplier;

    @Inject(optional = true) @Named("drivetrain")
    private Drivetrain drivetrain;

    public Drive(Supplier<Double> moveSupplier, Supplier<Double> rotateSupplier) {
        this.moveSupplier = moveSupplier;
        this.rotateSupplier = rotateSupplier;
    }


    @Override
    protected void execute() {
        drivetrain.move(moveSupplier.get(), rotateSupplier.get());
    }

    @Override
    protected void end() {
        drivetrain.stop();
    }

    @Override
    protected void interrupted() {
        end();
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }
}
