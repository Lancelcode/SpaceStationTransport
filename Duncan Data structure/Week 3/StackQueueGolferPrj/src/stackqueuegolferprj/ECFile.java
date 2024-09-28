package stackqueuegolferprj;

// Duncan Walker  
// 10th Sept 24


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.text.NumberFormat;
import java.text.DecimalFormat;


public class ECFile 

{

  public ECFile() 
   {
        
    
   }
     
    
   public Golfer[] getArray(String filename)
    {
      File myFile = new File(filename) ; 
      NumberFormat nf = new DecimalFormat("#0.00");
      ArrayList<Golfer> arrList = new ArrayList<>();
     
      
      try 
       {
         FileReader fr = new FileReader(myFile);  
         BufferedReader br = new BufferedReader(fr);
         
         String data="";
         int number;
         
         while((data = br.readLine())!= null)
          {
            StringTokenizer  st = new  StringTokenizer(data,",");
            Golfer golfer = new Golfer();
            while(st.hasMoreTokens())
             {
               golfer.setGName(st.nextToken().trim());
               golfer.setEvents(Integer.parseInt(st.nextToken().trim()));
               golfer.setTotalPts(Double.parseDouble(st.nextToken().trim()));  
               golfer.setCountry(st.nextToken().trim());
           
               arrList.add(golfer);
             }
          }
         br.close();
         
         
       } 
      catch (IOException e) 
       {
         System.out.println("Error loading file"); 
       }
    
      System.out.println("number on file is "+arrList.size());
      Golfer myArray[] = new Golfer[arrList.size()];
      myArray = arrList.toArray(myArray);
      
      Golfer[] result = new Golfer[myArray.length];
      for (int k = 0; k < myArray.length; k++) 
       {
	 result[k] = myArray[k];
       }

      return result;

    }

}
