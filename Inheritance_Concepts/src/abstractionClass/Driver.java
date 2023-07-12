package abstractionClass;

import abstractionClass.Features.Shape;
import abstractionClass.Main.Circle;
import abstractionClass.Main.Rectangle;

public class Driver {
    public static void main(String[] args) {
        Circle c =new Circle(5.5);
        Shape rectangle =new Rectangle(5,9);

        c.calculateArea();
        c.displayArea();
        rectangle.calculateArea();
        rectangle.displayArea();

    }




    }

