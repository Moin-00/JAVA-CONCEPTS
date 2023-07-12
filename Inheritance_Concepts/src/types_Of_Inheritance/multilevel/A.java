package types_Of_Inheritance.multilevel;

public class A {
    String name ="Moin";
    A(){
        System.out.println("In Super Class A");
    }
    void name (String name){
        String n = name;
//        this.name=name;
        System.out.println("My name is "+ n);
    }
}
