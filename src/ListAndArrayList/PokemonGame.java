package ListAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PokemonGame {

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
				int random = getRandomInt(1, 6);
				if (random == 1) {
					System.out.println(pokemonAppeared + " has ran away");
				} else if (random == 2) {
					System.out.println("You caught " + pokemonAppeared + "!");
					pokemonsCaught.add(pokemonAppeared);
				} else if (random == 3 || random == 5 || random == 6) {
					hp = hp - getRandomInt(5, 50);
					System.out.println(pokemonAppeared + " has attacked you! Now you have " + hp + " hp left");
				} else {
					if (pokemonsCaught.size() > 0) {
						String pokemonStolen = pokemonsCaught.get(getRandomInt(0, pokemonsCaught.size() - 1));
						pokemonsCaught.remove(pokemonStolen);
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
