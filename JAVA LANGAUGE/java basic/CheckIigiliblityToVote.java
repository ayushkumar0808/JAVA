import java.util.Scanner;

public class CheckIigiliblityToVote {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = obj.nextInt();
        System.out.print("Are you Indian(True or False):");
        boolean isIndian = obj.nextBoolean();
        if (age >= 18 && isIndian) {
            System.err.println("Eligible To vote");
        } else {
           System.out.println("Not Eligible To vote"); 

        }
    }
    obj.close();

}