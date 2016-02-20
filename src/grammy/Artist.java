package grammy;

public class Artist {

	private String name;
	private int numberOfGrammysWon;

	public Artist(String name, int numberOfGrammysWon) {
		this.name = name;
		this.numberOfGrammysWon = numberOfGrammysWon;
	}

	public String getName() {
		return name;
	}

	public int getNumberOfGrammysWon() {
		return numberOfGrammysWon;
	}
}
