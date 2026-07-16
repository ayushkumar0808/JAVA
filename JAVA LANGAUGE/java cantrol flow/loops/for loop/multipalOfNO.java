import java.util.Scanner;
public class multipalOfNO {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the no:");
        int n=obj.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
        obj.close();
    }
    
}
