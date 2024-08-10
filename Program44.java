//thread join
class thread1 extends Thread{
    public  void run()
    {
        for(char i='a';i<'e';i++)
        {
            System.out.println(i);
        }
            System.out.println(Thread.currentThread().getName());
    }
}

class Program44{
    public static void main(String args[])
    {
         thread1 t1 = new thread1();
         t1.start();

        System.out.println(Thread.currentThread().getName());
         try{
            t1.join();
            for(int i=0; i<5; i++)
            {
                System.out.println(i);
            }

         }catch(Exception e){
            System.out.println(e);
         }
    }
}