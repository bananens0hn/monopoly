
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JFrame{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
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
	
	public void setBoard(int spieleranzahl, String[] figuren, JPanel panelToRemove, String[] names) {
		
			
		frame.remove(panelToRemove);			//is shit aber gets the job done???
		frame.add(new GamePanel(spieleranzahl, figuren, names));
		
		
		update(this.getGraphics());

	}
	
}
