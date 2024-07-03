import java.util.Scanner;
class Program2{
    
       public static void main(String args[])
       {
            int userid=123;
            String pass="123";
            Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE USER ID : ");
        int  id = sc.nextInt();

         System.out.print("ENTER THE USER PASSWORD : ");
        String upass = sc.next();
        // System.out.print(upass);
        if(userid==id )
        {
            if(pass.equals(upass))
            {
                System.out.print("LOGIN SUCCESSFULLY");
            }
            else{
                System.out.print("LOGIN Failed,Password Wrong");
            }
        }
        else{
            System.out.print("Login Failed,user Id Wrong");
        }
       }

}