import java.util.Scanner;

public class claculater {
     public static void main(String[] args) {
        Scanner obj= new Scanner (System.in);
        int a,b,ch;
        System.err.println("Enter the a and b value:");
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Enter your choice:\n1 for adition\n2 for Subtraction\n3 for multiplication \n4 for divioson\n5 for modulo");
        ch=obj.nextInt();
        if(ch<=0|| ch>5){
            System.out.println("invilide choice");
            return;
        }
        if(ch==1)
         System.out.println("Addition="+(a+b));
        else if(ch==2)
         System.out.println("Subtraction="+(a-b));
        else if(ch==3)
         System.out.println("multipliction="+(a*b));
        else if(ch==4)
         System.out.println("divon="+(a/b));
        else
         System.out.println("modulo="+(a%b));

        obj.close();

    }
    
}
