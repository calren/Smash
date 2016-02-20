package inheritance;

public class Turtle extends Animal{

	boolean hasShell = true;
	
	public void eat() {
		System.out.println("eating");
	}
	
	public void sleep() {
		System.out.println("sleeping");
	}
	
	public void crawl() {
		System.out.println("crawling");
	}
}
