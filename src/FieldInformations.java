

public enum FieldInformations {
	LOS				(-1),
	BRAUN_1			(60),
	GEMEINSCHAFT_1	(-1),
	BRAUN_2			(60),
	STEUER_1		(-1),
	BAHNHOF_1		(200),
	HELLBLAU_1		(100),
	EREIGNIS_1		(-1),
	HELLBLAU_2		(100),
	HELLBLAU_3		(120),
	GEFÄNGNIS		(-1),
	LILA_1			(140),
	WERK_1			(150),
	LILA_2			(140),
	LILA_3			(160),
	BAHNHOF_2		(200),
	ORANGE_1		(180),
	GEMEINSCHAFT_2	(-1),
	ORANGE_2		(180),
	ORANGE_3		(200),
	FREI_PARKEN		(-1),
	ROT_1			(220),
	EREIGNIS_2		(-1),
	ROT_2			(220),
	ROT_3			(240),
	BAHNHOF_3		(200),
	GELB_1			(260),
	GELB_2			(260),
	WERK_2			(150),
	GELB_3			(280),
	GEHE_GEFÄNGNIS	(-1),
	GRÜN_1			(300),
	GRÜN_2			(300),
	GEMEINSCHAFT_3	(-1),
	GRÜN_3			(320),
	BAHNHOF_4		(200),
	EREIGNIS_3		(-1),
	DUNKELBLAU_1	(350),
	STEUER_2		(-1),
	DUNKELBLAU		(400);
	public final int price;
	
	private FieldInformations(int price) {
		this.price = price;
	}
}
