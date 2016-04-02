package oldmcdonaldclass;

public class Pig implements Animal {
	private String myType;
	private String mySound;

	Pig() {
		myType = "pig";
		mySound = "oink";
	}

	@Override
	public String getSound() {
		return mySound;
	}

	@Override
	public String getType() {
		return myType;
	}
}
