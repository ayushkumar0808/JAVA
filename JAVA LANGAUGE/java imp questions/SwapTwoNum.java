public class SwapTwoNum {
  static  void swap()
    {
        int s=7, v=8;
        s=s^v;
        v=s^v;
        s=s^v;
        System.out.println("s="+s+"\nv="+v);
    }
        
    public static void main(String[] args) {
        int a =5 ,b= 6;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a="+a+"\nb="+b);
        swap();
    }
    
}
