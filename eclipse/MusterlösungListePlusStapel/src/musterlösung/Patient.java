package musterlösung;

import java.lang.*;

/**
 * Write a description of class Patient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Patient implements Datenelement
{
    private String name;

    /**
     * Constructor for objects of class Patient
     */
    public Patient(String patientName)
    {
        name = patientName;
    }

    public String informationAusgeben()
    {
        return name;
    }
    
    public boolean istKleinerAls(Datenelement d)
    {
        if (name.compareTo(d.informationAusgeben()) <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
