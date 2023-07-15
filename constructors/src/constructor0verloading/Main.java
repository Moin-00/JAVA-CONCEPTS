package constructor0verloading;

public class Main {


        public static void main(String args[]) {

            //object creation and no-argument constructor called
            ConstructorOverloading s1 = new ConstructorOverloading();

            //object creation and constructor with one param(String) called
            ConstructorOverloading s2 = new ConstructorOverloading("Vikram");

            //object creation and constructor with one param(int) called
            ConstructorOverloading s3 = new ConstructorOverloading(10);

            //object creation and constructor with two params (String ,int) called
            ConstructorOverloading s4 = new ConstructorOverloading("Vikas",29);

            //object creation and constructor with two params (int , String) called
            ConstructorOverloading s5 = new ConstructorOverloading(29,"Vivek");


        }

}
