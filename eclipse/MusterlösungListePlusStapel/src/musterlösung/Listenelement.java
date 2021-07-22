package musterlösung;


/**
 * Abstract class Listenelement - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Listenelement
{
    public abstract int restlaengeGeben();
    public abstract void nachfolgerSetzen(Listenelement knotenNeu);
    public abstract Listenelement hintenEinfuegen(Datenelement dNeu);
    public abstract Listenelement einfuegenVor(Datenelement dNeu, Datenelement dVor);
    public abstract Listenelement sortiertEinfuegen(Datenelement dNeu);
    public abstract Listenelement nachfolgerGeben();
    public abstract String informationAusgeben();
    public abstract Datenelement datenelementGeben();
    public abstract Listenelement endeEntfernen(Datenelement d);
    public abstract Datenelement endeGeben(Datenelement d);
    public abstract boolean suchen(Datenelement dSuche);
    public abstract Listenelement knotenEntfernen(Datenelement d);

}
