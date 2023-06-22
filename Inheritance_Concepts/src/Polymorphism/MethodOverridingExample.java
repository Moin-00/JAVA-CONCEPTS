package Polymorphism;

public class MethodOverridingExample {
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
        MethodOverridingExample m=new MethodOverridingExample();


        m.display();

        m.display("moin");
        m.display("moin",1);
    }
}
