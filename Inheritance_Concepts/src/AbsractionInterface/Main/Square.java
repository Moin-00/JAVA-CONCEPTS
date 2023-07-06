package AbsractionInterface.Main;

import AbsractionInterface.Features.Shape;

public class Square implements Shape {
//    int x;
//    int y;
//    public Square(int x,int y) {
//        this.x = x;
//        this.y= y ;
//    }
    @Override
    public float calculateArea(int x, int y) {
        return x*y;
    }

    @Override
    public void displayArea(int x, int y) {
        System.out.println("area of square="+calculateArea(x, y));


    }
}
