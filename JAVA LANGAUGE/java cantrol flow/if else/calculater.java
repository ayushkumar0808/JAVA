import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner obj= new Scanner (System.in);
        int a,b,ch;
        System.err.println("Enter the a and b value:");
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Enter your choice 1 for adition any for Subtraction");
        ch=obj.nextInt();
        if(ch==1)
         System.out.println("Addition="+(a+b));
        else
         System.out.println("Subtraction="+(a-b));

        obj.close();

    }
    
}
