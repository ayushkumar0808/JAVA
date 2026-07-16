public class ayush{
    int age=22;
    double wt=72.44;
    String name = "Ayush";
    char bl='O';
     void display(){

        System.out.println("Name:"+ name 
        + "\nAge:"+age+"\nweight:"+wt+
        "\nblood grp:"+bl);
     }
     public static void main(String[] agrs){
        ayush obj = new ayush();
        obj.display();
     }
}