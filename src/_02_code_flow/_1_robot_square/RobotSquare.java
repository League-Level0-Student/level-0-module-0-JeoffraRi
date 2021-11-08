package _02_code_flow._1_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	
    public static void main(String[] args){
    	// This code makes a new Robot
    	Robot rob = new Robot();
    	int count = 0;
    	int turnTimes = 7;
        // PEN.  Put the robot's pen down so it can draw, Use this command:
rob.penDown();
        // SPEED. Make the robot move quickly. Use this command:
rob.setPenColor(Color.ORANGE);
rob.setSpeed(50);
count = 0;
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(60);
     count += 1;
}
count = 0;
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(-60);
     count += 1;
}
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(60);
     count += 1;
}
rob.setSpeed(50);
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(60);
     count += 1;
}
count = 0;
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(-60);
     count += 1;
}
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(-60);
     count += 1;
}
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(60);
     count += 1;
}
count = 0;
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(60);
     count += 1;
}
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(-60);
     count += 1;
}
rob.setSpeed(50);
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(-60);
     count += 1;
}
count = 0;
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(60);
     count += 1;
}
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(60);
     count += 1;
}
rob.setSpeed(50);
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(-60);
     count += 1;
}
count = 0;
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(-60);
     count += 1;
}
while ( count < turnTimes) { 
    rob.move(50);
    rob.turn(60);
     count += 1;
}
    	
    	// Run the program. Did the Robot draw a line and turn?
//NO! IT MADE A STOP SIGN!!!!!!!!!!!!! AAAAAAAGGGGGGHHHH!
    	 
    	
        // LOOP.  Make a while loop and move the DRAW, TURN, and INCREASE COUNT code 
    	//        so it is between the curly braces like the example below. 
    	//        The code in the loop will now repeat 4 times to draw a square.
    	
    	   
    
    	
    	
    	// Run the program again. Did your Robot draw a square?
//I ALREADY TOLD YA WHAT ID DID! IT! MADE! A! STOP! SIGN!

    }
}
