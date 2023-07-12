package absractionInterface.Main;

import absractionInterface.Features.Shape;

public class Rectangle implements Shape {
    @Override
    public float calculateArea(int x, int y) {
        return x*y;
    }

    @Override
    public void displayArea(int x, int y) {
        System.out.println("Area of Rectangle="+calculateArea(5,4));

    }
}
