//multi thread
class thread extends Thread{
public void run()
    {
        System.out.println("THREAD IS RUN ");
    }
}

class even extends Thread{
    public void run()
    {
      System.out.println("EVEN NUMBER");
        for(int i=1;i<=10;i++)
        {
            if(i % 2 == 0)
            {
               System.out.println(i);
            }
        }
    }

}

class odd extends Thread{
    public void run()
    {
        System.out.println("ODD NUMBER");
        for(int i=1;i<=10;i++)
        {
            if(i % 2 != 0)
            {
               System.out.println(i);
            }
        }
    }
}
class natural extends Thread{
        public void run()
        {
            System.out.println("NATURAL NUMBER");
             for(int i=1;i<=10;i++)
             {
                 System.out.print(" " + i);
             }
        }
}
class Program40{
    
    public static void main(String args[])
    {
         even Obj1 = new even();
         odd Obj2 = new odd();
         natural Obj3 = new natural();
         Obj1.start();
         Obj2.start();
         Obj3.start();
    }
}