package musterl�sung;


public class Liste
{
    private Knoten anfang;
   
    
    Liste()
    {
        anfang = null;        
    }
    
    public void einf�genVorne(Datenelement d)
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
    
    public void einf�genHinten(Datenelement d)
    {
        Knoten k = new Knoten(d);
        if (anfang == null)
        {
            anfang = k;
        }
        else
        {
            anfang.einf�genHinten(k);            
        }
    }
    
    public void einf�genVor(Datenelement dNeu, Datenelement dVor)
    {
        if(anfang == null)
        {
            einf�genVorne(dNeu);       
        }
        else if(anfang.getDatenelement() == dVor)
        {
            einf�genVorne(dNeu);
        }else 
        {
            anfang.einf�genVor(dNeu, dVor);
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
    
    
    public int getL�nge()
    {
        if(anfang == null)
        {
            return 0;
        }
        else
        { 
            return anfang.getRestl�nge();
        }
    }
    
    public void sortiertEinf�gen(Datenelement dNeu)
    {
        if(anfang == null)
        {
            einf�genVorne(dNeu);
        }else if(anfang.getDatenelement().istKleinerAls(dNeu))
        {
            anfang.sortiertEinf�gen(dNeu);
        }
        else
        {
            einf�genVorne(dNeu);
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
            
            for(int i = 0; i < anfang.getRestl�nge(); i++ )
            {
                Datenelement d = anfang.getDatenelement();
                anfangEntfernen();
                sortiertEinf�gen(d); 
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
