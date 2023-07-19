public class ExceptionHandlingUsingTryAndCatchBlock {
    public static void main(String[] args) {
        int a = 10;
        int b =0;
        int c= 0;
/*
* whatever piece of code that might throw an exception is supposed to be placed in try block
* and the type of exception that occurs is supposed to be caught in catch block
* finally block is used to release resources
* and resources here means db connections or file connection or sockets*/
        try{
            c=a/b;

        }catch(ArithmeticException arithmeticException){
            System.out.println("Arithmetic Exception :"+ arithmeticException.getMessage());
        }finally{
            System.out.println("Finally block are always executed irrespective of an exception");
        }
        System.out.println(c);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
