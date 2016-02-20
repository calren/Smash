package oldmcdonald;

public class NamedCow extends Cow {

	String name = "";

	public NamedCow(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getType() {
		return name + " the cow";
	}
}
