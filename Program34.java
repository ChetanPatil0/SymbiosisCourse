//
import java.util.*;
class Program34{
    public static void main(String args[])
    {
            Scanner Sc = new Scanner(System.in);

              HashSet<String> set =new HashSet<String>();
              int N=5;
              String Ele;
              while(N != 0)
              {
                System.out.print("ENTER THE ELEMENT : ");
                Ele = Sc.nextLine();
                set.add(Ele);
                N--;
              }
              System.out.println(set);
              N=5;
              ArrayList<String> Array =new ArrayList<String>();
              while(N != 0)
              {
                System.out.print("ENTER THE ELEMENT : ");
                Ele = Sc.nextLine();
                Array.add(Ele);
                N--;
              }
              System.out.println(Array);
            
            Array.addAll(set);
              
              System.out.println(Array);
    }
}