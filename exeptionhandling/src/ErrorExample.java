/*
* Error is an  abnormal condition that cannot be handled or recovered ,
* whereas exception only halts the program where exception occurs and can be handled with try and catch block
* */
public class ErrorExample {
    public static void main(String[] args) {
        SayHello();
    }
    static void SayHello(){
        System.out.println("Hello");
        SayHello(); //recursion
//        recursion keeps calling the method until the StackOverflowError and we cannot handle this error
    }

}
