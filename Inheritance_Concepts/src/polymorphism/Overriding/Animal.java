package polymorphism.Overriding;

public class Animal {
    String msg;
    public void walk1(){
        System.out.println(this.getClass().getName()+" is Walking");
    }
    Animal walk(){
        System.out.println(this.getClass().getName()+" is walking");
        return new Animal();
    }
    public void run(String msg){
        this.msg=msg;

        System.out.println(this.getClass().getName()+" is "+ msg);
    }
}
