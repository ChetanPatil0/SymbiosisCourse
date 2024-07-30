//
import java.util.*;

class Program32{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
         int N=5;
         int Number;
        ArrayList<Integer> Array =new ArrayList<Integer>(N);
       
        for(int i=0; i<N;i++)
        {
            System.out.print("ENTER THE ELEMENT :");
            Number= Sc.nextInt();
            if(!Array.contains(Number))
            {
                Array.add(Number);
            }
            
        }
        System.out.println("Original Array : ");
        System.out.println(Array);
        System.out.println("Sorted Array : ");
        Collections.sort(Array);
        System.out.println(Array);



        
    }
}