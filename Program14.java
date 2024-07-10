//Search element from array using linear search
import java.util.*;
class Program14{
    public static void main(String args[])
    {
          Scanner Sc = new Scanner(System.in);
          int [] array = new int[]{10,20,2,5,4,8,50,12,3};
          int Count = 0;
          int Position = 0;
           System.out.print("ENTER THE SEARCH ELEMENT : ");
           int Target = Sc.nextInt();

           
           for(int i = 0; i<array.length; i++)
           {
            if(array[i] == Target)
            {
                Count = 1;
                Position = i;
                break;
            }
           }
           if(Count == 1)
            {
                System.out.print("NUMER IS FOUND AT POSITION : " + Position);
            }
            else{
                System.out.print("NUMER IS NOT FOUND !");
            }

        

    }
} 