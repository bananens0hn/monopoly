package musterlösung;


public class Liste
{
    private Knoten anfang;
   
    
    Liste()
    {
        anfang = null;        
    }
    
    public void einfügenVorne(Datenelement d)
    {
        Knoten k = new Knoten(d);
        
        if(anfang == null)
        {
            anfang = k;
        }
        else
        {
            k.nachfolgerSetzen(anfang);
            anfang = k;
        }
    }
    
    public Datenelement getEnde()
    {
        if(anfang != null)
        {
           if(anfang.getNachfolger() == null)
           {
               return anfang.getDatenelement();
           }
           else
           {
               return anfang.getEnde();
           }
        }
        
        return null;
    }
    
    public Knoten getVorletzter()
    {
        if(anfang != null && anfang.getNachfolger() != null)
        {
            return anfang.getVorletzter();
        }else
        {
            return null;
        }
    }
    
    public void einfügenHinten(Datenelement d)
    {
        Knoten k = new Knoten(d);
        if (anfang == null)
        {
            anfang = k;
        }
        else
        {
            anfang.einfügenHinten(k);            
        }
    }
    
    public void einfügenVor(Datenelement dNeu, Datenelement dVor)
    {
        if(anfang == null)
        {
            einfügenVorne(dNeu);       
        }
        else if(anfang.getDatenelement() == dVor)
        {
            einfügenVorne(dNeu);
        }else 
        {
            anfang.einfügenVor(dNeu, dVor);
        }
    }
    
    
    public void infoAusgeben()
    {
        String anzeige = " ";
        if (anfang != null)
        {
            anzeige = anzeige + anfang.infoAusgeben();
        }
        System.out.println(anzeige);
    }
    
    
    public int getLänge()
    {
        if(anfang == null)
        {
            return 0;
        }
        else
        { 
            return anfang.getRestlänge();
        }
    }
    
    public void sortiertEinfügen(Datenelement dNeu)
    {
        if(anfang == null)
        {
            einfügenVorne(dNeu);
        }else if(anfang.getDatenelement().istKleinerAls(dNeu))
        {
            anfang.sortiertEinfügen(dNeu);
        }
        else
        {
            einfügenVorne(dNeu);
        }
        
    }
    
    public void anfangEntfernen()
    {
        if(anfang != null)
        {
            anfang = anfang.getNachfolger();
        }
    }
    
    public Datenelement endeEntfernen()
    {
        if(anfang != null)
        {
            Datenelement d = anfang.getEnde();
            
            getVorletzter().nachfolgerSetzen(null);
            
            return d;
        }
        
        return null;
    }
    
    public void sortieren()
    {
        if(anfang != null)
        {
            
            for(int i = 0; i < anfang.getRestlänge(); i++ )
            {
                Datenelement d = anfang.getDatenelement();
                anfangEntfernen();
                sortiertEinfügen(d); 
            }
        }
  
    }
    
    public Datenelement knotenEntfernen(Datenelement d)
    {
        if(anfang != null)
        {
            if(anfang.getDatenelement() == d)
            {
                anfangEntfernen();                
            }
            else
            {
                anfang.knotenEntfernen(d);    
            }            
            return d;
        }
        
        return null;
    }
    
    public Datenelement suchen(String n)
    {
        if(anfang != null)
        {
            if(anfang.getDatenelement().getName() == n)
            {
                return anfang.getDatenelement();
            }
            else
            {
                return anfang.suchen(n);
            }
        }
        
        return null;
    }
}
