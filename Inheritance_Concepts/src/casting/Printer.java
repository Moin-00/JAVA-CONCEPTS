package casting;

public class Printer extends Machine {
    void print(){
        System.out.println(this.getClass().getName()+ " is Printing");
//        Method only available in Printer class
    }
}
