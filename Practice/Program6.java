//Reverse Number
import java.util.Scanner;
class Program6{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
         System.out.print("ENTER THE NO  : ");
         int  x = sc.nextInt();
         int rem;
         int rev=0;
         while(x>0)
         {
             rem= x % 10;
              rev = rem + (rev * 10 );
              x=x/10;
         }
         System.out.println("Reverse NO : "+ rev);
    }
}