import java.util.Scanner;

class Program5{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
         System.out.print("ENTER THE NO DOZEN PURCHASE : ");
        float  X = sc.nextInt();
    
        System.out.print("ENTER THE COST PER DOZENS : ");
        float y= sc.nextInt();

        System.out.print("ENTER THE SELLING PRICE FOR PER TOY : ");
        float z =sc.nextInt();

        float costpertoy = y/12;
        System.out.println(costpertoy);
        float profit = z-costpertoy;
        System.out.println(profit);
        float profitper = profit / costpertoy  * 100;

        System.out.println(" PROFIT PERCENTAGE IS "+ String.format("%.2f", profitper));
    }
}