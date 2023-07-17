package typesofconstructor;

public class Constructors {
int id;
String name;
int age;

    public Constructors() {
        System.out.println("NO_ARGUMENT CONSTRUCTOR CALLED");
    }

    public Constructors(int id, String name, int age) {
//        parameterised constructor
        System.out.println("PARAMETERISED CONSTRUCTOR CALLED");
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println(toString());
    }


Constructors(Constructors constructor){
//        COPY CONSTRUCTOR
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

