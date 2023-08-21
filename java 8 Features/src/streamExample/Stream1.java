package streamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {
        List<String> guest = new ArrayList<>();
        guest.add("Moin");
        guest.add("Person2");
        guest.add("Person3");
        guest.add("Person4");
        Stream<String> concatOfGuest = guest.stream();
        List<String> list = concatOfGuest
                .filter(parameter -> {
                    boolean condition = parameter.length() > 4;

                    return condition;
                })
                .map(parameter -> {
                    String p = parameter.toUpperCase();
                    String concat = p.concat(" :- Fits the condition of " + "'Char length greater than four'");
                    return concat;
                })

                .toList();

//                .forEach(System.out::println);


        System.out.println("Concat"+concatOfGuest);

        List<String> elements = new ArrayList<>();
        elements.add("Moin");
        elements.add("AAAaaa");
        elements.add("BBBbbb");
        System.out.println(elements);

        List<String> streamlist = elements.stream()
//                .toList()
                .filter(s -> {
                    return s.length()>4;
                })
                .toList(); //returns a list containing stream elements

        System.out.println("Elements after applying stream "+streamlist);

        System.out.println(guest);

    }
}
