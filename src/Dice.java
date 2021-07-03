import java.util.Random;

public class Dice {
	public Dice() {
		
	}
	
	
	Random numberGenerator = new Random(); 
	
	public int roll() {
		return numberGenerator.nextInt(6) + 1 + numberGenerator.nextInt(6) + 1;
	}
}
