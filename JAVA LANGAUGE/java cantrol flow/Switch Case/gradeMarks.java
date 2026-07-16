import java.util.Scanner;

public class gradeMarks {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the Marks:");
        int marks=obj.nextInt();
        if(marks<0||marks>100)
        {
            System.out.println("invailid Marks");
            return;
        }
        switch(marks/10)
        {
            case 9,10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default :
                System.out.println("Fail");
                                
        }   
    }
}
