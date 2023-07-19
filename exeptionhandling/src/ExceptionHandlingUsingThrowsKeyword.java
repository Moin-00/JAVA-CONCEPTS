public class ExceptionHandlingUsingThrowsKeyword {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("Before Arithmetic Exception");
        c = getc(a, b);
        System.out.println("Arithmetic Exception");

    }

    public static int getc(int a ,int b) throws ArithmeticException{
        int c = a/b;
        return c;
    }
}
