//Enum example]


 class Program23{
    public enum Week{
    SUN(1),MON(2),TUE(3),WED(4),THU(5),FRI(6),SAT(7);

    int value;
    Week(int val)
    {
        value=val;
    }
    }
    public static void main(String args[])
    {
          for(Week w :Week.values())
          {
            System.out.println(w +"\t"+ w.value);
          }
    }
 }