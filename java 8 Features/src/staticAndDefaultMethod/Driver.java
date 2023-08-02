package staticAndDefaultMethod;
class Test implements ExampleInterface {
    @Override
    public int randomCalculate(int a, int b) {
        return a+b;
    }

//    @Override
//    public void print() {
//
//    }

    @Override
    public void print(int result) {
        ExampleInterface.super.print(10);
    }
}
class Test2 implements ExampleInterface {

    @Override
    public int randomCalculate(int a, int b) {
        return a*b;
    }

//    @Override
//    public void print() {
//
//    }
}

public class Driver {
    public static void main(String[] args) {
        ExampleInterface.showMsg();
        Test test = new Test();
        Test2 test2 = new Test2();
        System.out.println(test.randomCalculate(10,20));
        test.print(1);
    }
}
