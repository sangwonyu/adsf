package exercise;

public class SoundableExample {
	private static void printSound(Ex03_Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		
		printSound(new Cat());
		printSound(new Dog());
		// TODO Auto-generated method stub

	}

}
