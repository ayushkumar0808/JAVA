import java.util.Scanner;

public class Matrixadd {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Eter the number of rows And colums:");
        int r=obj.nextInt();
        int c =obj.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int sum[][]=new int[r][c];
        System.out.println("Enter the First element of array:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=obj.nextInt();
            }

        }
        System.out.println("Enter the Second element of array:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=obj.nextInt();
            }

        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }

        }
        System.out.println("sum is");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println(sum[i][j]+" ");
               
            }
System.out.println();
        }
        obj.close();
    }
}
