import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the no:");
        int sum=0;
        for( int a=obj.nextInt();a>0; a/=10){
            sum += a%10;
        }
        System.out.println("Sum is:"+sum);
        obj.close();
    }
    
}
