import java.util.Random;

public class Dice {
	
	Random numberGenerator = new Random(); 
	public int first;
	public int second;
	
	public int roll() {
		first = numberGenerator.nextInt(6) + 1;
		second = numberGenerator.nextInt(6) + 1;
		return first + second;
	}
}
