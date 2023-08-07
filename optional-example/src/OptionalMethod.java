import java.util.Optional;
import java.util.Scanner;

public class OptionalMethod {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Optional<String> stringOptional = Optional.ofNullable(name);
        System.out.println(stringOptional.isPresent());
        System.out.println("To get the value of optional"+stringOptional.get());
        System.out.println("Length of value inside Optional"+stringOptional.get().length());



        stringOptional.ifPresentOrElse(s -> System.out.println("Value present inside Optional is"+s),
                ()->System.out.println("No value is present"));

//        stringOptional.ifPresentOrElse(s -> System.out.println("Value present inside Optional is"+s),
//                c->System.out.println("No value is present"));  //  this throws an exception.
//       we cannot write the second statement with a parameter  as second statement is executed when the condition for
//      first statement is false similar to if and else statement

        stringOptional.map(
                s -> {
                    System.out.println("S is -"+s);
                    Character firstChar = s.charAt(0);
                    return firstChar;
                }
        ).ifPresentOrElse(s -> System.out.println("Value present inside Optional is"+s),
                ()->System.out.println("No value is present"));

        stringOptional.filter(s -> s.length() > 10).ifPresentOrElse(
                s -> {
            Integer length = s.length();
            System.out.println("Length of String value is"+length);
        },
                ()-> System.out.println("Empty optional is returned by filter after condition checking"));

//        If a value is present returns a value
//        otherwise throws an exception produced by exception supplying function .
        System.out.println("String from optional using orElseThrow"+ stringOptional.orElseThrow(
                ()-> {
                    System.out.println("Exception occurred due to no value present inside optional");
                    return new Exception("Exception occured");
                }
        ));
    }

}
