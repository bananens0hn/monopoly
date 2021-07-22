package musterlösung;

public class Rangierbahnhof {
	Abstellgleis[]gleise;
public Rangierbahnhof(int gleisAnzahl) {
	gleise=new Abstellgleis[gleisAnzahl];
for (int i = 0; i < gleisAnzahl; i++) {
	
	gleise[i]=new Abstellgleis();
	
}
}
public void WaggonEinfuegen(Waggon wNeu, int i) {
	gleise[i].WaggonEinfügen(wNeu);
}
public Waggon WaggonEntfernen(int i) {
	
	return gleise[i].waggonEntfernen();
}
public void WaggonVerschieben(int vomGleis, int nachGleis) {
Waggon waggon= WaggonEntfernen(vomGleis);
WaggonEinfuegen(waggon, nachGleis);
}
public void informationenDrucken() {
	for (int i = 0; i < gleise.length; i++) {
		System.out.println(gleise[i].informationAsugeben());
	}
}
}
