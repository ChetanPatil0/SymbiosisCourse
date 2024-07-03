//A Four digit number ABCD is called Lucky if ( A + B) = (C + D)
import java.util.Scanner;
class Program7{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
        
         System.out.print("ENTER THE NO  : ");
         int  x = sc.nextInt();

         int rem;
         int g1=0;
         int g2=0;
         int count = 1;
         while(x>0)
         {
             rem= x % 10;
             if(count <=2)
             {
                 g1 = g1 + rem;
             }
             else{
                g2 = g2 + rem;
             }
              x= x/10;
            count++;
         }
         if(g1 == g2)
         {
            System.out.print("NUMBER IS LUCKY");
         }
         else{
            System.out.print("NUMBER IS NOT LUCKY");
         }
    }
}