
public class Field {
	public int xPosition;
	public int yPosition;
	public int width;
	public int height;
	public String fieldIdentifier;
	public int orientation;
	
	public Field(String name, int posX, int posY, int w, int h, int o) {
		xPosition = posX;
		yPosition = posY;
		fieldIdentifier = name;
		width = w;
		height = h;
		orientation = o;
	}
}
