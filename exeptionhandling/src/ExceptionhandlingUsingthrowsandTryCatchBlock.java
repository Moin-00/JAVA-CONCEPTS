public class ExceptionhandlingUsingthrowsandTryCatchBlock {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("Before Arithmetic Exception");
        try{
            c = getc(a, b);
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("The expression C=A/B gives "+e.getMessage()+" Exception");
        }finally{
            System.out.println("As Expression gives zero division error the expression won't be executed and the " +
                    "rest of the code will be" +
                    "executed as intended");
        }

        System.out.println("After Arithmetic Exception");
        System.out.println("Hi");

    }

    public static int getc(int a ,int b) throws ArithmeticException{
        int c = a/b;
        return c;
    }
}
