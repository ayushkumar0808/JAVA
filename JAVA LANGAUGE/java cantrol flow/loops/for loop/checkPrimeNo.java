import java.util.Scanner;

public class checkPrimeNo {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the No:");
        int n=obj.nextInt(), i;
        for( i=2;i<n;i++){
            if(n%i==0)
                break;       
        }
        if(i==n)
            System.out.println("It's prime no!!");
        else
            System.out.println("Not Prime no!!");

    obj.close();
        
    }
    
}
