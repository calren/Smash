package game;

import java.util.Scanner;

public class Play {

	/*
	 * TODO The monster you're battling is going to start with 100 hit points;
	 */
	static int monsterHitPoints;

	public static void main() {
		Scanner input = new Scanner(System.in);
		System.out.println("input player 1 name and press enter");
		String player1Name = input.next();
		/*
		 * Initialize a player 1 that has the input player name, 100 hit points,
		 * and is level 1
		 */
		Player player1;
		/*
		 * TODO print player one's information
		 */

		System.out.println("the monster has 100 hitpoints");

		while (true) {
			/*
			 * TODO if player1's hit points < 0, that means you died
			 */
			if ( ) {
				System.out.println("you died");
				return;
			}

			/*
			 * TODO if the monster's hit points < 0, that means you won!
			 */
			if ( ) {
				System.out.println("you won!");
				return;
			}
			System.out.println("do you want to attack or heal? type one option and press enter");
			String choice = input.next();

			/*
			 * You can either chose to heal or attack If you heal, you heal by a
			 * random number between 0 - 10 If you attack, the monster is
			 * attacked by a random number between 0 - 10
			 */
			if (choice.equals("heal")) {
				random(1, 10);
				// TODO heal the player by amountToHeal

				System.out.println("You now have: " + player1.getNumberOfHitPoints() + " hit points left");
				System.out.println("The monster has: " + monsterHitPoints + " hit points left");
				random(0, 15);
				// TODO attack the player by the number of hit points damaged

			} else if (choice.equals("attack")) {
				random(1, 10);
				// TODO subtract the monster's hit points by attackDealt

				System.out.println("You now have: " + player1.getNumberOfHitPoints() + " hit points left");
				System.out.println("The monster has: " + monsterHitPoints + " hit points left");
				// TODO attack the player by the number of hit points damaged

			} else {
				System.out.println("please type attack or heal");
			}
		}
	}

	private static int random(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}
}
