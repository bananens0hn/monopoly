import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class Board extends JPanel{
	Field fieldArray [];
	String fieldNameArray [];
	int rowSize = 10;
	int shortSideField;
	int longSideField;
	int heightColorRectangle = 20;
	
	//corner images
	private BufferedImage los;
	private BufferedImage knast;
	private BufferedImage freiParken;
	private BufferedImage geheKnast;
	
	
	public Board() {
		
		//board maximized in window ----- Spielbrett im Fenster maximiert
		longSideField = Toolkit.getDefaultToolkit().getScreenSize().height/(rowSize - 2) ;
		shortSideField = Toolkit.getDefaultToolkit().getScreenSize().height/(rowSize - 1) - longSideField*2/(rowSize - 1);
		
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		fieldArray = new Field[rowSize*4];
		fieldNameArray = new String[rowSize*4];
		setPositionofFields();
		
		
		// eckbilder links setzen 
		try {
			los = ImageIO.read(new URL("https://www.brettspiele-report.de/images/monopoly/monopoly_eckfelder_go_los.jpg"));
			knast = ImageIO.read(new URL("https://www.brettspiele-report.de/images/monopoly_trauminsel/monopoly_trauminsel_eckfelder_gefaengnis.jpg"));
			freiParken = ImageIO.read(new URL("https://i1.wp.com/www.mallorca-services.es/wp-content/uploads/FreiParken.jpg"));
			geheKnast = ImageIO.read(new URL("http://www.rhein-zeitung.de/cms_media/module_img/1044/522467_1_popup_522467_1_org_knast.jpg"));

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}



	//position der Felder
	private void setPositionofFields() {
		
		
		//untere Reihe
		
		for (int i = 1; i < rowSize ; i++) {
			fieldArray[i] = new Field(fieldNameArray[i], (rowSize - i - 1) * shortSideField + longSideField , (rowSize - 1) * shortSideField + longSideField, shortSideField, longSideField, 1);
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

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		String infoString;
	
		for(int i = 0; i < rowSize *4; i++) {
			infoString = FieldInformations.values()[i].name() + " \n " + FieldInformations.values()[i].price;
			
			switch(FieldInformations.values()[i].color) {
			case "brown":
				g.setColor(Color.darkGray);
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition, fieldArray[i].width, heightColorRectangle);
				g.setColor(Color.BLACK);
				g.drawString(infoString, fieldArray[i].xPosition, fieldArray[i].yPosition + shortSideField/2);
				break;
			case "lightblue":
				g.setColor(Color.CYAN);
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition, fieldArray[i].width, heightColorRectangle);
				g.setColor(Color.BLACK);
				g.drawString(infoString, fieldArray[i].xPosition, fieldArray[i].yPosition + shortSideField/2);
				break;
			case "purple":
				g.setColor(Color.MAGENTA);
				g.fillRect(fieldArray[i].xPosition + fieldArray[i].width - heightColorRectangle, fieldArray[i].yPosition, heightColorRectangle, fieldArray[i].height);
				g.setColor(Color.BLACK);
				g.drawString(infoString, 0, fieldArray[i].yPosition + shortSideField/2);
				break;
			case "orange":
				g.setColor(Color.ORANGE);
				g.fillRect(fieldArray[i].xPosition + fieldArray[i].width - heightColorRectangle, fieldArray[i].yPosition, heightColorRectangle, fieldArray[i].height);
				g.setColor(Color.BLACK);
				g.drawString(infoString, 0, fieldArray[i].yPosition + shortSideField/2);
				break;
			case "red":
				g.setColor(Color.red);
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition + fieldArray[i].height - heightColorRectangle, fieldArray[i].width, heightColorRectangle);
				g.setColor(Color.BLACK);
				g.drawString(infoString, fieldArray[i].xPosition, fieldArray[i].yPosition + shortSideField/2);
				break;
			case "yellow":
				g.setColor(Color.YELLOW);
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition + fieldArray[i].height - heightColorRectangle, fieldArray[i].width, heightColorRectangle);
				g.setColor(Color.BLACK);
				g.drawString(infoString, fieldArray[i].xPosition, fieldArray[i].yPosition + shortSideField/2);
				break;
			case "green":
				g.setColor(Color.GREEN);
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition, heightColorRectangle, fieldArray[i].height);
				g.setColor(Color.BLACK);
				g.drawString(infoString, fieldArray[i].xPosition + longSideField/4 , fieldArray[i].yPosition + shortSideField/2);
				break;
			case "blue":
				g.setColor(Color.BLUE);
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition, heightColorRectangle, fieldArray[i].height);
				g.setColor(Color.BLACK);
				g.drawString(infoString, fieldArray[i].xPosition + longSideField/4 , fieldArray[i].yPosition + shortSideField/2);
				break;
			case "none1":
				g.setColor(Color.BLACK);
				g.drawString(FieldInformations.values()[i].name(), fieldArray[i].xPosition, fieldArray[i].yPosition + shortSideField/2);
			case "none2":
				g.setColor(Color.BLACK);
				g.drawString(FieldInformations.values()[i].name(), 0, fieldArray[i].yPosition + shortSideField/2);
				break;
			case "none3":
				g.setColor(Color.BLACK);
				g.drawString(FieldInformations.values()[i].name(), fieldArray[i].xPosition, fieldArray[i].yPosition + shortSideField/2);
				break;
			case "none4":
				g.setColor(Color.BLACK);
				g.drawString(FieldInformations.values()[i].name(), fieldArray[i].xPosition + longSideField/4 , fieldArray[i].yPosition + shortSideField/2);
				break;
			}

			//draw the tiles --- zeichne die Felder(K�stchen)
			g.setColor(Color.BLACK);
			g.drawRect(fieldArray[i].xPosition, fieldArray[i].yPosition, fieldArray[i].width, fieldArray[i].height);
		}
		
		//draw images ---- zeichne die Bilder der jeweiligen Symbole auf dem Feld
		g.drawImage(los, fieldArray[0].xPosition, fieldArray[0].yPosition, longSideField, longSideField, null);
		g.drawImage(knast, fieldArray[rowSize].xPosition, fieldArray[rowSize].yPosition, longSideField, longSideField, null);
		g.drawImage(freiParken, fieldArray[2*rowSize].xPosition, fieldArray[2*rowSize].yPosition, longSideField, longSideField, null);
		g.drawImage(geheKnast, fieldArray[3*rowSize].xPosition, fieldArray[3*rowSize].yPosition, longSideField, longSideField, null);

		
	}
}
