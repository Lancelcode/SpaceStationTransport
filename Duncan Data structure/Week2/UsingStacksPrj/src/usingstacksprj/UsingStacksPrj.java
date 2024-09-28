package usingstacksprj;

// Duncan

import java.util.Stack;


public class UsingStacksPrj 
{

    
    
    public static void main(String[] args) 
    {
       Stack<String> animal = new Stack<>(); 
       Stack<String> animal2 = new Stack<>(); 
       
       animal.push("Dog");
       animal.push("Cat");
       animal.push("Bat");
       animal.push("Ant");
       animal.push("Fox");
       animal.push("Owl");
       animal.push("Cow");
       
       System.out.println(animal);
       
       String creature;
       
       creature = animal.pop();
      
       System.out.println(animal);
       System.out.println("You removed "+creature);
       
       creature = animal.pop();
       
       System.out.println(animal);
       System.out.println("You removed "+creature);
       
       System.out.println("Top of stack "+animal.peek());
       animal.pop();
       System.out.println("Top of stack "+animal.peek());
       animal.pop();
       System.out.println("Top of stack "+animal.peek());
       animal.pop();
       System.out.println("Top of stack "+animal.peek());
       animal.pop();
       System.out.println("Top of stack "+animal.peek());
       animal.pop();
       
       System.out.println(animal);
       
       if (animal.empty())
       {
         System.out.println("Stack is empty");
       } 
       else
        {
         System.out.println("Top of stack "+animal.peek());
         animal.pop();
        }
        System.out.println("\n====================\n");
               
        System.out.println("Reversing Data in a stack");
       
        animal.push("Dog");
        animal.push("Cat");
        animal.push("Bat");
        animal.push("Ant");
        animal.push("Fox");
        animal.push("Owl");
        animal.push("Cow");
        
         
        System.out.println(animal);
        System.out.println(animal2);
        System.out.println("");
                
        while(!animal.empty())
        {
          animal2.push(animal.pop());
        }
        System.out.println("");
        System.out.println(animal);
        System.out.println(animal2);
       
        
    }
    
}
