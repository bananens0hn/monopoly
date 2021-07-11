import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JFrame{
	JFrame frame;
	Menu menu ;
	int windowWidth = 1080;
	int windowHeight = 720;
	
	public Game() {
		menu = new Menu(this);
	}
	
	public void setupGame() {
		frame = new JFrame("fortnite");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.add(menu);
		frame.setUndecorated(true);
		frame.setVisible(true);
	}
	
	public void setBoard() {
		frame.add(new GamePanel());
	}
	
}
