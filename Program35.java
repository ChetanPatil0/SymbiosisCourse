//
import java.util.*;
class Program35{
    public static void main(String args[])
    {
        ArrayList<Integer> ArrayList = new ArrayList<Integer>();
        ArrayList.add(1);
        ArrayList.add(2);
        ArrayList.add(3);
        ArrayList.add(4);
        System.out.println(ArrayList);

        ListIterator<Integer> itr = ArrayList.listIterator();
        int count=1;
         while(itr.hasNext())
        {
            System.out.print(" " + itr.next());
            if(count == 2)
            {
                break;
            }
            count++;
         }
        System.out.println("\nReverse Iterator : ");
        while(itr.hasPrevious())
        {

            System.out.print(" " + itr.previous());
        }
    }
}