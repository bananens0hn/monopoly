import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Game extends JFrame{
	JFrame frame;
	int windowWidth = 1080;
	int windowHeight = 720;
	
	JButton btnStart;
	
	
	Board board;
	public Game() {
		
		
		//set Button
		btnStart = new JButton("Start");
		board=new Board();
		 btnStart.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent e){
	    		  btnStart.setVisible(false);
	    		  // Vielleicht ein Käfer Fehler
	    		  frame.add(board);
	    	             
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
