public class Driver {
    public static void main(String[] args) {
        Machine machine = new Machine();//Hard coupling
        machine.power_on();
        machine.reboot();
        machine.power_off();
        System.out.println("\nLoose coupling using Machine class");

        IMachine iMachine =new Machine();
//        IMachine iMachine1 = new IMachine() { //Doesn't actually creates the object of interface
        //rather creates 
//            @Override
//            public void power_on() {
//
//            }
//
//            @Override
//            public void power_off() {
//
//            };//Anonymous Class

        iMachine.power_on();
        iMachine.power_off();
        System.out.println("\nLoose coupling using Laptop class");


        IMachine laptopmachine =new Laptop();
        laptopmachine.power_on();
        laptopmachine.power_off();
//        iMachine.reboot();
/*this Statement cannot be implemented because in iMachine obj of IMachine
does not have a method called reboot() in it*/

    }

}
