package functional_Interface1;

public class Driver {

    public static void main(String[] args) {
        ExampleInterface instanceAnonymousClass = new ExampleInterface() {//this creates a new class as ExampleInterface
            @Override
            public int randomCalculate(int a, int b) {
                System.out.println("randomCalculate() method called inside anonymous class!!!");
                return 0;
            }
        };
        instanceAnonymousClass.print(200);
        instanceAnonymousClass.max();
        instanceAnonymousClass.randomCalculate(10,20);

        ExampleInterface instanceLambda = (a,b)-> {
            System.out.println("lambda Expression a*b = "+a*b);
            return 0;
        };

        instanceLambda.randomCalculate(12,12);


    }
}
