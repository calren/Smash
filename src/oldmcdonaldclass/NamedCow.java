package oldmcdonaldclass;

public class NamedCow extends Cow {

	private String name;

	NamedCow(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getType() {
		return name + " the cow";
	}

}
