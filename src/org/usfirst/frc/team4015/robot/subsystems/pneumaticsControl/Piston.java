package org.usfirst.frc.team4015.robot.subsystems.pneumaticsControl;

import edu.wpi.first.wpilibj.Solenoid;

/* ===================================================
 * This class enables control of a piston using a double
 * soleniod.  To create a piston, construct and instance
 * of this object with the solenoid channels as arguments.
 * 
 * NOTE: THIS CLASS ONLY WORKS WHEN USING DOUBLE SOLENOIDS
 * =================================================*/

public class Piston
{
	public Solenoid left;
	public Solenoid right;
	boolean isExtended;
	
	// CONTRUCTOR WITH CHANNEL ARGUMENTS //
	
	public Piston(int leftChannel, int rightChannel)
	{
		left = new Solenoid(leftChannel);
		right = new Solenoid(rightChannel);
		isExtended = false;
	}
	
	// DEFAULT CONSTRUCTOR //
	
	public Piston()
	{
		left = new Solenoid(0);
		right = new Solenoid(1);
		isExtended = false;
	}
	
	// EXTEND PISTON //
	
	public void extend()
	{
		left.set(true);
		right.set(false);
		isExtended = true;
	}
	
	// RETRACT PISTON //
	
	public void retract()
	{
		left.set(false);
		right.set(true);
		isExtended = false;
	}
	
	// TOGGLE PISTON //
	
	public void toggle()
	{
		if (isExtended == false)
		{
			extend();
		}
		else
		{
			retract();
		}
	}
	
}