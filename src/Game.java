import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Game extends JFrame{
	JFrame frame;
	Menu menu ;
	Board board;
	int windowWidth = 1080;
	int windowHeight = 720;
	
	public Game() {
		menu = new Menu(this);
		board = new Board();
	}
	
	public void setupGame() {
		frame = new JFrame("fortnite");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.add(menu);
		frame.setUndecorated(true);
		frame.setVisible(true);
	}
	
	public void setBoard() {
		frame.add(board);
	}
}
