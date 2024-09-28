package loadingtextfileprj;

//  Duncan Walker

public class LoadingTextFilePrj 
{

    
  public static void main(String[] args) 
   {
     LoadArray  lar = new LoadArray();  
     String[] animals = lar.getData("Animals.txt");
    
     for (int k =0; k< animals.length; k++)
      {
          System.out.println(animals[k]);  
      }
   } 
    
}
