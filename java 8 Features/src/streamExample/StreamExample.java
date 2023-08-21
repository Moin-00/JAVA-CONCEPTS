package streamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> guestList = new ArrayList<>();
        guestList.add("Moin");
        guestList.add("Mulani");
        guestList.add("Person");
        List<String> newList = new ArrayList<>();
        // streams are used to replace for and while loops for user defined data type
        Stream<String> stringStream = guestList.stream();
        stringStream
                .filter(s -> {
                    System.out.println("Inside Filter s :"+s);
                    return s.length()>=6; //If this condition fails it will go to next element
                })
//                Here map is used to map s1 to lowercase method and its value is returned to stream which is inherited
//                by any method/filter in stream after map value and apply this value to next methods made in map
                .map(s1 -> {
                    System.out.println("Inside map s1 "+s1);
                    newList.add(s1);    // adding the element in to another object

                    return s1.toLowerCase();
                })
                .toList()
                .forEach(s3-> System.out.println("Inside foreach S3 :"+s3));


        System.out.println("**************"+stringStream);

//         It is only used to iterate values of Stream
//         methods inside Stream is a pipeline which means that for every element in stream each method is executed and
//         i.e.
//         for 1 element every method is executed then for next element and so on

//         stringStream.forEach(element->{System.out.println(element)});
        // cannot access elements of stream more than once i.e. once an element is read it is consumed and cannot be
        // accessed through stream again but if we store the value in another object while reading from stream we can
        // access those elements

        List<String> StreamList =  guestList.stream()
                .filter(s -> {
                    System.out.println("Inside Filter s :"+s);
                    return s.length()>=6; //If this condition fails it will go to next element
                })
                        .toList();
        /*
        List<String> StreamList =  guestList.stream();
                StreamList
                        .filter(s -> {
                            System.out.println("Inside Filter s :"+s);
                            return s.length()>=6; //If this condition fails it will go to next element
                        })
                        .toList();
          //This will not work
          */

        System.out.println("88888"+StreamList);




        System.out.println(guestList.toString());
        System.out.println("******** Elements after processing through Stream"+newList.toString());









    }
}
