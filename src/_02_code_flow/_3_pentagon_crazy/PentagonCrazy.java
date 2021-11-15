package _02_code_flow._3_pentagon_crazy;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class PentagonCrazy {
	
	public static void main(String[] args) {
		
		//  Create a new Robot
		Robot ga = new Robot();
		//  Put the robot's pen down
		ga.penDown();
		//  SPEED. Make the robot go at maximum speed (100)
        ga.setSpeed(100);
		//  COLOR. Set the pen to a color that you like for the shape
       
		//  NUMBER OF SIDES. Make an int variable for the number of sides the shape will have.
		//  				(Hint: its called PentagonCrazy)
        int pentagonCrazy = 5;
		//  TURN ANGLE. Make another int variable for the angle the robot must turn. 
		//  			Hint: Divide 360 by the number of sides the shape has to get the angle.
		int angle = 360/pentagonCrazy;
		//  COUNT. Make another int variable to count how many times the loop has repeated
		//         Set its start value to zero.
while(pentagonCrazy<701) {
		//  LOOP. Start a while loop to repeat the DRAW, TURN, and INCREASE COUNT code 200 times. 
	 ga.setPenColor(0,0,0);
				//  DRAW.  Make the robot move the amount in your count variable
		ga.move(pentagonCrazy);
				//  TURN.  Turn the robot the amount in your angle variable + 1
		ga.turn(angle);
				//  INCREASE COUNT. Increase the count by 1
		pentagonCrazy+=1;
		//  End the while loop here
}
		//  Now hide the robot so you can see the pattern it has drawn.
		ga.hide();
		//  Run the program. 
		//  Check the pattern against the picture in the recipe. If it matches, you are done!
	

	
	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	}
}
