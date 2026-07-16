import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the no:");
        int fact=1,a=obj.nextInt();
        for(int i=1;i<=a;i++){
            fact *=i;
        }
        System.out.println("Factorial No:"+fact);
        obj.close();
    }
    
}
