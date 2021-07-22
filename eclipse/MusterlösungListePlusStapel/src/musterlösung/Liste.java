package musterlösung;


/**
 * Beschreibung der Klasse Liste.
 * <p>
 * Rekursive Datenstruktur unter Verwendung 
 * des Entwurfsmusters Kompositum
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Liste
{
   Listenelement anfang;

   /**
     * Konstruktor für Objekte der Klasse Liste
     */
    public Liste()
    {
        anfang = new Abschluss();
    }

 
    /**
     * Fügt einen Knoten mit dem Datenelement dNeu vor dem Knoten mit dem Datenelement dVor in der Liste ein
     *
     * @param Datenelement dNeu
     * @param Datenelement dVor
     * */

    public void einfuegenVor(Datenelement dNeu, Datenelement dVor)
    {
        anfang = anfang.einfuegenVor(dNeu, dVor);
    }
    


    /**
     * Fügt einen Knoten alphabetisch sortiert in der Liste ein
     *
     * @param Datenelement dNeu
     */

    public void sortiertEinfuegen(Datenelement dNeu)
    {
        anfang = anfang.sortiertEinfuegen(dNeu);
    }

    /**
     * Fügt einen Knoten am Ende der Liste ein
     *
     * @param Datenelement dNeu
     */

    public void hintenEinfuegen(Datenelement dNeu)
    {
        anfang = anfang.hintenEinfuegen(dNeu);
    }
    
    
    
    /**
     * Fügt einen Knoten am Anfang der Liste ein
     *
     * @param Datenelement dNeu
     */

    public void vorneEinfuegen(Datenelement dNeu)
    {
        Knoten k = new Knoten(anfang, dNeu);
        anfang = k;
    }


    
    /**
     * Gibt die Länge der Liste zurück.
     * 
     * @return int
     */
    public int laengeGeben()
    {
        return anfang.restlaengeGeben();
    }
    
    /**
     * Sucht den Knoten mit dem Datenelement d
     * 
     * @param Datenelement d
     * @return boulean
     */

    public boolean suchen(Datenelement d)
    {
        boolean erfolgreich = anfang.suchen(d);
        System.out.println("Suche nach " + d.informationAusgeben() + " erfolgreich: " + erfolgreich);
        return erfolgreich;
    }
    
    /**
     * Entfernt den Knoten mit dem Datenelement d
     * 
     * @param Datenelement d
     */

    public void knotenEntfernen(Datenelement d)
    {
        anfang = anfang.knotenEntfernen(d);
        informationAusgeben();
    }
    
    /**
     * Entfernt den Anfang der Liste.
     * 
     * @return Datenelement
     */

    public Datenelement anfangEntfernen()
    {
        Datenelement daten = anfang.datenelementGeben();
        anfang = anfang.nachfolgerGeben();
        informationAusgeben();
        return daten;
    }
  
    /**
     * Entfernt den letzten Knoten der Liste.
     * 
     * @return Listenelement
     */

    public Listenelement endeEntfernen()
    {
        Datenelement d = endeGeben();
        Listenelement l = anfang.endeEntfernen(d);
        return l;
    }

    /**
     * Gibt das Datenelement am Ende der Liste.
     * 
     * @return Datenelement
     */

    public Datenelement endeGeben()
    {
        Datenelement d = anfang.endeGeben(null);
        System.out.println("Ende = " + d.informationAusgeben());
        return d;
    }

    /**
     * Gibt die Datenelemente der Liste am Bildschirm aus
     * @return 
     */

    public String informationAusgeben()
    {
        String anzeige = "Liste: ";
        anzeige = anzeige + anfang.informationAusgeben();
        return anzeige;
    }
   
    
    /**
     * Gibt die Länge der Liste am Bildschirm aus
     */

    public void laengeAusgeben()
    {
        System.out.println("Länge = " + laengeGeben());
    }

}
