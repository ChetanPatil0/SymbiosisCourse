//Default and parameterized constructor
//import java.util.Scanner;
class Student{
         String Name;
         int RollNo;
         int Year;
         String Div; 
         Student()
         {
             System.out.println("\nDefault Execute");    
         }
        Student(String N,int Rn,String D)
        {
         System.out.println("\nParametrized Constructor Called");  
           Name = N;
           RollNo = Rn;
           Div =D;
        }

        Student(Student S1)
        {
            System.out.println("\nCopy Constructor Called");  
            Name = S1.Name;
            RollNo= S1.RollNo;
            Div=S1.Div;
        }

        public void Display()
        {
            System.out.println("NAME : "+ Name);
            System.out.println("ROLLNO : "+ RollNo);
            System.out.println("DIVISION : "+ Div);
        }
    }
class Program22{
    public static void main(String args[])
    {
        // Scanner Sc = new Scanner(System.in);
     
        Student s1 =new Student();

        Student S2 = new Student("Chetan",42,"A");
        S2.Display();

        Student S3 =new Student(S2);
        S3.Display();
    }
}