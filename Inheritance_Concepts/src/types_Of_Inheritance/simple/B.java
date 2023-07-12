package types_Of_Inheritance.simple;
/*In simple inheritance only one class extends another class */
public class B extends A {
    B(){
        super();
        System.out.println("Inside constructor of subClass");
    }
    public static void main(String[] args) {
        B b =new B();
        b.superClass();



    }
}
