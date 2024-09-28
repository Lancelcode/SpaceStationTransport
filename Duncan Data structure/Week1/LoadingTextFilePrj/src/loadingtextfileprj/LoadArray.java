package loadingtextfileprj;

// Duncan

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class LoadArray 
 {

  public LoadArray() {}
   
  public String[]  getData(String filename)
   {
     File myFile = new File(filename);
     
     ArrayList<String> arrList = new ArrayList<>();
       
     try
     {
       FileReader fr = new FileReader(myFile);  
       BufferedReader br = new BufferedReader(fr);
        
       String data="";
       
       while ((data = br.readLine()) != null)
       {
         arrList.add(data);
       }
       br.close();
     }
     
     catch (IOException e)
     {
      System.out.println("Error with file");
     }
     
     
      System.out.println("Number on file is "+arrList.size());
      String myArray[] = new String[arrList.size()];
      myArray = arrList.toArray(myArray);
   
     return myArray ;
     
   }
 }
