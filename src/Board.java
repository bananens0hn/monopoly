import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

import java.awt.Toolkit;

public class Board extends JPanel{
	Field fieldArray [];
	String fieldNameArray [];
	int rowSize = 10;
	int shortSideField;
	int longSideField;
	int heightColorRectangle = 20;
	
	
	public Board() {
		
		//board maximized in window ----- Spielbrett im Fenster maximiert
		longSideField = Toolkit.getDefaultToolkit().getScreenSize().height/(rowSize - 2);
		shortSideField = Toolkit.getDefaultToolkit().getScreenSize().height/rowSize - longSideField*2/rowSize;
		
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		fieldArray = new Field[rowSize*4];
		fieldNameArray = new String[rowSize*4];
		setPositionofFields();
	}



	//position der Felder
	private void setPositionofFields() {
		
		
		//untere Reihe
		
		for (int i = 0; i < rowSize ; i++) {
			fieldArray[i] = new Field(fieldNameArray[i], (rowSize - i - 1) * shortSideField + longSideField , rowSize * shortSideField + longSideField, shortSideField, longSideField, 1);
		}
		
		//linke Spalte
		
		for (int i = rowSize; i < rowSize * 2 ; i++) {
			 fieldArray[i] = new Field(fieldNameArray[i], 0, (2 * rowSize - i - 1) * shortSideField + longSideField, longSideField, shortSideField, 2);
		}
		
		//oberere Reihe
		
		for (int i = 2 * rowSize; i < 3 * rowSize ; i++) {
			fieldArray[i] = new Field(fieldNameArray[i], (i - 2*rowSize) * shortSideField + longSideField, 0, shortSideField, longSideField, 0);
		}
		
		
		//rechte Spalte
		
		for (int i = 3 * rowSize; i < rowSize * 4 ; i++) {
			fieldArray[i] = new Field(fieldNameArray[i], shortSideField * rowSize + longSideField, (i - 3 * rowSize) * shortSideField + longSideField, longSideField, shortSideField, 3);
		}
		
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	
		for(int i = 0; i < rowSize *4; i++) {
			
			
			
			//farbige Blöcke und Name der Felder
			switch(fieldArray[i].orientation) {
			case 0:			//rechts -> links oben
				g.setColor(Color.red);
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition + fieldArray[i].height - heightColorRectangle, fieldArray[i].width, heightColorRectangle);
				g.setColor(Color.BLACK);
				//g.drawString(fieldArray[i].fieldName, fieldArray[i].xPosition, fieldArray[i].yPosition + fieldArray[i].height);
				break;
			case 1:		//rechts -> links unten
				g.setColor(Color.GREEN);
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition, fieldArray[i].width, heightColorRectangle);
				g.setColor(Color.BLACK);
				//g.drawString(fieldArray[i].fieldName, fieldArray[i].xPosition, fieldArray[i].yPosition);
				break;
			case 2:		//oben -> unten links
				g.setColor(Color.YELLOW);
				g.fillRect(fieldArray[i].xPosition + fieldArray[i].width - heightColorRectangle, fieldArray[i].yPosition, heightColorRectangle, fieldArray[i].height);
				g.setColor(Color.BLACK);
				//g.drawString(fieldArray[i].fieldName, fieldArray[i].xPosition + fieldArray[i].width, fieldArray[i].yPosition);
				break;
			case 3:		//oben -> unten rechts
				g.setColor(Color.BLUE);
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition, heightColorRectangle, fieldArray[i].height);
				g.setColor(Color.BLACK);
				//g.drawString(fieldArray[i].fieldName, fieldArray[i].xPosition, fieldArray[i].yPosition);
				break;
				
			
			}
			//draw the tiles --- zeichne die Felder(Kästchen)
			g.setColor(Color.BLACK);
			g.drawRect(fieldArray[i].xPosition, fieldArray[i].yPosition, fieldArray[i].width, fieldArray[i].height);
		}
		//draw images ---- zeichne die Bilder der jeweiligen Symbole auf dem Feld
		/*try {
			g.drawImage(ImageIO.read(new URL("https://i1.wp.com/www.mallorca-services.es/wp-content/uploads/FreiParken.jpg")), fieldArray[0].xPosition-125, fieldArray[0].yPosition, 125, 125, null);
			g.drawImage(ImageIO.read(new URL("http://www.rhein-zeitung.de/cms_media/module_img/1044/522467_1_popup_522467_1_org_knast.jpg")), fieldArray[9].xPosition, fieldArray[8].yPosition, 125, 125, null);
			g.drawImage(ImageIO.read(new URL("https://www.brettspiele-report.de/images/monopoly/monopoly_eckfelder_go_los.jpg")), fieldArray[17].xPosition, fieldArray[18].yPosition, 125, 125, null);
			g.drawImage(ImageIO.read(new URL("https://www.brettspiele-report.de/images/monopoly_trauminsel/monopoly_trauminsel_eckfelder_gefaengnis.jpg")), fieldArray[27].xPosition, fieldArray[26].yPosition, 125, 125, null);

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//g.fillRect(fieldArray[0].xPosition-125, fieldArray[0].yPosition, 125, 125);
	}
}
