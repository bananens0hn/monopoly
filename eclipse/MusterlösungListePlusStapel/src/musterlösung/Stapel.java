package musterlösung;

public class Stapel extends Liste{
public Stapel() {
	super();
}
public void push(Datenelement dNeu) {
	vorneEinfuegen(dNeu);
}
public Datenelement pop() {
	return anfangEntfernen();
}
public Datenelement peek() {
	return anfang.datenelementGeben();
}
@Override
public void hintenEinfuegen(Datenelement dNeu) {
	
}
@Override
public void einfuegenVor(Datenelement dNeu, Datenelement d_vergleich) {
	
}
@Override
public void sortiertEinfuegen(Datenelement dNeu) {
	
}
public void knotenEntfernen(Datenelement dVergleich) {
	
}
public Listenelement endeEntfernen() {
	return null;
}
@Override
public boolean suchen(Datenelement dSuchen) {
	return false;
}
}