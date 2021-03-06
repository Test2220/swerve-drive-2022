package frc.robot.subsystems.drivetrain;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;

public class ShuffleboardPID {
    public static ShuffleboardTab tab = Shuffleboard.getTab("PID");

    public static NetworkTableEntry axisP = tab.addPersistent("axisP", 0.25)
        .withSize(1, 1)
        .withPosition(0, 0)
        .getEntry();
    public static NetworkTableEntry axisI = tab.addPersistent("axisI", 0)
        .withSize(1, 1)
        .withPosition(0, 1)
        .getEntry();
    public static NetworkTableEntry axisD = tab.addPersistent("axisD", 0)
        .withSize(1, 1)
        .withPosition(0, 2)
        .getEntry();

    public static NetworkTableEntry rotP = tab.addPersistent("rotP", 0.25)
        .withSize(1, 1)
        .withPosition(1, 0)
        .getEntry();
    public static NetworkTableEntry rotI = tab.addPersistent("rotI", 0)
        .withSize(1, 1)
        .withPosition(1, 1)
        .getEntry();
    public static NetworkTableEntry rotD = tab.addPersistent("rotD", 0)
        .withSize(1, 1)
        .withPosition(1, 2)
        .getEntry();


    public static NetworkTableEntry xPos = tab.addPersistent("xPos", 0)
        .withSize(1, 1)
        .withPosition(3, 0)
        .getEntry();

    public static NetworkTableEntry yPos = tab.addPersistent("yPos", 0)
        .withSize(1, 1)
        .withPosition(4, 0)
        .getEntry();
        
}
