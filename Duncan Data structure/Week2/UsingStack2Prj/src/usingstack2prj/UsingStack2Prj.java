package usingstack2prj;


import java.util.Stack;
public class UsingStack2Prj 
{

   
  public static void main(String[] args) 
    {
      Stack<Integer> number = new Stack<>();
      number.push(4);
      number.push(2);
      number.push(7);
      number.push(5);
      number.push(8);
     
      System.out.println("adding "+number.add(6));
      
      System.out.println(number);
      
    }
    
}
