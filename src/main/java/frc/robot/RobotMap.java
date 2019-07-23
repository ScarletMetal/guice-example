/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    public interface CAN {
        public static final int DRIVETRAIN_MOTOR_LEFT1 = 5;
        public static final int DRIVETRAIN_MOTOR_LEFT2 = 6;
        public static final int DRIVETRAIN_MOTOR_RIGHT1 = 4;
        public static final int DRIVETRAIN_MOTOR_RIGHT2 = 1;

        public static final int LIFT_MOTOR1 = 0;
        public static final int LIFT_MOTOR2 = 3;
        public static final int LIFT_MOTOR3 = 2;
        public static final int LIFT_ENCODER = 8;
    }

    public interface DIO {
        public static final int LIFT_LIMIT_UP = 9;
        public static final int LIFT_LIMIT_DOWN = 8;

        public static final int DRIVETRAIN_ENCODER_RIGHT1 = 2;
        public static final int DRIVETRAIN_ENCODER_RIGHT2 = 3;
        public static final int DRIVETRAIN_ENCODER_LEFT1 = 0;
        public static final int DRIVETRAIN_ENCODER_LEFT2 = 1;

        public static final int GRIPPER_LIMIT = 6;

        public static final int ARM_LIMIT1 = 4;
        public static final int ARM_LIMIT2 = 5;

        //public static final int LATCH_LIMIT = 6;
    }

    public interface PWM {

        public static final int GRIPPER_MOTOR_1 = 0;
        public static final int GRIPPER_MOTOR_2 = 1;

        public static final int ARM_MOTOR = 2;

        public static final int LATCH_MOTOR = 9;
    }

    public static interface ANALOG_IN {
        public static final int GRIPPER_LASER_SENSOR = 2;
        public static final int ARM_POTENTIOMETER = 0;
    }

    public static interface USB{
        public static final int FRONT_CAM = 0;
        public static final int BACK_CAM = 1;
    }

}
