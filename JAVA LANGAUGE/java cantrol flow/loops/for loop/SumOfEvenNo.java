import java.util.Scanner;

public class SumOfEvenNo {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the no:");
        int n=obj.nextInt(),sum=0;
        for(int i=2;i<=n;i+=2){
            sum+=i;
           // System.err.println(i);
        }
        System.out.println("sum is:"+sum);
        obj.close();
    }
    
}
