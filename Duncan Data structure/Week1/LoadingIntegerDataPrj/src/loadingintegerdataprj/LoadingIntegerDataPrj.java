
package loadingintegerdataprj;

// duncanwalker 
public class LoadingIntegerDataPrj 
{
 
  public static void main(String[] args) 
   {
     ECFile  lar = new ECFile();  
     Integer[] number = lar.getData("numbers.txt");
    
     
     int total=0;
     
     for (int k =0; k< number.length; k++)
      {
          System.out.println(number[k]);  
          total = total + number[k]; 
      }
       
       System.out.println("Total is "+total);  
       
        
   }
    
}
