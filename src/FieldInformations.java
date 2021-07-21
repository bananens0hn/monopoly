import java.awt.Color;

public enum FieldInformations {
	
	//				price|rent|name|buyable|owner
	//untere spalte
	LOS				(-1, 0, null, false, -1, 0),
	BRAUN_1			(60, 2, Color.darkGray, true, -1, 1),
	GEMEINSCHAFT_1	(-1, 0, Board.none1, false, -1, 1),
	BRAUN_2			(60, 4, Color.darkGray, true, -1, 1),
	STEUER_1		(-1, 0, Board.none1, false, -1, 1),
	BAHNHOF_1		(200, 25, Board.none1, true, -1, 1),
	HELLBLAU_1		(100, 6, Color.CYAN, true, -1, 1),
	EREIGNIS_1		(-1, 0, Board.none1, false, -1, 1),
	HELLBLAU_2		(100, 6, Color.CYAN, true, -1, 1),
	HELLBLAU_3		(120, 8, Color.CYAN, true, -1, 1),
	//linke spalte
	GEFÄNGNIS		(-1, 0, null, false, -1, 0),
	LILA_1			(140, 10, Color.MAGENTA, true, -1, 2),
	WERK_1			(150, 0, Board.none2, true, -1, 2),
	LILA_2			(140, 10, Color.MAGENTA, true, -1, 2),
	LILA_3			(160, 12, Color.MAGENTA, true, -1, 2),
	BAHNHOF_2		(200, 25, Board.none2, true, -1 , 2),
	ORANGE_1		(180, 14, Color.ORANGE, true, -1, 2),
	GEMEINSCHAFT_2	(-1, 0, Board.none2, false, -1,2),
	ORANGE_2		(180, 14, Color.ORANGE, true, -1, 2),
	ORANGE_3		(200, 16, Color.ORANGE, true, -1,2 ),
	//obere spalte
	FREI_PARKEN		(-1, 0, null, false, -1, 0),
	ROT_1			(220, 18, Color.red, true, -1, 3),
	EREIGNIS_2		(-1, 0, Board.none3, false, -1, 3),
	ROT_2			(220, 18, Color.red, true, -1,3 ),
	ROT_3			(240, 20, Color.red, true, -1, 3),
	BAHNHOF_3		(200, 25, Board.none3, true, -1, 3),
	GELB_1			(260, 22,  Color.yellow, true, -1, 3),
	GELB_2			(260, 22, Color.yellow, true, -1, 3),
	WERK_2			(150, 0, Board.none3, true, -1, 3),
	GELB_3			(280, 24, Color.yellow, true, -1, 3),
	//rechte spalte
	GEHE_GEFÄNGNIS	(-1, 0, null, false, -1, 0),
	GRÜN_1			(300, 26, Color.green, true, -1, 4),
	GRÜN_2			(300, 26, Color.green, true, -1, 4),
	GEMEINSCHAFT_3	(-1, 0, Board.none4, false, -1, 4),
	GRÜN_3			(320, 28, Color.green, true, -1, 4),
	BAHNHOF_4		(200, 25, Board.none4, true, -1,4 ),
	EREIGNIS_3		(-1, 0, Board.none4, false, -1 ,4),
	DUNKELBLAU_1	(350, 35, Color.blue, true,-1 ,4),
	STEUER_2		(-1, 0, Board.none4, false, -1, 4),
	DUNKELBLAU_2	(400, 50, Color.blue, true, -1, 4);
	
	public final int price;
	public final int rent;
	public final Color color;
	public final boolean isBuyable;
	public int owner;
	public int orientation;

	
	private FieldInformations(int price, int rent, Color color, boolean isBuyable, int owner, int orientation) {
		this.price = price;
		this.rent = rent;
		this.color = color;
		this.isBuyable = isBuyable;
		this.owner = owner;
		this.orientation = orientation;
		
	}

	public boolean getIsBuyable() {
		return isBuyable;
	}
	
	public int getPrice() {
		return price;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	public int getOwner() {
		return owner;
	}
	
	public int getRent() {
		return rent;
	}
}
