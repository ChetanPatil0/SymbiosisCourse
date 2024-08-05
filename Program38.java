//functional interface

interface Interface1{
    public void add(int a,int b);
}

  class Program38   {
         public static void main(String args[])
         {
            Interface1 Int = (int a , int b) -> System.out.println("ADDITION : "+  (a + b));
            Int.add(10,20);

         }
 }