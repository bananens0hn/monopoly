package musterlösung;


public class Patient implements Datenelement
{
  private String name;
  
  Patient(String n)
  {
      name = n;
  }
  
  public String getName()
  {
      return name;
  }
  
  public void infoAusgeben()
  {
      System.out.println(name);
  }
  
  public boolean istKleinerAls(Datenelement dNeu)
  {
      if (name.compareTo(dNeu.getName()) <=0)
      {
          return true;
      }     
      return false;
  }
  
  
  
  
}
