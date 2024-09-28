package stackqueuegolferprj;

// Duncan

public class StackQueueGolferPrj 
{ 
  public static void main(String[] args) 
   {
      ECFile ecf = new ECFile();
      Golfer[] golfer = ecf.getArray("Top 20 golfers.txt");
   
      System.out.println("\n---------------------------");
      for( int k=0; k<golfer.length; k++)
      {
          System.out.println(golfer[k]);  
      }
      System.out.println("===========================\n");
    
   }
    
}
