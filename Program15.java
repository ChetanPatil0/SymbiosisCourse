//Calculate Occurance of element form array
import java.util.Scanner;
class Program15{
    public static void main(String args[])
    {
       Scanner Sc = new Scanner(System.in);
       int [] array = new int[]{10,20,2,10,4,8,50,12,3,10,2};
       int Occurance =0;

       System.out.print("ENTER SEARCH ELEMENT : ");
       int Target = Sc.nextInt();
     
    for(int i =0;i<array.length;i++)
    {
        if(Target == array[i])
        {
            Occurance++;
        }
    }
    System.out.print("ELEMENT FOUND "+ Occurance + " NUMBER OF TIMES");

    }
}