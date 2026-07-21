class Parent {

     void display() {
        System.out.println("This is final method");
    }
}

class Child extends Parent {

     void display() 
     {
        System.out.println("This is final method"); 
     }
}

public class Demo {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.display();
    }
}