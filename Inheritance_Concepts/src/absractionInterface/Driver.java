package absractionInterface;

import absractionInterface.Main.Circle;
import absractionInterface.Main.Rectangle;
import absractionInterface.Main.Square;

public class Driver {
    public static void main(String[] args) {
//        Circle circle = new Circle(5);
        Square square=new Square();
        Circle circle=new Circle(5.5F);
        Rectangle rectangle=new Rectangle();
        square.displayArea(5,5);
        rectangle.displayArea(5,10);
        System.out.println("Area of Circle="+circle.AreaOfCircle(5.2f));


    }



}
