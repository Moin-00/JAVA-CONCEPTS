package abstractionClass.Main;

import abstractionClass.Features.Shape;

public class Circle extends Shape {
    double radius;

    public Circle(double radius){
        this.radius=radius;

    }


    @Override
    public void calculateArea() {
        area=Shape.Pi*this.radius*this.radius;
    }
}
