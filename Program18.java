import java.util.*;
class Program18{
    public static void main(String args[])
    {
        Scanner Sc =new Scanner(System.in);

        System.out.print("ENTER THE FIRST STRING : ");
        String Str1=Sc.nextLine();
        
        System.out.print("ENTER THE SECOND STRING : ");
        String Str2=Sc.nextLine();


       if(Str1.length() > Str2.length())
       {
         System.out.println("STRING 1 GREATER THAN STRING 2");
       }
       else if(Str2.length() > Str1.length())
       {
        System.out.println("STRING 2 GREATER THAN STRING 1
        ");
       }
       else{
        System.out.println("BOTH ARE EQUAL LENGTH");
       }

    
    }
}