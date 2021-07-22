package musterl�sung;



public class Test
{
    
    public void f�llen(Liste l)
    {
        Patient p1 = new Patient("a1");
        Patient p2 = new Patient("b2");
        Patient p3 = new Patient("d3");
        Patient p4 = new Patient("e4");
        
        l.einf�genHinten(p1);
        l.einf�genHinten(p2);
        l.einf�genHinten(p3);
        l.einf�genHinten(p4);
        
    }
    
   
    public void testInfoAusgeben()
    {
        Liste liste = new Liste();
        f�llen(liste);
        
        liste.infoAusgeben();
    }
    
    public void testSortiertEinf�gen()
    {
        Liste liste = new Liste();
        f�llen(liste);
        
        liste.infoAusgeben();
        
        Patient p5 = new Patient("c5");
        
        liste.sortiertEinf�gen(p5);
        
        liste.infoAusgeben();
    }
    
    public void testEntfernenAnfang()
    {
        Liste liste = new Liste();
        
        f�llen(liste);
        
        liste.infoAusgeben();
        
        liste.anfangEntfernen();
        
        liste.infoAusgeben();
        
        liste.anfangEntfernen();
        
        liste.infoAusgeben();
    }
    
    public void testEntfernenEnde()
    {
        Liste liste = new Liste();
        
        f�llen(liste);
        
        liste.infoAusgeben();
        
        liste.endeEntfernen();
        
        liste.infoAusgeben();
        
        liste.endeEntfernen();
        
        liste.infoAusgeben();
    }
    
    public void getEnde()
    {
        Liste liste = new Liste();
        
        f�llen(liste);
        
        liste.infoAusgeben();
        
        System.out.println(liste.getEnde().getName());
    }
    
    public void getVorletzter()
    {
        Liste liste = new Liste();
        
        f�llen(liste);
        
        liste.infoAusgeben();
        
        System.out.println(liste.getVorletzter().getDatenelement().getName());
    }
    
    public void sortieren()
    {   
        Liste l = new Liste();
        
        Patient p1 = new Patient("d1");
        Patient p2 = new Patient("a2");
        Patient p3 = new Patient("b3");
        Patient p4 = new Patient("c4");
        
        l.einf�genHinten(p1);
        l.einf�genHinten(p2);
        l.einf�genHinten(p3);
        l.einf�genHinten(p4);
        
        l.infoAusgeben();
        
        l.sortieren();
        
        l.infoAusgeben();
    }
    
    public void knotenEntfernen()
    {
       Liste l = new Liste();
        
        Patient p1 = new Patient("1");
        Patient p2 = new Patient("2");
        Patient p3 = new Patient("3");
        Patient p4 = new Patient("4");
        
        l.einf�genHinten(p1);
        l.einf�genHinten(p2);
        l.einf�genHinten(p3);
        l.einf�genHinten(p4);
        
        l.infoAusgeben();
        
        l.knotenEntfernen(p3);
        
        l.infoAusgeben();
        
        l.knotenEntfernen(p1);
        
        l.infoAusgeben();
        
        l.knotenEntfernen(p2);
        
        l.infoAusgeben();
        
    } 
    
    public Datenelement suchen()
    {
       Liste l = new Liste();
        
        Patient p1 = new Patient("1");
        Patient p2 = new Patient("2");
        Patient p3 = new Patient("3");
        Patient p4 = new Patient("4");
        
        l.einf�genHinten(p1);
        l.einf�genHinten(p2);
        l.einf�genHinten(p3);
        l.einf�genHinten(p4);

        return l.suchen("2");   
    } 
    
}
