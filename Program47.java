class Thread1  extends Thread{
    public void run()
    {   
        try{
        for(int i =0;i<5;i++)
        {  
            System.out.println("Local 2:"+ i);
            Thread.sleep(2000);
        }
          }catch(Exception e)
          {
            System.out.println(e);
          }
        }

    }

class Thread2  extends Thread{
    public void run()
    {
        for(int i =0;i<5;i++)
        {
       System.out.println("Local 1:"+ i);
        }
    }
}
class Program47 {
    public static void main(String args[])
    {
         Thread1 T1 = new Thread1();
          Thread2 T2 = new Thread2();
           T1.start();
           T2.start();

           T1.interrupt();
          
    }
}