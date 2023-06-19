package inheritance;

import java.util.Arrays;

public class HondaCity extends Car {
    /*
    inherits fields
    String brandName;
    String yearofMan;
    int cc;
    boolean isPetrol;
    from Car Class
     */
    boolean hasSunRoof;
    boolean isAutoMatic;
    Wheel[] wheels;

    public HondaCity(boolean hasSunRoof, boolean isAutoMatic){
        super("Honda","2023",1300,true);
        System.out.println(this.getClass().getName() + "called");
        this.hasSunRoof =hasSunRoof;
        this.isAutoMatic =isAutoMatic;
    }

    public HondaCity(String brandName, String yearOfMan, int cc,
                     boolean isPetrol, boolean hasSunRoof,
                     boolean isAutoMatic, Wheel[] wheels){
        super(brandName,yearOfMan,cc,isPetrol);
        this.hasSunRoof =hasSunRoof;
        this.isAutoMatic =isAutoMatic;
        this.wheels =wheels;
    }
    public boolean isHasSunRoof(){
        return hasSunRoof;
    }
    public void setHasSunRoof(boolean hasSunRoof){
        this.hasSunRoof=hasSunRoof;
    }

    public boolean isAutoMatic() {
        return isAutoMatic;
    }

    public void setAutoMatic(boolean autoMatic) {
        isAutoMatic = autoMatic;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }
    // toString method is used for String representation of the state of constructor
    //It means we can print the elements/fields of constructor as string using toString method
    //it is used mostly for debugging purpose as it provides a concise representation of the objects State.
    //if to string method is not overridden it prints CLassName@hashCode
    public String toString(){
        return "HondaCity{" +
                "hasSunRoof=" + hasSunRoof +
                ", isAutoMatic=" + isAutoMatic +
                ", wheels=" + Arrays.toString(wheels) +
                "} " + super.toString();
    }

}
