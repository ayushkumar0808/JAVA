interface MathCal
{
   int square(int a);
   int cube(int a);
   double power(double b, double p);
}

interface ArithCal
{
   int add(int a, int b);
   int sub(int a, int b);
   int mul(int a, int b);
   int dev(int a, int b);
}

class MyCal implements MathCal, ArithCal
{
   public int square(int a)
   {
      return a*a;
   }

   public int cube(int a)
   {
      return a*a*a;
   }

   public double power(double b,double p)
   {
      return Math.pow(b,p);
   }

   public int add(int a ,int b)
   {
      return a+b;
   }

   public int sub(int a ,int b)
   {
      return a-b;
   }

   public int mul(int a, int b)
   {
      return a*b;
   }

   public int dev(int a , int b)
   {
      return a/b;
   }

}

class MultipleInterfaceDemo
{
   public static void main(String[] args)
   {
      MyCal m=new MyCal();

      System.out.println("Square:"+m.square(4));
      System.out.println("Cube:"+m.cube(6));
      System.out.println("Power:"+m.power(4.0,2.0));
      System.out.println("Addition:"+m.add(4,6));  
      System.out.println("Subtraction:"+m.sub(8,6));
      System.out.println("Multiplication:"+m.mul(4,6));  
      System.out.println("Division:"+m.dev(12,6));
   }
}