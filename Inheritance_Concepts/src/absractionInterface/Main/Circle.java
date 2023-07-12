package absractionInterface.Main;

import absractionInterface.Features.Shape;



public class Circle implements Shape {
    float radius;
    float area;

    public Circle(float radius) {
        this.radius = radius;
    }
    public float AreaOfCircle(float radius){
        return PI*radius*radius;
    }

    @Override
    public float calculateArea(int x, int y) {

        return 0 ;
    }

    @Override
    public void displayArea(int x, int y) {
        System.out.println("area ="+AreaOfCircle(radius));


    }
}

