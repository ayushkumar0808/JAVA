import java.util.Scanner;

public class SumOfnNaturalNo {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the NO:");
        int n= obj.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println("sum is:"+sum);
        obj.close();
    }
}