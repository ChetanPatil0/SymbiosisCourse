//Print the table 2 To 10 
class Program11{
    public static void main(String args[])
    {
        for(int i =1; i<=10 ;i++)
        { 
            for(int j =1; j<=10 ;j++)
            {
                System.out.print("\t");
                System.out.print( i * j );
            }
           System.out.println("");
        }
    }
}