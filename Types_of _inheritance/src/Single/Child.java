package Single;

public class Child extends Parent {
    @Override
    void display() {
        super.display();
    }
    int id;
    void Brain(){
        super.display();
        this.id=5;
        super.no=10;
        System.out.println(id+"\n"+no);
        /*
        * Super and this only accessed outside static class in this case main method
        * */
    }



    public static void main(String[] args) {
        Child child= new Child();
        child.display();
        child.Brain();
//        super.display(); /*keywords like super and this reference to parent or instance of a class as static can only access other static fields it does not understand instance specific data*/
//        this.id;


    }




}
