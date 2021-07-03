import javax.swing.JFrame;

public class Game {
	JFrame frame;
	int windowWidth = 1080;
	int windowHeight = 720;
	
	Player player1;
	
	public Game() {
		player1 = new Player(0, "hans", "Kreis", 0);
	}
	
	public void setupGame() {
		frame = new JFrame("fortnite");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.add(new Board());
		frame.setUndecorated(true);
		frame.setVisible(true);
	}
	
	public void update() { 
		
	}
	
	public void render() {
		
	}
}
