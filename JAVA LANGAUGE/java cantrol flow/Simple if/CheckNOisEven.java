import java.util.Scanner;

public class CheckNOisEven {
    public static void main(String[] args) {
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the No:");
        a = obj.nextInt();
        if (a % 2 == 0)
            System.out.println("no is even");
        if (a == 0)
            System.out.println("no is zero");
        if (a > 0)
            System.out.println("no is +ve");
    }
}
