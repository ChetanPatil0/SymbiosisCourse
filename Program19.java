//checck string as vowel or consonent
import java.util.*;
class Program19{
    public static void main(String args[])
    {
         Scanner Sc =new Scanner(System.in);

        System.out.print("ENTER THE  STRING : ");
        String Str=Sc.nextLine();
        String SmallStr=Str.toLowerCase();
        int Vowel =0;
        int Consonent =0;
        for(int i=0; i<Str.length(); i++){
              if(SmallStr.charAt(i)=='a' || SmallStr.charAt(i)=='e' || SmallStr.charAt(i)=='i' || SmallStr.charAt(i)=='o' || SmallStr.charAt(i) == 'u')
              {
                Vowel++;
              }
              else{
                Consonent++;
              }
        }

        System.out.println("TOTAL VOWELS : "+Vowel);
        System.out.println("TOTAL CONSONENT : "+Consonent);
         
    }
}