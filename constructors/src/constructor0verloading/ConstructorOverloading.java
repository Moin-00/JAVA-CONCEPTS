package constructor0verloading;

public class ConstructorOverloading {
    private String name;

    private int id;

    //no-argument constructor
    public ConstructorOverloading() {
        System.out.println("no-argument constructor called !");
    }

    //overloaded constructor with one argument(name)
    public ConstructorOverloading(String name) {
        this.name = name;
        System.out.println("constructor with one argument(name) called !");
    }

    //overloaded constructor with one argument(id) 'argument type is different'
    public ConstructorOverloading(int id) {
        this.id = id;
        System.out.println("constructor with one argument(id) called !");
    }


    //another overloaded constructor with two argument (String , int)
    public ConstructorOverloading(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("constructor with two arguments(String , int) called !");
    }

    //another overloaded constructor with two argument (int , String) 'Seq of arguments is different'
    public ConstructorOverloading(int id, String name) {
        this.name = name;
        this.id = id;
        System.out.println("constructor with two arguments(int , String) called !");
    }
}


