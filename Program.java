import java.util.Scanner;
class Program {
    public static void main(String args[])
    {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUM1 : ");
        int num1 = sc.nextInt();

         System.out.print("ENTER THE NUM2 : ");
        int num2 = sc.nextInt();
        sc.nextLine();

        System.out.print("ENTER THE OPRATOR(+,-,*,/) : ");
        char input = sc.next().charAt(0);

        if(input == '+')
        {
            System.out.print("Result : ");
            System.out.print(num1 + num2);
        }
       else if(input == '-')
        {
            System.out.print("Result : ");
            System.out.print(num1 - num2);
        }
       else if(input == '*')
        {
            System.out.print("Result : ");
            System.out.print(num1 * num2);
        }
        else if(input == '/')
        {
            System.out.print("Result : ");
            System.out.print(num1 / num2);
        }
        else{
        System.out.print("WRONG INPUT");
        }
    }
}