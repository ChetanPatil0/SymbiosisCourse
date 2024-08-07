//
class Program41 extends Thread
  {
    public void run()
    {       setName("akshay kale");
            System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[])
    {
        Program41 Obj1=new Program41();
        Program41 Obj2=new Program41();
        Program41 Obj3=new Program41();
        Obj1.start();
        Obj2.start();
        Obj3.start();
        Obj1.setName("prashant");
        System.out.println(Thread.currentThread().getName());
    }
}