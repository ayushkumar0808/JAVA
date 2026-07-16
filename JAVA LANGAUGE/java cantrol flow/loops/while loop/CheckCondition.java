import java.util.Scanner;

public class CheckCondition {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the no 1 to 50:");
        int n=obj.nextInt();
        while(n<1 || n>50)
        {
            System.out.println("Enter a vaild no!!");
            System.err.print("Choose again:");
            n=obj.nextInt();
        }
        System.out.println("thanks!!");
        obj.close();

    }
    
}
