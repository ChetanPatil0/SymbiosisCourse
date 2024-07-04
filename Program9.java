//Find the factor of number and calculate sum of factor
import java.util.*;
class Program9{
    public static void main(String args[])
    {
          Scanner Sc = new Scanner(System.in);

        System.out.println("Enter The Number : " );
        int Number = Sc.nextInt();
        int Sum=0;
        for(int i=1;i<=Number;i++)
        {
            if(Number % i == 0)
            {
                Sum = Sum + i;
                System.out.println("Factor is : " + i);
            }
        }
        System.out.println("Sum of  factor is : " + Sum);
    }
}