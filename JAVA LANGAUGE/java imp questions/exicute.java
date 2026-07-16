import java.util.Scanner;

public class exicute {
    public static void main(String[] args) {
        Scanner boj=new Scanner(System.in);
        System.out.print("Enter no:");
        int n =boj.nextInt();
        int i=1000;
         while(i>0)
         {
            int temp=n;
            temp=temp/i;
            System.out.println(temp);
            n=n%i;
            i /= 10;
         }


    }
    
}
