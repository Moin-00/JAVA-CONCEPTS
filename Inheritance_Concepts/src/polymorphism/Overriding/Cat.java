package polymorphism.Overriding;

public class Cat extends Animal{
    @Override
    public void walk1() {
        super.walk1();
    }
    @Override
    Cat walk(){
        System.out.println("Cat is Walking");
        return new Cat();
    }

    @Override
    public void run(String msg) {
        super.run(msg);
    }
}
