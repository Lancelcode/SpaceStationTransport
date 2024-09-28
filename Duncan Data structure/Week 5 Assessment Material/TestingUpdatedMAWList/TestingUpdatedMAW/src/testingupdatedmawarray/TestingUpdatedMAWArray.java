package testingupdatedmawarray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author duncanwalker
 */
public class TestingUpdatedMAWArray 
{

 public static void main(String[] args) 
  {
    System.out.println("\nStarting .........\n");
        Employee[] emp = new Employee[15];
      
      for(int k=0; k<emp.length; k++)
       {
         emp[k]= new Employee(); 
       }
        
      File myFile = new File("EmployeeData.txt");  
      
        try 
         {
           FileReader fr = new FileReader(myFile);  
           BufferedReader br = new BufferedReader(fr); 
           
           String data ="";
           int index = 0;
           
           while( (data = br.readLine()) != null )
            {
             //test data   
             System.out.println("this is data from the file  : "+data);
             StringTokenizer st = new StringTokenizer(data,",");
       
             while(st.hasMoreTokens())
              {
                emp[index].setName(st.nextToken());
                emp[index].setIdNumber(Integer.parseInt(st.nextToken()));
                emp[index].setDepartment(st.nextToken());
                emp[index].setPosition(st.nextToken());
                index++;
              } //end while tokens
                
            } // end while data
           
           br.close();
         }         
        catch (IOException e) 
         {
           System.out.println("An IO has occurred"); 
         }
      
      System.out.println("\n\n A List of Employees downloaded from file\n"); 
      
      for(int k =0; k<emp.length; k++)
       {
         System.out.println(k+" # "+emp[k]); 
       }
              
      ListStack<Employee> empStack = new  ListStack<>();
      ListStack<Employee> empStackBackup = new  ListStack<>();
      ListQueue<Employee> empQueue = new ListQueue<>();
      ListQueue<Employee> empQueueBackup = new ListQueue<>();
      ArrayList<Employee> empArr = new ArrayList<>();
      
      int qSize = 0;
      int sSize = 0;
      
      for(int m =0; m<emp.length; m++)
      {  
       if(emp[m].getDepartment().equals("Computing")) 
        {
          empStack.push(emp[m]);
          empStackBackup.push(emp[m]);
          sSize++;
        }  
        else
         if(emp[m].getDepartment().equals("Web Design")) 
         {
            empQueue.add(emp[m]);
            empQueueBackup.add(emp[m]);
            qSize++;
         }
           else
         {
          empArr.add(emp[m]);
         }
      }
        System.out.println("\n======= Stack  ========\n");
        System.out.println("Stack  size = "+sSize +"\n");
        
        for(int k=0; k<sSize; k++)
         {
           if(!empStack.empty()) 
           {
             System.out.println(empStack.pop()); 
           }  
         }
      
        System.out.println("\nStack  size = "+empStack.size() +"\n");
        System.out.println("\n======= Stack  ========\n");
//        
//        System.out.println("\n======= Queue  ========\n");
//        System.out.println("Queue size = "+qSize+"\n");
//               
//        for(int k=0; k<qSize; k++)
//         {
//           if(!empQueue.empty()) 
//           {
//             System.out.println(empQueue.remove()); 
//           }  
//         }
//        
//        System.out.println("\n======= ArrayList  ========\n");
//      
//        System.out.println("Array size = "+empArr.size()+"\n");
//        
//        for(int k=0; k<empArr.size(); k++)
//         {
//          if(!empArr.isEmpty()) 
//           {
//               System.out.println(empArr.get(k));
//           }  
//         }
//        System.out.println("\n=====================\n\n");
    } 
      
           
  }
