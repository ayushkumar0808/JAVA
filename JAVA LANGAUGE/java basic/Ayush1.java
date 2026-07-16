public class Ayush1 {
    public static void main(String[] args) throws InterruptedException{
        for(int i=9;i>0;i--){
            System.out.print(i);
            Thread.sleep(1000);
            System.out.print("\b");
        }
        System.out.println("HAPPY BIRTHDAY!!\u2764");
    }
}
