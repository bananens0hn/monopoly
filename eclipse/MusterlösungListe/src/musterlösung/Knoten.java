package musterl�sung;


public class Knoten
{
  private Knoten nachfolger;
  private Datenelement daten;
  
  Knoten(Datenelement d)
  {
      daten = d;
  }
  
  public void nachfolgerSetzen(Knoten k)
  {
      nachfolger = k;
  }
  
  public Knoten getNachfolger()
  {
      return nachfolger;
  }
  
  public Datenelement getDatenelement()
  {
      return daten;
  }
  
  public Datenelement getEnde()
  {
      if(nachfolger == null)
      {
          return this.getDatenelement();
      }else
      {
          return nachfolger.getEnde();
      }
  }
  
  public Knoten getVorletzter()
  {
      if(nachfolger.getDatenelement() == getEnde())
      {
          return this;
      }else
      {
          return nachfolger.getVorletzter();
      }
  }
  
  public String infoAusgeben()
  {
      String anzeige = daten.getName() + "\n ";
      
      if(nachfolger == null)
      {
          return anzeige;
      }
      else
      {
          anzeige = anzeige + nachfolger.infoAusgeben(); 
          return anzeige;
      }
  }
  
  public void einf�genHinten(Knoten k)
  {
     if(nachfolger == null)
     {
         nachfolger = k;
     } 
     else
     {
         nachfolger.einf�genHinten(k);
     }
  }
  
  public void einf�genVor(Datenelement dNeu, Datenelement dVor)
  {
      if(nachfolger == null)
      {
         nachfolger = new Knoten(dNeu);   
      }
      else if(nachfolger.getDatenelement() == dVor)
      {
          Knoten kNeu = new Knoten(dNeu);
          kNeu.nachfolgerSetzen(nachfolger);
          nachfolger = kNeu;
      }else
      {
          nachfolger.einf�genVor(dNeu, dVor);
      }   
  }
 
  public void sortiertEinf�gen(Datenelement dNeu)
  {
      if (nachfolger ==  null)
      {
          nachfolger = new Knoten(dNeu);
      }else if(nachfolger.getDatenelement().istKleinerAls(dNeu))
      {
          nachfolger.sortiertEinf�gen(dNeu);
      }else 
      {
          Knoten kNeu = new Knoten(dNeu);
          kNeu.nachfolgerSetzen(nachfolger);
          nachfolger = kNeu;
      }
      
  }

  public int getRestl�nge()
  {
      if (nachfolger == null)
      {
          return 1; 
        }
        else
        return nachfolger.getRestl�nge()+1;
  }
  
  public void knotenEntfernen(Datenelement d)
  {
      if(this.getNachfolger().getDatenelement() == d)
      {
           this.nachfolgerSetzen(this.getNachfolger().getNachfolger());               
      }
      else
      {
          nachfolger.knotenEntfernen(d);
      }
  }
  
  public Datenelement suchen(String n)
  {
      if(this.getDatenelement().getName() == n)
        {
            return this.getDatenelement();
        }
        else
        {
            return nachfolger.suchen(n);
        }
  }

}
