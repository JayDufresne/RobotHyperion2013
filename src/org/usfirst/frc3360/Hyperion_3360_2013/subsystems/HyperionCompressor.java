// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc3360.Hyperion_3360_2013.subsystems;
import org.usfirst.frc3360.Hyperion_3360_2013.RobotMap;
import org.usfirst.frc3360.Hyperion_3360_2013.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class HyperionCompressor extends Subsystem {
    
    Compressor m_Compressor = RobotMap.robotCompressor;
    
    public HyperionCompressor() {
        m_Compressor.start();
    }

    protected void initDefaultCommand() {
        
    }
}
