package types_Of_Inheritance.multilevel;

public class C extends B{
    String address;
    C(String address){
        super(23);
        this.address=address;
        System.out.println("\nInside Class C");
        System.out.println(super.name+ "'s age is "+super.age+" and Address is "+address);

    }
    public static void main(String[] args) {
        C c =new C("Gondhale_nagar_hadapsar_pune_28");
        c.name("Moin");

    }
}
