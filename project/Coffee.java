import java.util.Scanner;

public class Coffee
{
    
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("\n-----Wlecone TO Coffee Cafe!-----\n");
        System.out.println("Choose Your Coffee:\n1.Espresso--$200");
        System.out.println("2.Cappuccinu--$250");
        System.out.println("3.Latte--$350\n");
        System.out.print("Enter your Choice:");
        int ch=obj.nextInt();
        int price=0;
        if(ch==1||ch==2||ch==3)
        {
            if(ch==1)
            {
                price=200;
            }
            else if(ch==2)
            {
                price=250;
            }
            else
            {
                price=300;
            }
            System.out.print("Add Wipped Cream for $30 (yes=1/no=0):");
            int chh=obj.nextInt();
            if(chh==1)
            {
                price += 30;
            }
            System.out.print("Add Flavor shot?(Vanilla for $20 Hazelnut For $30(yes=1/no=0)):");
            int chhh=obj.nextInt();
            if(chhh==1)
            {
                System.out.print("Enter 1 For Vanilla 2 for Hazelnut:");
                int chhhh=obj.nextInt();
                if(chhhh==1)
                {
                    price += 20;
                }
                if(chhhh==2)
                {
                    price += 25;
                }
            }
             System.out.println("\nTatal bill=$"+price);
        }
        else
        {
            System.out.println("\nInvaild Coffee Choice!!");
        }
        obj.close();
    }
}
