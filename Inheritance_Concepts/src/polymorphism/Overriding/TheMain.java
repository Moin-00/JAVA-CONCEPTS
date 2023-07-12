package polymorphism.Overriding;

public class TheMain {
    public static void main(String[] args) {
        Animal animal =new Animal();
        Animal dog=new Dog();
        Animal cat=new Cat();

        animal.walk();
        animal.walk1();
        animal.run("running");
        System.out.println("\n through upcasting \n");
        dog.walk();
        dog.walk1();
        dog.run("barking");
        System.out.println("\n through up casting \n");
        cat.walk();
        cat.walk1();
        cat.run("licking");


    }
}
