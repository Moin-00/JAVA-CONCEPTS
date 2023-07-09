package Casting;

public class Driver {
    public static void main(String[] args) {
        Machine machine =new Machine();
        machine.powerOn();
        machine.powerOff();

        Laptop laptop=new Laptop();
        laptop.powerOn();
        laptop.displayDocument();
        laptop.powerOff();

        Printer printer =new Printer();
        printer.powerOn();
        printer.print();
        printer.powerOff();

//        Upcasting
        Machine newPrinterMachine = new Printer();
//        SuperClass SuperClassObject =new SubClass();
//        subClass is assigned to super class
        newPrinterMachine.powerOn();
        System.out.println("As Machine do not have the method of print it cannot execute it");
        newPrinterMachine.powerOff();
        System.out.println("\n"+" Down casting");

//        Downcasting
//        Cannot execute these methods as it throws class exeption error
//        Printer printer1=(Printer) new Machine();
//        printer1.powerOn();
//        printer1.print();
//        printer1.powerOff();
    }
}
