package comp316;

public class TestAnimal {
	
	public static void main(String[] args) {
		Mammal animal1 = new Lion();
		Mammal animal2 = new Elephant();
		
		for(int i = 0;i<5;i++) {
			animal1.say();
			animal2.say();
		}
	}

}
