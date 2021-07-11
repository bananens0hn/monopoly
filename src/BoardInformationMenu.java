import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BoardInformationMenu extends JPanel {
	
	//public boolean isDiceRolling;
	private Dice dice;
	private JButton diceButton;
	private Board board;
	
	//dice numbers
	private int firstDice;
	private int secondDice;
	
	private Rectangle rect;
	
	
	public BoardInformationMenu(Board b) {
		board = b;
		
		this.setPreferredSize(new Dimension(board.windowWidth/6, board.windowHeight));
		
		setDiceButton();
		setDiceImages();
	}
	
	private void setDiceButton() {

		dice = new Dice();
		diceButton = new JButton("W�rfeln");
		this.add(diceButton);
		
		//w�rfel button onclick 
		diceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board.setDiceRolling();
				
				firstDice = board.dice1value;
				secondDice = board.dice2value;
				
				repaint();
			}});
	}
	
	private void setDiceImages() {
		firstDice = 0;
		secondDice = 0;
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		String s1 = String.valueOf(firstDice);
		String s2 = String.valueOf(secondDice);
		
		g.drawString(s1, 200, 200);
		g.drawString(s2, 300, 200);
	}
}
