
package stackqueueprj;

import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

/**
 *
 * @author duncanwalker
 */

public class ECFile 
 {

  public ECFile() {}
  
  public String[] loadData(String filename)
  {
    ArrayList<String> arrList = new ArrayList<>();
    File myFile = new File(filename);    
    try
     {
       FileReader  fr = new FileReader(myFile);  
       BufferedReader br = new BufferedReader(fr);
       
       String data; // hold the information on file
       
       while(( data = br.readLine()) != null )
        {
          StringTokenizer st = new StringTokenizer(data,",");
          while(st.hasMoreTokens()) 
           { 
             arrList.add(st.nextToken().trim());
           } 
        }  // end while data
       br.close();
     
     }
    catch(IOException e)
     {
       System.out.println("Error loading File");
     }
    
    String[] result = new String[arrList.size()]; 
    result = arrList.toArray(result);
    
    return result;   
  }
    
 }
