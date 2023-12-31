public class RunTimeException {

//Exception is abnormal behaviour in the program.
//When an exception occurs in the program, and it is not handled properly then
//the lines below the exception do not get executed.

//Exceptions are of two types-
    //1. Compile time exception - these exceptions are thrown while compiling the program.
    //2. Runtime time exception - these exceptions are thrown when program is executed.

    /*
        In exception hierarchy Top level class is Throwable
        Exception class extends Throwable

        compile time exception -> IOException extends Exception
        compile time exception -> ClassNotFoundException extends Exception
        compile time exception -> FileNotFoundException extends Exception

        run time exception -> RuntimeException extends Exception

        ArithmeticException extends RuntimeException
        NullPointerException extends RuntimeException
        IndexOutOfBoundsException
            //ArrayIndexOutOfBoundsException
            //StringIndexOutOfBoundsException
     */

        public static void main(String[] args) {
            int a=10;
            int b=0;
            int c=a/b;
//            finally{
//                System.out.println("why ");
//            } // only used with try block
            //exception occurs here as / 0 is undefined , statements below this line will not be executed if exception not handled .
            // only in case of runtime exception
            // no lines will be executed after an exception occurs


            System.out.println(c);
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }
}

