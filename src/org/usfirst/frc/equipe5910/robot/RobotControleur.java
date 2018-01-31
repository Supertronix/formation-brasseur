package org.usfirst.frc.equipe5910.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */

public class RobotControleur extends IterativeRobot {

	VictorSP moteurBrasseurGauche;
	CANTalon moteurBrasseurDroit;
	
	public static final int BRASSEUR_GAUCHE = 16; // SP 8
	public static final boolean INVERSION_BRASSEUR_GAUCHE = false;
	public static final int BRASSEUR_DROIT = 4;
	public static final boolean INVERSION_BRASSEUR_DROIT = false;

	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 * 
	 */
	@Override
	public void robotInit() {
		System.out.println("robotInit()");
		moteurBrasseurGauche = new VictorSP(BRASSEUR_GAUCHE);
		moteurBrasseurGauche.setInverted(INVERSION_BRASSEUR_GAUCHE);		
		moteurBrasseurDroit = new CANTalon(BRASSEUR_DROIT);
		moteurBrasseurDroit.setInverted(INVERSION_BRASSEUR_DROIT);
	}

	/**
	 * This function is run once each time the robot enters autonomous mode
	 */
	@Override
	public void autonomousInit() {
		System.out.println("autonomousInit()");
		// brasser en sens horaire
		moteurBrasseurGauche.set(-1);
		moteurBrasseurDroit.set(-1);
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		System.out.println("autonomousPeriodic()");
	}

	/**
	 * This function is called once each time the robot enters tele-operated
	 * mode
	 */
	@Override
	public void teleopInit() {
		System.out.println("teleopInit()");
		// brasser en sens anti-horaire
		moteurBrasseurGauche.set(1);
		moteurBrasseurDroit.set(1);
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		System.out.println("teleopPeriodic()");
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		System.out.println("testPeriodic()");
	}
	
	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testInit() {
		System.out.println("testInit()");
	}
	
}
