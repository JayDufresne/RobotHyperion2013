// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc3360.Hyperion_3360_2013;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc3360.Hyperion_3360_2013.commands.*;
import org.usfirst.frc3360.Hyperion_3360_2013.subsystems.*;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    Command autonomousCommand1;
    public static OI oi;
    public static double m_canonAngleToShoot = 3.970;
    public static DriveTrain driveTrain;
    public static Ascent_Angle ascentAngle;
    public static Ascent_Chariot ascentChariot;
    public static Ascent_Hook ascentHook;
    public static Frisbee frisbee;
    public static ShooterAngle shooterAngle;
    public static ShooterSpinner shooterSpinner;
    public static HyperionCompressor HyperionCompressor; 
    public static Ascent_Monitoring ascent_Monitoring;
    public static ShooterDeviation shooter_Deviation;
   
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
	RobotMap.init();
        
        driveTrain = new DriveTrain();
        ascent_Monitoring = new Ascent_Monitoring();
        ascentAngle = new Ascent_Angle();
        ascentChariot = new Ascent_Chariot();
        ascentHook = new Ascent_Hook();
        frisbee = new Frisbee();
        shooterAngle = new ShooterAngle();
        shooterSpinner = new ShooterSpinner();
        shooter_Deviation = new ShooterDeviation();
        HyperionCompressor = new HyperionCompressor();
        
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
	
        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        autonomousCommand1 = new AutonomousCommand1();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
    }
    public void autonomousInit() {
        shooter_Deviation.deviatorOff();
        SmartDashboard.putBoolean("Shooter Deviator:", false);
        // schedule the autonomous command (example)
        // J<aime la lasagne
        if (autonomousCommand1 != null) autonomousCommand1.start();
    }
    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }
    public void teleopInit() {
	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand1 != null) autonomousCommand1.cancel();
        
        // When we start the teleop, make sure that the deviator is not in the way.
        shooter_Deviation.deviatorOff();
        SmartDashboard.putBoolean("Shooter Deviator:", false);
    }
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    /**
     * This function called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
