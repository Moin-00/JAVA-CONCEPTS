package polymorphism.Overriding;

public class Dog extends Animal{
    @Override
    public void walk1() {
        super.walk1();
    }
    @Override
    Dog walk(){
        System.out.println("Dog is walking");
        return new Dog();
    }

    @Override
    public void run(String msg) {
        super.run(msg);
    }
}
