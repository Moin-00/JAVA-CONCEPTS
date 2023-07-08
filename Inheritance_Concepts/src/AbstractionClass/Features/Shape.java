package AbstractionClass.Features;

public abstract class Shape {
    public static final double Pi=3.14;
    public double area;
    public Shape(){

    }
    public abstract void calculateArea();
//    This is an abstract method which need to be over-ridden in class that extends this class
//    declaring a abstract method inside an abstract class is not necessary
//    It purely depends on the application
//    but if an method is declared abstract it needs to be over-ridden
    public void displayArea(){
        System.out.println("Area of "+this.getClass().getName()+" ="+ area);
        System.out.println("Area of " + this.getClass() + " is " + area);
    }


}
