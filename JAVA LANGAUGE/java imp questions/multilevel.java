public class multilevel {
    public static void main(String[] args) {
        System.out.println("UG student");
        UgStudents u=new UgStudents(101,"Ayush",90,98,97);
        u.marksStatemnt();
        System.out.println("\nPG student");
        PgStudents p= new PgStudents(105,"Anuj",99,95,90,75,87);
        p.markStatement();
    }
    
}
class Students
{
    int id;
    String name;
    Students(int id , String name)
    {
      this.id=  id;
      this.name=name;

    }
    void display()
    {
        System.out.println("id="+id+" Name="+name);
    }
}
 class  UgStudents extends Students
{
    int m1,m2,m3;
    UgStudents(int id,String name, int m1, int m2, int m3)
    {
        super(id, name);
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    int TotalMarks()
    {
        return m1+m2+m3;
    }
    String res()
    {
        if(m1>=40&&m2>=40&&m3>=40)
            return"pass";
        else
            return"fail";
    }
    void marksStatemnt()
    {
        display();
        System.out.println("M1="+m1+" M2="+m2+" M3="+m3);
        System.out.println("Totalmarks="+TotalMarks()+" Result="+res());
    }
 
}
class PgStudents extends UgStudents
{
    int MiniProject , Seminar;

    PgStudents(int id,String name, int m1, int m2, int m3,int MiniProject , int Seminar)
    {
        super(id, name, m1, m2, m3);
        this.MiniProject=MiniProject;
        this.Seminar=Seminar;
    }
    int TotalMarks()
    {
        return (super.TotalMarks()+MiniProject+Seminar);
    }
    String res()
    {
        if(m1>=40&&m2>=40&&m3>=40&&MiniProject>=40&&Seminar>=40)
        {
            return "Pass";

        }
        else
            return"Fail";
    }
    void markStatement()
    {
        display();
        System.out.println("M1="+m1+" M2="+m2+" M3="+m3+" Miniproject="+MiniProject+" Seminar="+Seminar);
        System.out.println("Totalmarks="+TotalMarks()+" Result="+res());

        
    }
}