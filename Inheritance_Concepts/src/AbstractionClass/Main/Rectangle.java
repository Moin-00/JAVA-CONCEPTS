package AbstractionClass.Main;

import AbstractionClass.Features.Shape;

public class Rectangle extends Shape {

    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        area= this.length*this.breadth;

    }
}
