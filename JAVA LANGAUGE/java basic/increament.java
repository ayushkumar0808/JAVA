import java.util.Scanner;

public class increament {

    public static void main(String[] args) {
        // int a=10,b=20;
        // int res=a+b-b++ + ++a - a++ * ++b;
        //  System.out.print(str1==str2);


        // int a=10;
        // int b=a++;// b=a, a=a+1
        // int c= ++a;// a=a+1,c=a
        // System.out.println(b+" "+c);
        // System.out.println(res);
        //  String str1="ayush", str2="ayush";
       

        float r;
        double area,circum;
        final double pi=3.14;
        Scanner cd=new Scanner(System.in);
        System.out.print("enter the val:");
        r=cd.nextFloat();
        area=pi*r*r;
        circum=2*pi*r;
        System.out.println("Area="+area+"\ncircum="+circum);

        
    }
    
}