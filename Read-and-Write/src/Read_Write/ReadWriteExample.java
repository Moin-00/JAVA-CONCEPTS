package Read_Write;
import java.util.Scanner;

public class ReadWriteExample {
    public static void main(String[] args) {
        System.out.println("Hello please enter a string");
        Scanner scanner =new Scanner(System.in);
        //system.in provides the source and input string to the Scanner class

        String input= scanner.nextLine();
        System.out.println(input);


    }
}
