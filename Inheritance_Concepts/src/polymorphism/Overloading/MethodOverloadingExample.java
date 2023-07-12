package polymorphism.Overloading;
/*
    Many form of same item/thing
    Single method can have many forms. -> Poly morphism
    1. Static polymorphism or compile-time polymorphism or method overloading
        a - No of parameter can be different
        b - Seq of parameter can be different
        c - Type of parameter can be different
        note - they can have any access level and return type but just having diff access level or return
        type doesn't mean methods are overloaded.
    2. Dynamic polymorphism or runtime polymorphism or method overriding
 */

public class MethodOverloadingExample {
    public void display(){
        System.out.println("Without parameter method called");
    }
    public void display(String name){
        System.out.println("Method with one parameter called\t"+name);
    }
    public void display(String name, int value){
        System.out.println("Method with 2 parameter called\t"+name+"\t Occurence\t"+value);
    }
    public static void main(String[] args) {
        MethodOverloadingExample m=new MethodOverloadingExample();


        m.display();

        m.display("moin");
        m.display("moin",1);
    }
}
