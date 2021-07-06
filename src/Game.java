import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Game {
	JFrame frame;
	int windowWidth = 1080;
	int windowHeight = 720;
	
	JButton btnStart;
	
	Player player1;
	
	public Game() {
		player1 = new Player(0, "hans", "Kreis", 0);
		
		//set Button
		btnStart = new JButton("Start");
		
		 btnStart.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent e){
	    		  btnStart.setVisible(false);
	    		  // Vielleicht ein Käfer Fehler
	    		  frame.add(new Board());
	    	             
	    	  }
	      }
	      );
		
	}
	
	public void setupGame() {
		frame = new JFrame("fortnite");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.add(btnStart);
		frame.setUndecorated(true);
		frame.setVisible(true);
	}
	
	public void update() { 
		
	}
	
	public void render() {
		
	}
}
