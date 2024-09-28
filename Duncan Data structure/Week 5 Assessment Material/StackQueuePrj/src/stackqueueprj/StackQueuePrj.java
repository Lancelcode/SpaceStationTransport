package stackqueueprj;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class StackQueuePrj 
{
    public static void main(String[] args) 
    {
     ECFile ecf = new ECFile();
     String[] sd = ecf.loadData("mission1.txt");
     Stack<String> stack1 = new Stack();
     Stack<String> stack2 = new Stack();
     Queue<String> queue1 = new ArrayBlockingQueue<>(18);
     
     System.out.println("\nstack1 size : "+stack1.size());
     System.out.println("\nstack2 size : "+stack2.size());
     System.out.println("\n------------------------------\n");
     for(int k=0; k<sd.length; k++)  
      {
        System.out.print(sd[k]+" ");
        if(stack1.size()<9)  
          {
           stack1.add(sd[k]);
          }
      }
      System.out.println("\nstack1 size : "+stack1.size());
      System.out.println("\nstack2 size : "+stack2.size());
      System.out.println("\nArray size : "+sd.length+"\n\n"); 
      
      for(int k=9; k<sd.length; k++)  
       {
        System.out.print(sd[k]+" ");    
        if(stack2.size()<9)  
          {
           stack2.add(sd[k]);
          }
       }
       System.out.println("\nstack1 size : "+stack1.size());
       System.out.println("\nstack2 size : "+stack2.size());
       System.out.println("\nArray size : "+sd.length+"\n\n"); 
       System.out.println("\n==============================\n");
     
        System.out.println("\nQueue data : "+queue1);
        System.out.println("\nLoading queue ");
        while(!stack1.empty())
         {
           System.out.println("value : "+stack1.peek());  
           queue1.add(stack1.pop());
         }
        System.out.println("\nQueue data : "+queue1);
        while(!stack2.empty())
         {
           queue1.add(stack2.pop()); 
         }
        System.out.println("\nQueue data : "+queue1);
        ArrayList<String> bay1 = new ArrayList<>();
        ArrayList<String> bay2 = new ArrayList<>();
        ArrayList<String> bay3 = new ArrayList<>();
        
        while (!queue1.isEmpty())
         {
           String item;
           item=queue1.remove();
           if(item.substring(0,1).equals("P"))
            {
              bay1.add(item);
            }
           if(item.substring(0,1).equals("F"))
            {
              bay2.add(item);
            }
           if(item.substring(0,1).equals("T"))
            {
              bay3.add(item);
            }
         }
        System.out.println("\nBay 1 : "+bay1);
        System.out.println("\nBay 2 : "+bay2);
        System.out.println("\nBay 3 : "+bay3); 
    }  
}
