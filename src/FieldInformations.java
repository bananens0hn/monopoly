
public enum FieldInformations {
	//				price|rent|name|buyable|owner
	//untere spalte
	LOS				(-1, 0, "", false, -1),
	BRAUN_1			(60, 2, "brown", true, -1),
	GEMEINSCHAFT_1	(-1, 0, "none1", false, -1),
	BRAUN_2			(60, 4, "brown", true, -1),
	STEUER_1		(-1, 0, "none1", false, -1),
	BAHNHOF_1		(200, 25, "none1", true, -1),
	HELLBLAU_1		(100, 6, "lightblue", true, -1),
	EREIGNIS_1		(-1, 0, "none1", false, -1),
	HELLBLAU_2		(100, 6, "lightblue", true, -1),
	HELLBLAU_3		(120, 8, "lightblue", true, -1),
	//linke spalte
	GEFÄNGNIS		(-1, 0, "", false, -1),
	LILA_1			(140, 10, "purple", true, -1),
	WERK_1			(150, 0, "none2", true, -1),
	LILA_2			(140, 10, "purple", true, -1),
	LILA_3			(160, 12, "purple", true, -1),
	BAHNHOF_2		(200, 25, "none2", true, -1),
	ORANGE_1		(180, 14, "orange", true, -1),
	GEMEINSCHAFT_2	(-1, 0, "none2", false, -1),
	ORANGE_2		(180, 14, "orange", true, -1),
	ORANGE_3		(200, 16, "orange", true, -1),
	//obere spalte
	FREI_PARKEN		(-1, 0, "", false, -1),
	ROT_1			(220, 18, "red", true, -1),
	EREIGNIS_2		(-1, 0, "none3", false, -1),
	ROT_2			(220, 18, "red", true, -1),
	ROT_3			(240, 20, "red", true, -1),
	BAHNHOF_3		(200, 25, "none3", true, -1),
	GELB_1			(260, 22,  "yellow", true, -1),
	GELB_2			(260, 22, "yellow", true, -1),
	WERK_2			(150, 0, "none3", true, -1),
	GELB_3			(280, 24, "yellow", true, -1),
	//rechte spalte
	GEHE_GEFÄNGNIS	(-1, 0, "", false, -1),
	GRÜN_1			(300, 26, "green", true, -1),
	GRÜN_2			(300, 26, "green", true, -1),
	GEMEINSCHAFT_3	(-1, 0, "none4", false, -1),
	GRÜN_3			(320, 28, "green", true, -1),
	BAHNHOF_4		(200, 25, "none4", true, -1),
	EREIGNIS_3		(-1, 0, "none4", false, -1),
	DUNKELBLAU_1	(350, 35, "blue", true,-1),
	STEUER_2		(-1, 0, "none4", false, -1),
	DUNKELBLAU_2	(400, 50, "blue", true, -1);
	
	public final int price;
	public final int rent;
	public final String color;
	public final boolean isBuyable;
	public int owner;

	
	private FieldInformations(int price, int rent, String color, boolean isBuyable, int owner) {
		this.price = price;
		this.rent = rent;
		this.color = color;
		this.isBuyable = isBuyable;
		this.owner = owner;
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
