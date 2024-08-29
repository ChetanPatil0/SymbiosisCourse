//Thread sleep and join
class Even extends Thread{
    public void run()
    {
    for(int i=2;i<10;i+=2)
    {
        System.out.println("Even : "+i);
    }
    }
}
class Odd extends Thread{
public void run()
    {
    for(int i=1;i<=10;i+=2)
    {
        System.out.println("Odd : "+i);
    }
    }
}
class Natural extends Thread{
   public void run()
    {
    for(int i=0;i<=10;i++)
    {
        System.out.println("Natural : "+i);
    }
    }
}
class Program45{
    public static void main(String args[])
    {
        Even t1 =new Even();
        Odd t2 =new Odd();
        Natural t3 =new Natural();
         
        try{
            t1.start();
            t1.join();
            t1.sleep(1000);

            t2.start();
            t2.join();
            t2.sleep(2000);

            t3.start();
            t3.join();
            t3.sleep(3000);
        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
}