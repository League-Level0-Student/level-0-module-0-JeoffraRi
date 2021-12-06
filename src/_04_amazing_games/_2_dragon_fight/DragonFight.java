package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		int playerHealth = 100;
			// playerHealth to store your health - set it equal to 100
		int dragonHealth = 100;
			// dragonHealth to store the dragon's health - set it equal to 100

		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
			int playerAttack = 0;
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.
			int dragonAttack = 0;
		
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON

				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
			String answer = JOptionPane.showInputDialog(null, "You spot a ferocious dragon. Would you like to [yell] at it or [kick] it?");
				// 4. If they typed in "yell":
			if(answer.equalsIgnoreCase("yell")) {
					  // -- Find a random number between 0 and 10 and store it in playerAttack. Use
				playerAttack = ran.nextInt(20);
				JOptionPane.showMessageDialog(null,"You shout at the dragon, \"You're fat!\" The dragon frowns, sneaking a glance at his belly. Dragon's health: "+dragonHealth);
			}
				// 5. If they typed in "kick":
			if(answer.equalsIgnoreCase("kick")) {
					  // -- Find a random number between 0 and 25 and store it in playerAttack.
				playerAttack = ran.nextInt(25);
				JOptionPane.showMessageDialog(null,"You're glad for being an ex acrobat/human cannon/martial artist as you hop up the dragon's body and deliver a roundhouse to his face. \"YOUUCH!\" he cries. Dragon's health: "+dragonHealth);
			}	
				// 6. Subtract the player attack value from the dragon's health
				dragonHealth-=playerAttack;
			// THE DRAGON RETALIATES

				// 7. Find a random number between 0 and 35 and store it in dragonAttack
				dragonAttack = ran.nextInt(20);
				// 8. Subtract the dragon attack value from the player's health
				playerHealth-=dragonAttack;
				JOptionPane.showMessageDialog(null,"The dragon retaliates in response with a blast of fiery death from his menacing jaws. Your health: "+playerHealth);
			// ASSESS THE DAMAGE

				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
				if(playerHealth <= 0) {
			    JOptionPane.showMessageDialog(null,"\"NOOOOOOOO!!!\" You fall to your knees as the dragon cackles with evilness.");
				playerLost();
				}
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method
				if(dragonHealth <= 0) {
				JOptionPane.showMessageDialog(null,"The dragon roars and collapses with a BOOM. *triumphant horn sound* You stand on the downed beast and hold up your sword high!");
				dragonLost();
				}
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.

			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
				

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure


		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!

		System.exit(0);   //This code ends the program
	}

}
