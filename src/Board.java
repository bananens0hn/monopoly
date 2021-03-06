import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board extends JPanel{

	public static Color none1 = new Color(0,0,0, 0);
	public static Color none2 = new Color(0,0,0, 0);
	public static Color none3 = new Color(0,0,0, 0);
	public static Color none4 = new Color(0,0,0, 0);
	
	public Player[] players;
	public int activePlayerIndex = 0;
	
	private static final long serialVersionUID = 1L;
	Field fieldArray [];
	String fieldNameArray [];
	int rowSize = 10;
	int heightColorRectangle = 20;
	public int NumberOfplayers;
	
	//corner images
	private BufferedImage los;
	private BufferedImage knast; 
	private BufferedImage freiParken;
	private BufferedImage geheKnast;
	
	
	private BufferedImage schiff;
	private BufferedImage hut;
	private BufferedImage flugzeug;
	private BufferedImage auto;
	

	private boolean isStart = true;
	
	public int windowHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
	public int windowWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
	
	private int longSideField = windowHeight/(rowSize - 2) ;
	private int shortSideField = windowHeight/(rowSize - 1) - longSideField*2/(rowSize - 1);
	
	//dice roll
	private boolean isDiceRolling;
	private Dice dice;
	public int movingDistance;
	public int dice1value;
	public int dice2value;
	
	public Board(int NumberOfPs, String []Figuren, String[] names) {
		
		NumberOfplayers = NumberOfPs;
		players = new Player[NumberOfplayers];
		
		for (int i = 0; i < NumberOfplayers; i++){
			players[i] = new Player(0, Figuren[i], 1000, names[i]);
		}
		
		dice = new Dice();
		
		//set size of jpanel
		this.setPreferredSize(new Dimension(windowWidth / 3 * 2, windowHeight));
		
		fieldArray = new Field[rowSize*4];
		fieldNameArray = new String[rowSize*4];
		
		setPositionofFields();
		
		
		// eckbilder urls setzen 
		try {
			los = ImageIO.read(new URL("https://www.brettspiele-report.de/images/monopoly/monopoly_eckfelder_go_los.jpg"));
			knast = ImageIO.read(new URL("https://www.brettspiele-report.de/images/monopoly_trauminsel/monopoly_trauminsel_eckfelder_gefaengnis.jpg"));
			freiParken = ImageIO.read(new URL("https://i1.wp.com/www.mallorca-services.es/wp-content/uploads/FreiParken.jpg"));
			geheKnast = ImageIO.read(new URL("http://www.rhein-zeitung.de/cms_media/module_img/1044/522467_1_popup_522467_1_org_knast.jpg"));
			
			schiff = ImageIO.read(new File("src/Assets/monopolyShip.jpg"));
			flugzeug = ImageIO.read(new File("src/Assets/dog.jpg"));
			hut = ImageIO.read(new File("src/Assets/hut.jpg"));
			auto = ImageIO.read(new File("src/Assets/car.jpg"));
			
		} catch (IOException e) {
			// 
			e.printStackTrace();
		}
	}
	
	public Board() {
	//	this(3);	//default 3 players
	}



	//position der Felder
	private void setPositionofFields() {
		
		
		//untere Reihe
		
		for (int i = 1; i < rowSize ; i++) {
			fieldArray[i] = new Field(fieldNameArray[i], (rowSize - i - 1) * shortSideField + longSideField, (rowSize - 1) * shortSideField + longSideField, shortSideField, longSideField, 1);
		}
		
		//linke Spalte
		
		for (int i = rowSize + 1; i < rowSize * 2 ; i++) {
			 fieldArray[i] = new Field(fieldNameArray[i], 0, (2 * rowSize - i - 1) * shortSideField + longSideField, longSideField, shortSideField, 2);
		}
		
		//oberere Reihe
		
		for (int i = 2 * rowSize + 1; i < 3 * rowSize ; i++) {
			fieldArray[i] = new Field(fieldNameArray[i], (i - 1 - 2*rowSize) * shortSideField + longSideField, 0, shortSideField, longSideField, 0);
		}
		
		
		//rechte Spalte
		
		for (int i = 3 * rowSize + 1; i < rowSize * 4 ; i++) {
			fieldArray[i] = new Field(fieldNameArray[i], shortSideField * (rowSize - 1) + longSideField, (i - 1 - 3 * rowSize) * shortSideField + longSideField, longSideField, shortSideField, 3);
		}
		
		//Eckfelder
		fieldArray[0] = new Field(FieldInformations.values()[0].name(), shortSideField * (rowSize - 1) + longSideField, (rowSize - 1) * shortSideField + longSideField, longSideField, longSideField, 4);
		fieldArray[10] = new Field(FieldInformations.values()[10].name(), 0, shortSideField * (rowSize - 1) + longSideField, longSideField, longSideField, 4);
		fieldArray[20] = new Field(FieldInformations.values()[20].name(), 0, 0, longSideField, longSideField, 4);
		fieldArray[30] = new Field(FieldInformations.values()[30].name(), shortSideField * (rowSize - 1) + longSideField, 0, longSideField, longSideField, 4);
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		String infoString;
	
		for(int i = 0; i < rowSize *4; i++) {
			infoString = FieldInformations.values()[i].name() + " \n " + FieldInformations.values()[i].price;
			
			g.setColor(FieldInformations.values()[i].color);
			
			switch(FieldInformations.values()[i].orientation) {
			case 1:
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition, fieldArray[i].width, heightColorRectangle);
				g.setColor(Color.BLACK);
				g.drawString(infoString, fieldArray[i].xPosition, fieldArray[i].yPosition + shortSideField/2);
				break;
			case 2:
				g.fillRect(fieldArray[i].xPosition + fieldArray[i].width - heightColorRectangle, fieldArray[i].yPosition, heightColorRectangle, fieldArray[i].height);
				g.setColor(Color.BLACK);
				g.drawString(infoString, 0, fieldArray[i].yPosition + shortSideField/2);
				break;
			case 3:
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition + fieldArray[i].height - heightColorRectangle, fieldArray[i].width, heightColorRectangle);
				g.setColor(Color.BLACK);
				g.drawString(infoString, fieldArray[i].xPosition, fieldArray[i].yPosition + shortSideField/2);
				break;
			case 4:
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition, heightColorRectangle, fieldArray[i].height);
				g.setColor(Color.BLACK);
				g.drawString(infoString, fieldArray[i].xPosition + longSideField/4 , fieldArray[i].yPosition + shortSideField/2);
				break;
			case 0:
				g.setColor(Color.BLACK);
				g.drawString(FieldInformations.values()[i].name(), fieldArray[i].xPosition, fieldArray[i].yPosition + shortSideField/2);
				break;
			}

			//draw the tiles --- zeichne die Felder(K?stchen)
			g.setColor(Color.BLACK);
			g.drawRect(fieldArray[i].xPosition, fieldArray[i].yPosition, fieldArray[i].width, fieldArray[i].height);
		}
		
		//draw images ---- zeichne die Bilder der jeweiligen Symbole auf dem Feld
		g.drawImage(los, fieldArray[0].xPosition, fieldArray[0].yPosition, longSideField, longSideField, null);
		g.drawImage(knast, fieldArray[rowSize].xPosition, fieldArray[rowSize].yPosition, longSideField, longSideField, null);
		g.drawImage(freiParken, fieldArray[2*rowSize].xPosition, fieldArray[2*rowSize].yPosition, longSideField, longSideField, null);
		g.drawImage(geheKnast, fieldArray[3*rowSize].xPosition, fieldArray[3*rowSize].yPosition, longSideField, longSideField, null);
		if(isStart) {
			
			
			for (int j = 0; j < players.length; j++) {
				
		
			switch (players[j].figure) {
			case "Schiff":
			
				g.drawImage(schiff, fieldArray[0].xPosition+15, fieldArray[0].yPosition+15, 50, 50, null);
			
				
				break;
			case "Hut":
				
				g.drawImage(flugzeug,  fieldArray[0].xPosition+15 +100, fieldArray[0].yPosition+15, 50, 50, null);
				
			case "Flugzeug":
			
				g.drawImage(hut, fieldArray[0].xPosition+15, fieldArray[0].yPosition+15 +100, 50, 50, null);
				
				break;
			case "Auto":
				
				g.drawImage(auto, fieldArray[0].xPosition+15 +100, fieldArray[0].yPosition+15 +100, 50, 50, null);
				
				break;
			default:
				break;
			}
		}
			isStart=false; 
			fieldArray[0].setPlayersThere(players.length);
		}
		
		
		if(isDiceRolling) {

			
			isDiceRolling = false;
			
			//Player position update
			
			paintComponent(g);
			
			fieldArray[players[activePlayerIndex].getPosition()].decrementPlayersThere();
			
			players[activePlayerIndex].goForward(movingDistance);
			
			fieldArray[players[activePlayerIndex].getPosition()].incrementPlayersThere();
			

			
			for (int i = 0; i < players.length; i++) {
				if(fieldArray[players[i].getPosition()].playersThere>1) {
					
					g.drawImage(conv(players[i].figure), fieldArray[players[i].getPosition()].xPosition + fieldArray[players[i].getPosition()].width/2-20, fieldArray[players[i].getPosition()].yPosition + fieldArray[players[i].getPosition()].height/2-20+20*i, 50,50, null);
					System.out.println("we drawin");
					
					//doenst work yet
				}
					
			
				g.drawImage(conv(players[i].figure), fieldArray[players[i].getPosition()].xPosition + fieldArray[players[i].getPosition()].width/2-20, fieldArray[players[i].getPosition()].yPosition + fieldArray[players[i].getPosition()].height/2-20, 50,50, null);
				g.drawString(players[i].playerName, fieldArray[players[i].getPosition()].xPosition+ fieldArray[players[i].getPosition()].width/2-20, fieldArray[players[i].getPosition()].yPosition + fieldArray[players[i].getPosition()].height/2-10);
				
				
					}
		
			
			}
		
			
			//Miete zahlen 
			
			int fieldOwner = FieldInformations.values()[players[activePlayerIndex].getPosition()].getOwner();
			
			if(fieldOwner != -1 && fieldOwner != activePlayerIndex) {
				
				System.out.println(players[activePlayerIndex].getName() + " hat gezahlt " + FieldInformations.values()[players[activePlayerIndex].getPosition()].getRent() + "Geld an " + players[fieldOwner].getName());
				
					players[activePlayerIndex].decreasePlayerBalance(FieldInformations.values()[players[activePlayerIndex].getPosition()].getRent());
					players[fieldOwner].increasePlayerBalance(FieldInformations.values()[players[activePlayerIndex].getPosition()].getRent());
				}
			if(FieldInformations.values()[players[activePlayerIndex].getPosition()].name().contentEquals("GEHE_GEF?NGNIS")) {
				
				System.out.println(players[activePlayerIndex].getName() + " muss ins Gef?ngnis");
				fieldArray[players[activePlayerIndex].getPosition()].decrementPlayersThere();
				players[activePlayerIndex].setPosition(10);
				fieldArray[players[activePlayerIndex].getPosition()].incrementPlayersThere();
				paintComponent(g);
				boolean checkAgainst=true;
				
				for (int i = 0; i < players.length; i++) {
					if(fieldArray[players[i].getPosition()].playersThere>1&&checkAgainst==true) {
						
						g.drawImage(conv(players[i].figure), fieldArray[players[i].getPosition()].xPosition + fieldArray[players[i].getPosition()].width/2-20, fieldArray[players[i].getPosition()].yPosition + fieldArray[players[i].getPosition()].height/2-20+10*fieldArray[players[i].getPosition()].playersThere, 50,50, null);
						System.out.println("we drawin");
						checkAgainst=false;
						if(i==players.length-1) {
							
							break;
						}else {
							
							i++;
						}
					}
						
				
					g.drawImage(conv(players[i].figure), fieldArray[players[i].getPosition()].xPosition + fieldArray[players[i].getPosition()].width/2-20, fieldArray[players[i].getPosition()].yPosition + fieldArray[players[i].getPosition()].height/2-20, 50,50, null);
					g.setColor(Color.black);
					g.drawString(players[i].playerName, fieldArray[players[i].getPosition()].xPosition+ fieldArray[players[i].getPosition()].width/2-20, fieldArray[players[i].getPosition()].yPosition + fieldArray[players[i].getPosition()].height/2-10);
					g.setColor(Color.black);	
					
						}
				checkAgainst=true;
			}
			}
		

	private BufferedImage conv(String figure) {
		switch (figure) {
		case "Schiff":
			return schiff;
		
		case "Hut":
			return hut;
			
		case "Flugzeug":
			return flugzeug;
		case "Auto":
			return auto;
		default:
			break;
		}
		return null;
	}
	public boolean fieldIsBuyable() {
		int position = players[activePlayerIndex].getPosition() + dice1value + dice2value;
		
		if (position > 39){
			position = position - 38;
		}
		
		//console information
		System.out.println("---" + FieldInformations.values()[position].name() + "---");
		
		if( FieldInformations.values()[position].getIsBuyable() && FieldInformations.values()[position].getOwner() == -1) {
			System.out.println("Feld kann gekauft werden");
			
		}else if( FieldInformations.values()[position].getOwner() != -1) {
			System.out.println("Feld geh?rt " +  players[activePlayerIndex].getName());
			
		}else if( !FieldInformations.values()[position].getIsBuyable()) {
			System.out.println("Feld kann nicht gekauft werden");
		}
		
		//return
		if( !FieldInformations.values()[position].getIsBuyable() || FieldInformations.values()[position].getOwner() != -1) {
		return false;
		} else {
			return true;
		}
	}
	
	public void buyField() {
		
		if(players[activePlayerIndex].getPlayerBalance() >= FieldInformations.values()[players[activePlayerIndex].getPosition()].getPrice()) {
			System.out.println("verkauft an " + players[activePlayerIndex].getName());
			FieldInformations.values()[players[activePlayerIndex].getPosition()].setOwner(activePlayerIndex);
			players[activePlayerIndex].decreasePlayerBalance(FieldInformations.values()[players[activePlayerIndex].getPosition()].getPrice());

		}
		else {
			System.out.println("nicht genug Geld");
		}
		
	}
	
	
	public void setDiceRolling() {
		isDiceRolling = true;
		movingDistance = dice.roll();
		dice1value = dice.first;
		dice2value = dice.second;
		repaint(); 
	}
	
	public void nextTurn() {
		if(activePlayerIndex < players.length - 1) {
			activePlayerIndex++;
		} else {
			activePlayerIndex = 0;
		}
	}
	
	public int getPosition() {
		return players[activePlayerIndex].getPosition();
	}
}
