//Thread Priority
class Run extends  Thread{
    
}
class natural extends Run{
    public void run()
   {
    for(int i=0; i<10;i++)
    {
            System.out.println("Natural : "+i);
    }
   }
}
class even extends Run{
   public void run()
   {
    for(int i=0; i<20;i++)
    {
        if(i%2 == 0)
        {
            System.out.println("Even : "+i);
        }
    }
   }
}
class odd extends Run{
    public void run()
   {
    for(int i=0; i<50;i++)
    {
        if(i%2 != 0)
        {
            System.out.println("Odd : "+i);
        }
    }
   }
}

class Program42{
    public static void main(String[]args)
    {
        natural Obj1 = new natural();
        even Obj2 = new even();  
        odd Obj3 = new odd();

        Obj1.setPriority(5);
        Obj1.start();
        
        Obj2.setPriority(1);
        Obj2.start();

        Obj3.setPriority(10);
        Obj3.start();
        
    }
}