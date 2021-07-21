import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import sun.awt.www.content.image.gif;

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
	
	private BufferedImage w�rfel;
	
	private boolean drawDice;
	private boolean buyMenuVisible;
	
	
	public BoardInformationMenu(Board b) {
		board = b;
		players = board.players;
		
		this.setPreferredSize(new Dimension(board.windowWidth/ 3, board.windowHeight));
		
		setDiceButton();
		setNextTurnButton();
		setDiceImages();
		setBuyMenu();
	}
	
	private void setDiceButton() {		

		diceButton = new JButton("W�rfeln");
		this.add(diceButton);
		
		
		//w�rfel button onclick 
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
					buyMenuVisible = true;
				}
				
				drawDice = true;
				
				repaint();
			}});
		
	}
	
	private void setBuyMenu() {
		buyButton = new JButton("Kaufen");
		buyButton.setBounds(0, 650, 50, 25);
		this.add(buyButton);
		buyButton.setVisible(false);
		
		buyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				board.buyField();
				buyMenuVisible = false;
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
				drawDice = false;
				repaint();
			}});
		
		// w�rfelbild
				try {
					w�rfel = ImageIO.read(new File("src/Assets/w�rfel/wuerfelaugen-1-6.png"));
					
				} catch (IOException e) {
					// 
					e.printStackTrace();
				}
	}
	
	private void setDiceImages() {
		firstDice = 0;
		secondDice = 0;
		
	}
	
	private void setPlayerInformation() {
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//w�rfelaugen anzeigen
		
		if(drawDice) {
			switch (firstDice) {
				case 1:
					g.drawImage(w�rfel.getSubimage(0,0, 250, 250), 0, 20, null);
					break;
				case 2:
					g.drawImage(w�rfel.getSubimage(250 + 25,0, 250, 250), 0, 20, null);
					break;
				case 3:
					g.drawImage(w�rfel.getSubimage(500 + 50 ,0, 250, 250), 0, 20, null);
					break;
				case 4:
					g.drawImage(w�rfel.getSubimage(750 + 75,0, 250, 250), 0, 20, null);
					break;
				case 5:
					g.drawImage(w�rfel.getSubimage(1000 + 100,0, 250, 250), 0, 20, null);
					break;
				case 6:
					g.drawImage(w�rfel.getSubimage(1250 + 123,0, 250, 250), 0, 20, null);
					break;
				default:
					break;
			}
			
			switch (secondDice) {
				case 1:
					g.drawImage(w�rfel.getSubimage(0,0, 250, 250), 270, 20, null);
					break;
				case 2:
					g.drawImage(w�rfel.getSubimage(250 + 25,0, 250, 250), 270, 20, null);
					break;
				case 3:
					g.drawImage(w�rfel.getSubimage(500 + 50 ,0, 250, 250), 270, 20, null);
					break;
				case 4:
					g.drawImage(w�rfel.getSubimage(750 + 75,0, 250, 250), 270, 20, null);
					break;
				case 5:
					g.drawImage(w�rfel.getSubimage(1000 + 100,0, 250, 250), 270, 20, null);
					break;
				case 6:
					g.drawImage(w�rfel.getSubimage(1250 + 123,0, 250, 250), 270, 20, null);
					break;
				default:
					break;
			}
		}
		
		//draw Buy menu
		
		if(buyMenuVisible) {
			g.drawRect(0, 650, 400, 300);
		}
		
		//draw player information
		
		for(int i = 0; i < board.NumberOfplayers; i++) {
			
			g.drawRect(0, 375 + i * 50, 250, 50);
			g.drawLine(150, 375 + i * 50, 150, 425 + i * 50);
			g.drawString(players[i].playerName, 5, 400 + i*50);
			g.drawString(String.valueOf(players[i].playerBalance) + " � ", 175, 400 + i*50);
			
		}
		
	}
}
