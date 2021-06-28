
public class Field {
	public int xPosition;
	public int yPosition;
	public int width;
	public int height;
	public String fieldName;
	public int orientation;
	
	public Field(String name, int posX, int posY, int w, int h, int o) {
		xPosition = posX;
		yPosition = posY;
		fieldName = name;
		width = w;
		height = h;
		orientation = o;
	}
}
