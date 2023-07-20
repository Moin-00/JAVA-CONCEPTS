public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        try{
            System.out.println("Print value at index 10"+arr[10]);

        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("ArrayIndexOutOfBoundsException :"+arrayIndexOutOfBoundsException.getMessage());
        }


    }
}