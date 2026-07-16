import java.util.Scanner;

public class SimpleCal {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a, b, ch;
        do {
            System.out.println("\nMenu\n1.Addition\n2.Divison\n3.Substraction\n4.Multiplication\n5.Exit");
            System.out.print("Enter Your Choice:");
            ch = obj.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the value of a and b:");
                    a = obj.nextInt();
                    b = obj.nextInt();
                    System.out.println("Addition=" + (a + b));
                    break;
                case 2:
                    System.out.println("Enter the value of a and b:");
                    a = obj.nextInt();
                    b = obj.nextInt();
                    System.out.println("Dev=" + (a / b));
                    break;
                case 3:
                    System.out.println("Enter the value of a and b:");
                    a = obj.nextInt();
                    b = obj.nextInt();
                    System.out.println("Sub=" + (a - b));
                    break;
                case 4:
                    System.out.println("Enter the value of a and b:");
                    a = obj.nextInt();
                    b = obj.nextInt();
                    System.out.println("Mul=" + (a * b));
                    break;
                case 5:
                    System.out.println("Exiting..");
                    return;
                default:
                    System.out.println("Wrong Choice..Choose agin!");
            }


        } while (true);
   
      
    }
    
}
