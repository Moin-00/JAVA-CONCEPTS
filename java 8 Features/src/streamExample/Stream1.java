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
        concatOfGuest
                .filter(parameter->{
                    boolean condition =parameter.length()>4;

                    return condition;
                })
                .map(parameter -> {
                    String p =parameter.toUpperCase();
                    String concat =p.concat(" :- Fits the condition of Char length greater than four");
                    return concat;
                })

                .forEach(System.out::println);


    }
}
