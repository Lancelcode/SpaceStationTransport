
package testingupdatedmawarray;


public class Employee 
{
  private String name;
  private int idNumber;
  private String department;  
  private String position;

  public Employee(String name, int idNumber, 
                  String department, String position) 
   {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public Employee() 
    {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    public String getName() 
    {return name;}

    public void setName(String name) 
    {this.name = name;}

    public int getIdNumber() 
    {return idNumber;}

    public void setIdNumber(int idNumber) 
    {this.idNumber = idNumber;}

    public String getDepartment()
    {return department;}

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() 
    {return position;}

    public void setPosition(String position)
    { this.position = position;}

    @Override
    public int hashCode() 
    {
        int hash = this.idNumber;
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
      if (obj instanceof Employee)
      {
         // Get a Employee reference to obj.
          
         Employee tempEmployee = (Employee) obj;
         
         
         if (this.idNumber== tempEmployee.idNumber)
            return true;
         else
            return false;
       }
      else
         return false;
    }

    @Override
    public String toString() 
    {
      String Str1  = String.format("%-8s",name);
      String Str2  = String.format("%-10s",department);
     return  Str1 + " "+idNumber + "\t   "+Str2 + "\t"+position; 
    }
    
    
    
    

}