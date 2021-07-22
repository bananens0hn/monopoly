package musterlösung;


/**
 * Write a description of class Abschluss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Abschluss extends Listenelement
{
    
    /**
     * Constructor for objects of class Abschluss
     */
    public Abschluss()
    {
    }

    public Datenelement datenelementGeben()
    {
        return null;
    }
    
    
    public int restlaengeGeben()
    {
        return 0;
    }

    public Listenelement hintenEinfuegen(Datenelement dNeu)
    {
       return new Knoten(this, dNeu);
    }
   
     public Listenelement einfuegenVor(Datenelement dNeu, Datenelement dVor)
    {
        return new Knoten(this, dNeu);
    }
    
    public Listenelement sortiertEinfuegen(Datenelement dNeu)
    {
        return new Knoten(this, dNeu);
    }
    
    public boolean suchen(Datenelement dSuche)
    {
        return false;
    }
    
    public Listenelement endeEntfernen(Datenelement d)
    {
        return null;
    }

    public Listenelement knotenEntfernen(Datenelement d)
    {
        return this;
    }
    
    public Datenelement endeGeben(Datenelement d)
    {
        return d;
    }
    
    public void nachfolgerSetzen(Listenelement knotenNeu)
    {
    }

    public Knoten nachfolgerGeben()
    {
        return null;
    }

    public String informationAusgeben()
    {
        return "#";
    }
    

}
