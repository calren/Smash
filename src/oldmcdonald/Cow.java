package oldmcdonald;

public class Cow implements Animal {
	private String myType;
	private String mySound;

	Cow() {
		myType = "cow";
		mySound = "moo";
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
