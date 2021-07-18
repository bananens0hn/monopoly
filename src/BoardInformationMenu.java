import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BoardInformationMenu extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//public boolean isDiceRolling;
	private JButton diceButton;
	private JButton nextTurnButton;
	private JButton buyButton;
	private Board board;
	
	//dice numbers
	private int firstDice;
	private int secondDice;
	
	private Rectangle rect;
	
	private Player[] players;
	private String[] playerNames;
	
	
	public BoardInformationMenu(Board b) {
		board = b;
		players = board.players;
		
		this.setPreferredSize(new Dimension(board.windowWidth/6, board.windowHeight));
		
		setDiceButton();
		setNextTurnButton();
		setDiceImages();
		setBuyButton();
	}
	
	private void setDiceButton() {		

		diceButton = new JButton("Würfeln");
		this.add(diceButton);
		
		
		//würfel button onclick 
		diceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board.setDiceRolling();
				
				firstDice = board.dice1value;
				secondDice = board.dice2value;
				
				diceButton.setVisible(false);
				nextTurnButton.setVisible(true);
			
				buyButton.setVisible(false);
				if(board.fieldIsBuyable()) {
					buyButton.setVisible(true);
				}
				
				repaint();
			}});
		
	}
	
	private void setBuyButton() {
		buyButton = new JButton("Kaufen");
		this.add(buyButton);
		buyButton.setVisible(false);
		
		
		
		buyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board.buyField();
				buyButton.setVisible(false);
				repaint();
			}});
	}
	
	private void setNextTurnButton() {
		nextTurnButton = new JButton("Weiter");
		this.add(nextTurnButton);
		nextTurnButton.setVisible(false);
		
		nextTurnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board.nextTurn();
				
				nextTurnButton.setVisible(false);
				diceButton.setVisible(true);
				
				repaint();
			}});
	}
	
	private void setDiceImages() {
		firstDice = 0;
		secondDice = 0;
		
	}
	
	private void setPlayerInformation() {
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		String s1 = String.valueOf(firstDice);
		String s2 = String.valueOf(secondDice);
		
		g.drawString(s1, 200, 200);
		g.drawString(s2, 300, 200);
		
		//draw player information
		
		for(int i = 0; i < board.NumberOfplayers; i++) {
			
			g.drawRect(0, 375 + i * 50, 250, 50);
			g.drawLine(150, 375 + i * 50, 150, 425 + i * 50);
			g.drawString(players[i].playerName, 5, 400 + i*50);
			g.drawString(String.valueOf(players[i].playerBalance) + " € ", 175, 400 + i*50);
			
		}
		
	}
}
