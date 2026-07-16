import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a;
        System.out.print("enter the no:");
        a = obj.nextInt();
        if (a > 0 && (a & a - 1) == 0)
            System.out.println("It's Power of 2");
        else
            System.out.println("It's not Power of 2");

    }

}