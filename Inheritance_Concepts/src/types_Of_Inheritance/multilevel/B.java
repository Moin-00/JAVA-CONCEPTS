package types_Of_Inheritance.multilevel;

public class B extends A{
    int age;
//    B(){
//        System.out.println("In Class B");
//    }

    public B(int age) {
        super();
        this.age = age;
        System.out.println("\nInside B");
        System.out.println(super.name+"'s age is "+age);

    }


}
