public class Laptop implements IMachine{
    @Override
    public void power_on() {
        System.out.println(this.getClass().getName()+" power on");
    }

    @Override
    public void power_off() {
        System.out.println(this.getClass().getName()+" power off");

    }
}
