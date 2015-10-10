package game;

public class Player {
	String name;
	int numberOfHitPoints;

	public Player(String name, int numberOfHitPoints, int level) {
		this.name = name;
		this.numberOfHitPoints = numberOfHitPoints;
	}

	public void printPlayerInformation() {
		System.out.println("Player " + name + " has " + numberOfHitPoints + " hit points left.");
	}

	// TODO return the numberOfHitPoints
	public int getNumberOfHitPoints() {

	}

	// TODO player should heal by hitPointsHealed
	public void heal(int hitPointsHealed) {

	}

	// TODO player should lose hitPointsDamage
	public void attacked(int hitPointsDamage) {

	}

}
