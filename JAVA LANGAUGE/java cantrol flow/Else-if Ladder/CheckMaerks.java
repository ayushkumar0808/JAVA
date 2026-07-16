import java.util.Scanner;

public class CheckMaerks {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int marks;
        System.out.println("Enter the Marks");
        marks=obj.nextInt();
        if(marks>90)
            System.out.println("grade A");
        else if(marks>80)
            System.out.println("grade B");
        else if(marks>70)
            System.out.println("grade C");
        else if(marks>60)
            System.out.println(" grade D");
        else
            System.out.println(" Fail");

    }
}