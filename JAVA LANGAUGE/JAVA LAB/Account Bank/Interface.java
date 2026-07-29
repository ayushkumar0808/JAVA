class Account
{
    String name;
    int id;
    double bal;
    Account(String name, int id , double bal)
    {
        this.name=name;
        this.id=id;
        this.bal=bal;
    }
    void display()
    {
        System.out.println("Name:"+name+"ID:"+id);
    }
    double getBal()
    {
        display();
        return bal;
    }
    void deposit(double amount)
    {
        bal=bal+amount;
    }
    void withdraw(double amount)
    {
        if(amount>bal)
            System.out.println("no sufficient money..");
        else
            bal=bal-amount;
    }
}

public class Interface {

    public static void main(String[] args) {
        Account a=new Account("Ayush",101,120000);
        System.out.println("Avialable bal:"+a.getBal());
        a.deposit(5000);
        System.out.println("Avialable bal:"+a.getBal());
        a.withdraw(4000);
        System.out.println("Avialable bal:"+a.getBal());
    }
    
}
