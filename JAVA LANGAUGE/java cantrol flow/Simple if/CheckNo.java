import java.util.Scanner;

public class CheckNo {
    public static void main(String[] args) {
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the No:");
        a = obj.nextInt();
        if (a > 0)
            System.out.println("NO is +ve");
    }
}
