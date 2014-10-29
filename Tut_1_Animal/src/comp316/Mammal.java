package comp316;

public abstract class Mammal {
	String name;
	
	public Mammal(String name) {
		this.name = name;
	}
	
	public void say() {
		System.out.println("I am animal!");
	}
}
