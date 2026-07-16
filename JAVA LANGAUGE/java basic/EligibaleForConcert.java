import java.util.Scanner;

public class EligibaleForConcert {
    public static void main(String[] args) {
        int age;
        boolean isHallticket, isInvited;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Your Age:");
        age = obj.nextInt();
        System.out.print("Do you have hall Ticket:");
        isHallticket = obj.nextBoolean();
        System.out.print("Are u invited :");
        isInvited = obj.nextBoolean();
        if (age >= 18 && (isHallticket || isInvited)) {
            System.out.println("You can enjoy the consert");
        } else {
            System.out.println("You are not allowed");
        }
    }
}
