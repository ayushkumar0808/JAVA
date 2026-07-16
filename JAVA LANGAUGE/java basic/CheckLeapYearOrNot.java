import java.util.Scanner;

public class CheckLeapYearOrNot {
    public static void main(String[] args) {
        int year;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the year:");
        year=obj.nextInt();
        if(year%4==0&& year%100!=0 || year%400==0){
            System.out.println(year+" is a leap year");

        }

        else{
            System.out.println(year +" is not a leap year");
        }
    }
}
