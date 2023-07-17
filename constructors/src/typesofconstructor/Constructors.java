package typesofconstructor;

public class Constructors {
int id;
String name;
int age;

    public Constructors(int id, String name, int age) {
        System.out.println("NO_ARGUMENT CONSTRUCTOR CALLED");
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println(toString());
    }

    //Constructors(int id ,String name , int age){
//    System.out.println("NO_ARGUMENT CONSTRUCTOR CALLED");
//    this.id=id;
//    this.name=name;
//    this.age=age;
//    System.out.println(toString());
//}
Constructors(Constructors constructor){
    System.out.println("Copy constructor called");
    this.id= constructor.id;
    this.name= constructor.name;
    this.age= constructor.age;
    System.out.println(toString());


}
    @Override
    public String toString() {
        return "Constructors{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

