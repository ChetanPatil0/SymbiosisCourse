//Take Infinite Digit from user and stop program execution when input digit is negative find min and max from all input
import java.util.Scanner;
class Program8{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
          System.out.print("ENTER THE Digit  : ");
          int x = sc.nextInt();
           int min=x;
           int max=x;
         while(true)
         {

          if(x >= 0)
          {
             if(x > max)
             {
                max=x;
             }
             else if(x < min )
             {
                min=x;
             }
          }
           else{
               break;
           }
                     
          System.out.print("ENTER THE Digit  : ");
           x = sc.nextInt();
         }
         System.out.println("MIN : " + min);
         System.out.println("MAX : " + max);
    }
}