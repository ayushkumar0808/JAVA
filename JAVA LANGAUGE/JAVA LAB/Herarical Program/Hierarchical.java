class Employee
{
    String name;
    int id ;
    double salary;
    Employee(String name,int id , double salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display()
    {
        System.out.println("Name:"+name+"\nId:"+id+"\nSalary:"+salary);
    }
}
class Developer extends Employee
{
    double OT;
    Developer(String name ,int id , double salary, double OT)
    {
        super(name,id,salary);
        this.OT=OT;
    }
    void display()
    {
        super.display();
        System.out.println("Over Time Salary:"+OT);
    }
}

class Manager extends Employee
{
    double bonus;
    Manager(String name ,int id , double salary, double bonus)
    {
        super(name,id,salary);
        this.bonus=bonus;
    }
    void display()
    {
        super.display();
        System.out.println("Bonus:"+bonus);
    }
}

class Hierarchical {
    public static void main(String[] args) {
        Developer d=new Developer("Ayush",101,10000.00,5000.00);
        d.display();
        Manager m= new Manager("Anuj",102,300000.00,4000.0);
        m.display();

    }
    
}
