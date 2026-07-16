import java.util.Scanner;

public class CheckEquality {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a,b;
        System.out.print("enter the valuer of a and b:");
        a=obj.nextInt();
        b=obj.nextInt(); 
        if((a^b)==0)
            System.out.println("Same");
        else
            System.out.println("Not same");

            
    }
    
}

