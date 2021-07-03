

public enum FieldInformations {
	//untere spalte
	LOS				(-1, ""),
	BRAUN_1			(60, "brown"),
	GEMEINSCHAFT_1	(-1, "none1"),
	BRAUN_2			(60, "brown"),
	STEUER_1		(-1, "none1"),
	BAHNHOF_1		(200, "none1"),
	HELLBLAU_1		(100, "lightblue"),
	EREIGNIS_1		(-1, "none1"),
	HELLBLAU_2		(100, "lightblue"),
	HELLBLAU_3		(120, "lightblue"),
	//linke spalte
	GEFÄNGNIS		(-1, ""),
	LILA_1			(140, "purple"),
	WERK_1			(150, "none2"),
	LILA_2			(140, "purple"),
	LILA_3			(160, "purple"),
	BAHNHOF_2		(200, "none2"),
	ORANGE_1		(180, "orange"),
	GEMEINSCHAFT_2	(-1, "none2"),
	ORANGE_2		(180, "orange"),
	ORANGE_3		(200, "orange"),
	//obere spalte
	FREI_PARKEN		(-1, ""),
	ROT_1			(220, "red"),
	EREIGNIS_2		(-1, "none3"),
	ROT_2			(220, "red"),
	ROT_3			(240, "red"),
	BAHNHOF_3		(200, "none3"),
	GELB_1			(260, "yellow"),
	GELB_2			(260, "yellow"),
	WERK_2			(150, "none3"),
	GELB_3			(280, "yellow"),
	//rechte spalte
	GEHE_GEFÄNGNIS	(-1, ""),
	GRÜN_1			(300, "green"),
	GRÜN_2			(300, "green"),
	GEMEINSCHAFT_3	(-1, "none4"),
	GRÜN_3			(320, "green"),
	BAHNHOF_4		(200, "none4"),
	EREIGNIS_3		(-1, "none4"),
	DUNKELBLAU_1	(350, "blue"),
	STEUER_2		(-1, "none4"),
	DUNKELBLAU_2	(400, "blue");
	
	public final int price;
	public final String color;
	
	private FieldInformations(int price, String color) {
		this.price = price;
		this.color = color;
	}
}
