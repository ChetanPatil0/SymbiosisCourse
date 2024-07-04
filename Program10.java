//print the pattern
// *
// * *
// * * *
// * * * *
// * * * * *

import java.util.*;
class Program10{
    public static void main(String args[])
    {
          Scanner Sc = new Scanner(System.in);

        System.out.println("Enter The Row: " );
        int Row = Sc.nextInt();

        for(int i =1 ;i<=Row; i++)
        {
            for(int j=1; j<=i ; j++)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        
    }
}