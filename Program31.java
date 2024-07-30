class Sub{
    public int Sub(int a,int b)  // class 1
    {
        return a - b;
    }
}
class Add extends Sub{
    public int Sum(int a,int b)  //class 2 extends class 1
    {
        return a + b;
    }
}

interface Val{  
    int a=10;               //interface 1
    int b=20;
    void Display(); 
}

class Result extends Add implements Val{   //class 3 extends class & implement interface 1
 public void Display(){
    System.out.println("SUB IS : "+ Sub(a,b));
    System.out.println("SUM IS : "+ Sum(a,b));    
  }
}
class Program31{
    public static void main(String args[])
    {

        Result obj1 = new Result();
        obj1.Display();
    }
}