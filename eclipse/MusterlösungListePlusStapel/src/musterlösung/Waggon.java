package musterlösung;

public class Waggon implements Datenelement{
String zielbahnhof;
int gleisNr;
public Waggon(String ziel, int gleisNr) {
	zielbahnhof=ziel;
	this.gleisNr=gleisNr;
}
	@Override
	public String informationAusgeben() {
		return zielbahnhof+gleisNr;
	}

	@Override
	public boolean istKleinerAls(Datenelement d) {
		return false;
	}
	public boolean istZielortGleich(String ort) {
		return zielbahnhof==ort;
	}

}
