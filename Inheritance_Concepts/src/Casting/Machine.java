package Casting;

public class Machine {
    void powerOn(){
        System.out.println(this.getClass().getName()+" is Switching ON");
    }
    void powerOff(){
        System.out.println(this.getClass().getName()+" is Shuting Down");
    }
}
