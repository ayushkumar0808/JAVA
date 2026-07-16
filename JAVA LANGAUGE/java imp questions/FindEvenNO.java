import java.util.Scanner;

public class FindEvenNO {
    public static void main(String[] args) {
        int a;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the no:");
        a=obj.nextInt();
    
        if((a&1)==0)
            System.out.println("Even no");
        else
            System.out.println("Odd no");

    }
}
