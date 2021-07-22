package musterlösung;


/**
 * Beschreibung der Klasse Knoten.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knoten extends Listenelement
{
    Listenelement nachfolger;
    Datenelement daten;
    
    /**
     * Constructor for objects of class Knoten
     * 
     * @param Datenelement datenNeu
     */
    public Knoten(Datenelement datenNeu)
    {
        nachfolger = null;
        daten = datenNeu;
    }

    /**
     * Constructor for objects of class Knoten
     * 
     * @param Listenelement next
     * @param Datenelement datenNeu
     */
    public Knoten(Listenelement next, Datenelement datenNeu)
    {
        nachfolger = next;
        daten = datenNeu;
    }

    /**
     * Entfernt den letzten Knoten der Liste
     * 
     * @param Datenelement d
     * @return Listenelement
     */
    public Listenelement endeEntfernen(Datenelement d)
    {
        if (daten == d)
        {
            return nachfolger;
        }
        else
        {
            nachfolger = nachfolger.endeEntfernen(d);
            return this;
        }
    }

    /**
     * Gibt das Datenelement des letzten Knotens der Liste zurück
     * 
     * @param Datenelement d
     * @return Datenelement
     */
    public Datenelement endeGeben(Datenelement d)
    {
        return nachfolger.endeGeben(daten);
    }

    /**
     * Fügt den Knoten mit dem Datenelement dNeu vor den Knoten mit dem Datenelement dVor ein.
     * 
     * @param Datenelement dNeu
     * @param Datenelement dVor
     * @return Listenelement
     */
    public Listenelement einfuegenVor(Datenelement dNeu, Datenelement dVor)
     {
        //Knoten ist gesuchtes Datenelement
        if (datenelementGeben() == dVor)
        {
            //Datenelement vor diesem Knoten einfügen
            Knoten kNeu = new Knoten(dNeu);
            kNeu.nachfolgerSetzen(this);
            return kNeu;
        }
        //Beim Nachfolger weitersuchen
        else
        {
            nachfolger = nachfolger.einfuegenVor(dNeu, dVor);
            return this;
        }            
    }
    
    /**
     * Fügt den Knoten mit dem Datenelement dNeu alphabetisch sortiert ein.
     * 
     * @param Datenelement dNeu
     * @return Listenelement
     */
    public Listenelement sortiertEinfuegen(Datenelement dNeu)
    {
        //Nachfolger ist gesuchtes Datenelement
        if (datenelementGeben().istKleinerAls(dNeu))
        {
            //Beim Nachfolger weitersuchen
            nachfolger = nachfolger.sortiertEinfuegen(dNeu);
            return this;
        }
        else
        {
            //Datenelement vor diesem Knoten einfügen
            Knoten kNeu = new Knoten(dNeu);
            kNeu.nachfolgerSetzen(this);
            return kNeu;
        }            
    }

    /**
     * Fügt den Knoten mit dem Datenelement dNeu hinten ein.
     * 
     * @param Datenelement dNeu
     * @return Listenelement
     */
    public Listenelement hintenEinfuegen(Datenelement dNeu)
    {
        nachfolger = nachfolger.hintenEinfuegen(dNeu);
        return this;
    }
   
    /**
     * Entfernt den Knoten mit dem Datenelement d
     * 
     * @param Datenelement d
     * @return Listenelement
     */

    public Listenelement knotenEntfernen(Datenelement d)
    {
        //Knoten ist gesuchtes Datenelement
        if (datenelementGeben() == d)
        {
            return nachfolger;
        }
        //Beim Nachfolger weitersuchen
        else
        {
            nachfolger = nachfolger.knotenEntfernen(d);
            return this;
        }            
    }
    
    /**
     * Sucht den Knoten mit dem Datenelement d
     * 
     * @param Datenelement d
     * @return boulean
     */

    public boolean suchen(Datenelement dSuche)
    {
        //Knoten ist gesuchtes Datenelement
        if (datenelementGeben() == dSuche)
        {
            return true;
        }
        //Beim Nachfolger weitersuchen
        else
        {
            return nachfolger.suchen(dSuche);
        }            
    }
    
    /**
     * Gibt die Restlänge der Liste zurück.
     * 
     * @return int
     */
    public int restlaengeGeben()
    {
        return nachfolger.restlaengeGeben() + 1;
    }
    

    /**
     * Setzt den Nachfolger
     * 
     * @param Listenelement knotenNeu
     */
    public void nachfolgerSetzen(Listenelement knotenNeu)
    {
        nachfolger = knotenNeu;
    }

    /**
     * Gibt den Nachfolger zurück.
     * 
     * @return Listenelement
     */
    public Listenelement nachfolgerGeben()
    {
        return nachfolger;
    }
    
    /**
     * Gibt das Datenelement zurück.
     * 
     * @return Datenelement
     */
    public Datenelement datenelementGeben()
    {
        return daten;
    }
    
    /**
     * Gibt den Wert des Datenelements am Bildschirm aus.
     */
    public String informationAusgeben()
    {
        return  daten.informationAusgeben() + "; " + nachfolger.informationAusgeben();
    }
   
}
