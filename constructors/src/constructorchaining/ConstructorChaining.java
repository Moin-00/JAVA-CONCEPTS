package constructorchaining;

public class ConstructorChaining {
    String name;
    int age;
    String address;
    long phone_no;
    public ConstructorChaining() {
        this("Moin.M");
        System.out.println("inside no argument constructor");
    }
    public ConstructorChaining(String name) {
        this(name,10);
        System.out.println("inside ConstructorChaining(String name)");
    }

    public ConstructorChaining(String name, int age) {this(name,age,"Gondhalenagar,Hadapsar",866830851);
        System.out.println("inside (String name, int age)");
    }

    public ConstructorChaining(String name, int age, String address, long   phone_no) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone_no = phone_no;
        System.out.println(" Name ="+ name+"\n Age ="+age+"\n Address ="+address+"\n Phone no ="+phone_no);
        System.out.println("Inside (String name, int age, String address, double phone_no)");}
    //    public ConstructorChaining(String name, int age, String address, double phone_no) {
//        System.out.println("inside (String name, int age, String address, double phone_no)");
//        System.out.println("name ="+name ,
//   }
    public static void main(String[] args) {
        ConstructorChaining C = new ConstructorChaining();
    }
}






