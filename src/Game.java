import java.awt.Dimension;

import javax.swing.JFrame;

public class Game {
	private JFrame frame;
	
	Player player1;
	
	public Game() {
		player1 = new Player(0, "hans", "Kreis");
	}
	
	public void setupGame() {
		frame = new JFrame("fortnite");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.add(new Board(frame));
		frame.setVisible(true);
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public void update() { 
		
	}
	
	public void render() {
		
	}
}
