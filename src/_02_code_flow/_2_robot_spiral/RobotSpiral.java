package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */


import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {

	public static void main(String[] args) {
		
		// Create a new Robot
		Robot gy = new Robot();
		// Set your robot's pen down 
		gy.penDown();
		// SPEED. Set the robot to go at max speed (100)
        gy.setSpeed(100);
		// COUNT. Create an int variable that will count how many lines of the spiral we have drawn.
			//        Start its value as zero.
        int spiralLines = 0;
		// LOOP. Start a while loop to repeat the COLOR, DRAW, TURN, and COUNT code below until 50 lines have been drawn
while(spiralLines<10000) {
			// COLOR.   Have the robot set a random pen color:      
	gy.setRandomPenColor();

			// DRAW.    
	gy.move(5*spiralLines);
			//          count is the name of the variable you created earlier

			// TURN.    
	gy.turn(360/7);

			// COUNT.   Increase the count of how many lines have been drawn so far 
	spiralLines+=1;

			// Change the robot pen width to the current value of the count variable 
     gy.setPenWidth(spiralLines);

		//  End the while loop here
}
		// Run the program. 
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		
	}
}
