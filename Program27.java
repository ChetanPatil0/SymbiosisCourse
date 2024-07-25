//multilevel inheritance

class Circle{
    float Radius;
    void get(float R)
    {
        Radius = R;
    }
}
class Area extends Circle{
    public void AreaOfCir(){
        float Area = 3.14f * Radius * Radius;
        System.out.println("AREA OF CIRCLE IS : "+ Area);
    }
}
class Perimeter extends Area{
    public void PeriOfCir(){
        float Peri = 2 * 3.14f * Radius;
        System.out.println("PERIMETER OF CIRCLE IS : "+ Peri);
    }
}
class Program27{
    public static void main(String args[])
    {   
        Perimeter Obj2 = new Perimeter();
        Obj2.get(3.2f);
        Obj2.AreaOfCir();
        Obj2.PeriOfCir();
    }
}