//
class Thread1  extends Thread{
    public void run()
    {
        for(int i =0;i<5;i++)
        {
       System.out.println("Local"+ i);
        }

    }
}
class Program46{
    public static void main(String args[])
    {
      Thread1 T1 = new Thread1();

      T1.start();
      try{
        for(int i=0;i<5;i++)
        {
          System.out.println(Thread.currentThread().getName());
        }
      }catch(Exception e)
      {
        System.out.println(e);
      }
    }
}