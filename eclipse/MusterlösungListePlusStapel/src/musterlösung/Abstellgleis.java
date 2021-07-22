package musterlösung;

public class Abstellgleis {
Stapel stapel;
int gleisNr;
public Abstellgleis() {
	stapel=new Stapel();
	
}
public void WaggonEinfügen(Waggon waggon) {
	stapel.push(waggon);
}
public Waggon waggonEntfernen() {
	return (Waggon)stapel.pop();
}
public Datenelement revealTop() {
	return stapel.peek();
}
public String informationAsugeben() {
	return stapel.informationAusgeben();
}
}
