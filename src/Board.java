import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JPanel{
	Field fieldArray [];
	String fieldNameArray [];
	int rowSize = 9;
	int shortSideField;
	int longSideField;
	int heightColorRectangle = 20;
	
	public Board(JFrame frame) {
		
		//board maximized in window ----- Spielbrett im Fenster maximiert
		longSideField = Toolkit.getDefaultToolkit().getScreenSize().height/(rowSize - 2);
		shortSideField = Toolkit.getDefaultToolkit().getScreenSize().height/rowSize - longSideField*2/rowSize;
		
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		fieldArray = new Field[rowSize*4];
		fieldNameArray = new String[rowSize*4];
		
		setFieldProperties();
		setPositionofFields();
	}

	private void setFieldProperties() {
		fieldNameArray[0] = "a";
		fieldNameArray[1] = "n";
		fieldNameArray[2] = "d";
		fieldNameArray[3] = "a";
		fieldNameArray[4] = "s";
		fieldNameArray[5] = "f";
		fieldNameArray[6] = "ü";
		fieldNameArray[7] = "r";
		fieldNameArray[8] = "f";
		fieldNameArray[9] = "o";
		fieldNameArray[10] = "r";
		fieldNameArray[11] = "t";
		fieldNameArray[12] = "n";
		fieldNameArray[13] = "i";
		fieldNameArray[14] = "t";
		fieldNameArray[15] = "e";
		fieldNameArray[16] = "a";
		fieldNameArray[17] = "a";
		fieldNameArray[18] = "a";
		fieldNameArray[19] = "a";
		fieldNameArray[20] = "a";
		fieldNameArray[21] = "a";
		fieldNameArray[22] = "a";
		fieldNameArray[23] = "a";
		fieldNameArray[24] = "a";
		fieldNameArray[25] = "a";
		fieldNameArray[26] = "a";
		fieldNameArray[27] = "a";
		fieldNameArray[28] = "a";
		fieldNameArray[29] = "a";
		fieldNameArray[30] = "a";
		fieldNameArray[31] = "a";
		fieldNameArray[32] = "a";
		fieldNameArray[33] = "a";
		fieldNameArray[34] = "a";
		fieldNameArray[35] = "a";
		}

	//position der Felder
	private void setPositionofFields() {
		//oberere Reihe
		
		for (int i = 0; i < rowSize; i++) {
			fieldArray[i] = new Field(fieldNameArray[i], i * shortSideField + longSideField, 0, shortSideField, longSideField, 0);
		}
		
		//untere Reihe
		
		for (int i = 2 * rowSize; i < 3 * rowSize ; i++) {
			fieldArray[i] = new Field(fieldNameArray[i], (3 * rowSize - i - 1) * shortSideField + longSideField , rowSize * shortSideField + longSideField, shortSideField, longSideField, 1);
		}
		
		//linke Spalte
		
		for (int i = 3 * rowSize; i < 4 * rowSize ; i++) {
			 fieldArray[i] = new Field(fieldNameArray[i], 0, (4 * rowSize - i - 1) * shortSideField + longSideField, longSideField, shortSideField, 2);
		}
		
		//rechte Spalte
		
		for (int i = rowSize; i < rowSize * 2 ; i++) {
			fieldArray[i] = new Field(fieldNameArray[i], shortSideField * rowSize + longSideField, (i - rowSize) * shortSideField + longSideField, longSideField, shortSideField, 3);
		}
		
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	
		for(int i = 0; i < rowSize *4; i++) {
			//Kästchen
			g.setColor(Color.BLACK);
			g.drawRect(fieldArray[i].xPosition, fieldArray[i].yPosition, fieldArray[i].width, fieldArray[i].height);
			
			
			//farbige Blöcke und Name der Felder
			switch(fieldArray[i].orientation) {
			case 0:
				g.setColor(Color.RED);
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition + fieldArray[i].height - heightColorRectangle, fieldArray[i].width, heightColorRectangle);
				g.setColor(Color.BLACK);
				g.drawString(fieldArray[i].fieldName, fieldArray[i].xPosition, fieldArray[i].yPosition + fieldArray[i].height);
				break;
			case 1:
				g.setColor(Color.GREEN);
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition, fieldArray[i].width, heightColorRectangle);
				g.setColor(Color.BLACK);
				g.drawString(fieldArray[i].fieldName, fieldArray[i].xPosition, fieldArray[i].yPosition);
				break;
			case 2:
				g.setColor(Color.YELLOW);
				g.fillRect(fieldArray[i].xPosition + fieldArray[i].width - heightColorRectangle, fieldArray[i].yPosition, heightColorRectangle, fieldArray[i].height);
				g.setColor(Color.BLACK);
				g.drawString(fieldArray[i].fieldName, fieldArray[i].xPosition + fieldArray[i].width, fieldArray[i].yPosition);
				break;
			case 3:
				g.setColor(Color.BLUE);
				g.fillRect(fieldArray[i].xPosition, fieldArray[i].yPosition, heightColorRectangle, fieldArray[i].height);
				g.setColor(Color.BLACK);
				g.drawString(fieldArray[i].fieldName, fieldArray[i].xPosition, fieldArray[i].yPosition);
				break;
			}
		}
	}
}
