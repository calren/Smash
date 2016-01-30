package ListAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PokemonGameTemplate {

	/*
	 * You are creating an aweosme pokemon game
	 * The goal of the game is to catch as many pokemons as possible
	 * 
	 * You start off by having 0 pokemons with you
	 * Each turn, you will encounter a pokemon
	 * You can either chose to try to catch it or run
	 * 
	 * If you chose to catch it, the following things can happen:
	 * a) you can successfully catch the pokemon
	 * b) the pokemon can run away
	 * c) the pokemon can attack you
	 * d) the pokemon can steal one of your pokemons if you have any
	 * 
	 * You start off with 100hp, and the game ends when you have less than 0 HPs
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> pokemons = new ArrayList<>(Arrays.asList("charmander", "squirtle", "bulbasaur", "pikachu", "mew",
				"ditto", "jynx", "onyx", "butterfree", "sandshrew", "clefairy", "jigglypuff", "zubat", "diglet",
				"meowth", "psyduck", "abra", "machop", "tentacool", "slowpoke", "muk"));
		List<String> pokemonsCaught = new ArrayList<String>();
		int hp = 100;
		while (hp > 0) {
			String pokemonAppeared = pokemons.get(getRandomInt(0, pokemons.size() - 1));
			System.out.println("A " + pokemonAppeared + " has appeared!");

			System.out.println("Do you want to 1) try to catch it or 2) run");
			int userInput = input.nextInt();
			if (userInput == 1) {
				// the int random is the random number generated
				int random = getRandomInt(1, 6);
				
				if () {
					// TODO if the random number generated is 1, the pokemon runs away
					// fill in the if case 
					System.out.println(pokemonAppeared + " has ran away");
				} else if () {
					// TODO if the random number generated is 2, you caught the pokemon
					// fill in the else if case 
					System.out.println("You caught " + pokemonAppeared + "!");
					
					// TODO add pokemonAppeared to the arrayList pokemonCaught
				} else if () {
					// TODO if the random number generated is 3, 5, or 6, you get attacked
					// fill in the else if case 
					hp = hp - getRandomInt(5, 50);
					System.out.println(pokemonAppeared + " has attacked you! Now you have " + hp + " hp left");
				} else {
					// if the random number generated was not 1, 2, 3, 5, or 6
					// the pokemon steals one of your pokemons
					if (pokemonsCaught.size() > 0) {
						String pokemonStolen = pokemonsCaught.get(getRandomInt(0, pokemonsCaught.size() - 1));
						// TODO remove pokemonStolen from pokemonsCaught
						System.out.println(pokemonAppeared + " took " + pokemonStolen + " away with him");
					} else {
						System.out.println(pokemonAppeared + " has ran away");
					}
				}

				System.out.println("The pokemons you have now are: " + pokemonsCaught.toString());
			} else {
				continue;
			}
		}
		System.out.println("You caught the following pokemons: " + pokemonsCaught.toString());

	}

	/*
	 * Gives you a random number when you give a min and a max For example, if
	 * you call getRandomInt(0, 5), it will give you a random number between 0
	 * and 5, inclusive. So it could give you 0, 1, 2, 3, 4, or 5.
	 */
	private static int getRandomInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

}
