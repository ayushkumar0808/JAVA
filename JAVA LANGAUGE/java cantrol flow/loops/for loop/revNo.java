import java.util.Scanner;

public class revNo {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int rev=0;
        System.out.print("Enter the NO:");
        int a=obj.nextInt();
        for(int i=a;i>0;i/=10){
            rev= rev*10+i%10;
        }
        System.out.println("Revers NO:"+rev);
        if(rev==a){
            System.out.println("its a palindrome no!!");
        }
        else{
            System.out.println("NOt palindrome !!");
        }
        obj.close();
    }
    
}
