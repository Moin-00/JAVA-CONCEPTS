package casting;

public class Machine {
//    this is the super Class
    void powerOn(){
        System.out.println(this.getClass().getName()+" is Switching ON");
    }
    void powerOff(){
        System.out.println(this.getClass().getName()+" is Shutting Down");
    }
}
