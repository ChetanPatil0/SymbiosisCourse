//
import java.util.*;

class Program33{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
         int N=5;
         int Number;
         String Input;
        ArrayList<Integer> Array =new ArrayList<Integer>(N);
       
        for(int i=0; i<N;i++)
        {
            System.out.print("ENTER THE ELEMENT :");
            Number= Sc.nextInt(); 
                Array.add(Number);
            
        }
        System.out.println("Original Array : ");
        System.out.println(Array);
        int index;
        int count=0;
        
        System.out.println("ENTER WHICH DUPLICATE YOU WANT TO DELETE");
        int Duplicate= Sc.nextInt();
        for(int i=0; i<N;i++)
        {
            if(Array.contains(Duplicate))
            {
                
                    index = Array.indexOf(Duplicate);
                    Array.remove(index);
              
                    
             }
             
        }
        
        System.out.println("Modifed Array : "+ Array);

    }
}