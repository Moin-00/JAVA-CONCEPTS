public class Machine implements IMachine{

    @Override
    public void power_on() {
        System.out.println("Machine Power On");
    }

    @Override
    public void power_off() {
        System.out.println("Machine Power Off");
    }
    public void reboot(){
        System.out.println("Rebooting the machine");
    }
}
