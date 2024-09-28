package usingqueueprj;

// Duncan

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class UsingQueuePrj 
{

    
    public static void main(String[] args) 
    {
       Queue<Integer> q1 = new ArrayBlockingQueue<>(4); 
       
       if(q1.isEmpty())
       {
         System.out.println("No items in queue");
       }
       
       
       
       q1.add(7);
       q1.add(5);
       q1.add(9);
       q1.add(3);
       
       
       System.out.println(q1);
       System.out.println(q1.peek());
      try 
       {
        q1.add(2);
       }
      catch (IllegalStateException e)
      {
        System.out.println("Queue is full");      
      }
       
    }
    
}
