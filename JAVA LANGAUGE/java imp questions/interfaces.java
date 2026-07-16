public class interfaces {
    public static void main(String[] args) {
        System.out.println("\nMath Interface");
        demo a=new demo();
        System.out.println("Squre="+a.sq(4));
        System.err.println("Cube="+a.cube(6));


        System.out.println("\nArithimatic Interface");
        demo2 a1=new demo2();
        System.out.println("Add="+a1.add(6,3));
        System.out.println("Sub="+a1.sub(6,3));
        System.out.println("Mul="+a1.mul(6,3));
        System.out.println("Dev="+a1.dev(6,3));
        System.out.println("Modulo="+a1.modulo(6,3));

        System.out.println("\nMultilevel Interface");
        circle c=new circle();
        c.area();
        rectangle r=new rectangle();
        r.area();


        System.out.println("\nMultiple Interface");
        Area ar= new Area();
        System.out.println( "Arera of Circle:"+ar.area(5));
        System.out.println("Area of rectangle:"+ar.area(4,8));
        System.out.println(ar.isMarried());

    }  
}



interface MathCal
{
    int sq(int a);
    int cube(int a);
}

class demo implements MathCal
{
   public int sq(int a)
    {
        return a*a;
    }
    public int cube(int a)
    {
        return a*a*a;
    }

}





interface  Arithimatic {
    int add(int a,int b);
    int sub(int a,int b);
    int mul(int a,int b);
    int dev(int a,int b);
    int modulo(int a,int b);
}

class demo2 implements Arithimatic
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int mul(int a,int b)
    {
        return a*b;
    }
    public int dev(int a,int b)
    {
        return a/b;
    }
    public int modulo(int a,int b)
    {
        return a%b;
    }
}





interface Shape
{
    void area();
}

class  circle implements Shape {
    public void area()
    {
        int a=5;
        System.out.println("Area of circle="+a*a);
    }
}
class rectangle implements Shape{
    public void area()
    {
        int a=6,b=7;
        System.out.println("area of rectangle="+(a+b));
    }
}





interface Circle1{
    int area(int a);
}

interface Rectangle1 {
    int area(int a, int b);
}

class Area implements Circle1,Rectangle1{
    public int area(int a)
    {
        return a*a;
    }
    public int area(int a, int b){
        return a+b;
    }
    boolean isMarried()
    {
        return true;
    }
}
