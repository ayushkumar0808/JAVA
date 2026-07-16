public class SuperKeyword {
    public static void main(String[] args) {
        child obj=new child(101, "ayush", "blr");
        child obj1=new child(103, "ayushi", "balr");
        child obj2=new child(105, "ayusha", "blaar");
        obj.display();
        obj1.display();
        obj2.display();     
    }
    
}
class parent 
{
    int id;
    String name;
    parent(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.print("id:"+id+" name:"+name);
    }
}
class child extends parent
{
    String city;
    child(int id,String name, String city)
    {
        super(id, name);
        this.city=city;
    }
    void display()
    {
        super.display();
        System.out.println(" city:"+city);
    }

}
