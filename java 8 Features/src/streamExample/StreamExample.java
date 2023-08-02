package streamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> guestList = new ArrayList<>();
        guestList.add("Moin");
        guestList.add("Mulani");
        guestList.add("PremDabhade");
        // streams are used to replace for and while loops for user defined data type
        Stream<String> stringStream = guestList.stream();
        stringStream
                .filter(s -> {
                    System.out.println("Inside Filter s :"+s);
                    return s.length()>=4;
                })
//                Here map is used to map s1 to lowercase method and its value is returned to stream which is inherited
//                by any method/filter in stream after map value and apply this value to next methods made in map
                .map(s1 -> {
                    System.out.println("Inside map s1"+s1);
                    return s1.toLowerCase();
                })
                .forEach(s3-> System.out.println("Inside foreach S3 :"+s3));
//         It is only used to iterate values of Stream
//         methods inside Stream is a pipeline which means that for every element in stream each method is executed and
//         i.e.
//         for 1 element every method is executed then for next element and so on









    }
}
