//find min and max from array

class Program16{
    public static void main(String args[])
    {
       int [] array = new int[]{10,20,2,10,4,8,50,12,3,10,2};
       int Min=array[0];
       int Max=array[0];
        
      for(int i=0;i<array.length;i++)
      {
       int Maximum = array[i] > Max ? Max =array[i] : Max;
       int Minimum = array[i] < Min ? Min =array[i] : Min;

      }
      System.out.println("MAX : " + Max);
      System.out.println("Min : " + Min);

    }
}