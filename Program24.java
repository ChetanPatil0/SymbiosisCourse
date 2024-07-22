//Single inheritance
import java.util.Scanner;
class Vehicle{
      String Company;
      String Model;
      float Price;
      
    public void get(String Company,String Model,float Price){
           this.Company=Company;
           this.Model=Model;
           this.Price=Price;
      }
}
class Car extends Vehicle{
       public void Display()
       {
        System.out.println("CAR DETAILS");
        System.out.println("Company : "+Company);
        System.out.println("Model : "+Model);
        System.out.println("Price : "+Price);
       }
} 
class Program24{
    public static void main(String args[])
    {
        Vehicle V1=new Vehicle();
        Car C1=new Car();
        C1.get("Mahindra","Thar",1500000f);
        C1.Display();
    }
}