package stackqueuegolferprj;

// Duncan 

import java.util.Objects;


public class Golfer 
 {
   private String GName;
   private int    events;
   private double totalPts;
   private String country;

   public Golfer() {}

    public Golfer(String GName,    int events, 
                  double totalPts, String country) 
    {
        this.GName = GName;
        this.events = events;
        this.totalPts = totalPts;
        this.country = country;
    }

    public String getGName() {return GName;}

    public void setGName(String GName) {this.GName = GName;}

    public int getEvents() {return events;}

    public void setEvents(int events) {this.events = events;}

    public double getTotalPts() {return totalPts;}

    public void setTotalPts(double totalPts) {this.totalPts = totalPts;}

    public String getCountry() {return country;}

    public void setCountry(String country) {this.country = country;}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.GName);
        hash = 43 * hash + this.events;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.totalPts) ^ (Double.doubleToLongBits(this.totalPts) >>> 32));
        hash = 43 * hash + Objects.hashCode(this.country);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
     {
       if(obj instanceof Golfer)
        {
         Golfer tempGolfer = (Golfer)obj;  
         
         if(this.getGName().equals(tempGolfer.getGName()))
          {
           return true;  
          }
         else
          {
           return false;  
          }
       }

      return false;
     }

  
   @Override
    public String toString() 
    {
        return  GName + " " + events + " " +
                totalPts +" " +  country;
    }
   
 
 }
