package musterl�sung;

public class Abstellgleis {
Stapel stapel;
int gleisNr;
public Abstellgleis() {
	stapel=new Stapel();
	
}
public void WaggonEinf�gen(Waggon waggon) {
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
