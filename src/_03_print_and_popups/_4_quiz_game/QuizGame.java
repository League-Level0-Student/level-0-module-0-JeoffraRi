package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score= 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String input = JOptionPane.showInputDialog("What is 30486.342 ^ 2786.3598 + (-1540)?");
				// 3.  Use an if statement to check if their answer is correct
				if(input.contentEquals("infinity")) {
				// 4.  if the user's answer was correct, add one to their score 
				score=+1;
				}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
				else {
					score=-1;
				}
String innput = JOptionPane.showInputDialog("who is Joe?");
				
				if(innput.contentEquals("Joe Mama")) {
				
				score=+1;
				}
		
				else {
					score=-1;
				}
String innnput = JOptionPane.showInputDialog("Who commited the first sin?");
				
				if(innnput.contentEquals("Adam")) {
				
				score=+1;
				}
		
				else {
					score=-1;
				}
String innnnput = JOptionPane.showInputDialog("What is big, purple, and stands over all?");
				
				if(innnnput.contentEquals("Kevin the cube")) {
				
				score=+1;
				}
		
				else {
					score=-1;
				}
String innnnnput = JOptionPane.showInputDialog("Do you have a waifu?");
				
				if(innnnnput.contentEquals("yes")) {
				
				score=+1;
				}
		
				else {
					score=-1;
				}
		// After all the questions have been asked, tell the user their final score 
				JOptionPane.showMessageDialog(null,"Your score is " + score  + "/1" );
	}
}
