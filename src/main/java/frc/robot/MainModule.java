package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class MainModule extends AbstractModule {

    public static class DrivetrainModule extends AbstractModule {

        private SpeedController drivetrainLeft1 = new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_MOTOR_LEFT1);
        private SpeedController drivetrainLeft2 = new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_MOTOR_LEFT2);

        private SpeedController drivetrainRight1 = new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_MOTOR_RIGHT1);
        private SpeedController drivetrainRight2 = new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_MOTOR_RIGHT2);

        private SpeedController drivetrainLeftGroup = new SpeedControllerGroup(drivetrainLeft1, drivetrainLeft2);
        private SpeedController drivetrainRightGroup = new SpeedControllerGroup(drivetrainRight1, drivetrainRight2);

        @Override
        protected void configure() {
            bind(SpeedController.class)
                    .annotatedWith(Names.named("drivetrain-left-sp")).toInstance(drivetrainLeftGroup);
            bind(SpeedController.class)
                    .annotatedWith(Names.named("drivetrain-right-sp")).toInstance(drivetrainRightGroup);
        }
    }


    @Override
    protected void configure() {
        install(new DrivetrainModule());
    }
}
