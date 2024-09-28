package loadingintegerdataprj;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ECFile 
 {

    public ECFile() {}
    
   public Integer[]  getData(String filename)
   {
     File myFile = new File(filename);
     
     ArrayList<Integer> arrList = new ArrayList<>();
       
     try
     {
       FileReader fr = new FileReader(myFile);  
       BufferedReader br = new BufferedReader(fr);
        
       String data="";
       int number =0;
       while ((data = br.readLine()) != null)
       {
         number = Integer.parseInt(data);
         arrList.add(number);
       }
       br.close();
     }
     
     catch (IOException e)
     {
      System.out.println("Error with file");
     }
     
     
      System.out.println("Number on file is "+arrList.size());
      Integer myArray[] = new Integer[arrList.size()];
      myArray = arrList.toArray(myArray);
   
     return myArray ;
     
   } 
    
 }
