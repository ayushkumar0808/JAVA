
public class AbstracCalss {
    public static void main(String[] args) {
        Implement m= new Implement();
        System.out.println( "Area of Circle="+m.AreaCircle(5));
        System.out.println("Area of Rectangle="+m.AreaRac(3, 7));
        
    }
}

abstract class Area
{
    abstract int AreaCircle(int a);
    int AreaRac(int a, int b)
    {
        return a+b;
    }
}

class Implement extends Area{
    int AreaCircle(int a)
    {
        return a*a;
    }
}

