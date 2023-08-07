import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String name = "MoinMulani";
        if (name != null && !name.isEmpty() && name.length() > 4) {
            System.out.println("The name is not null , not empty and length of name is greater than 4");
        } else {
            System.out.println("The name null or Empty or length of name is smaller than or equal to 4");
        }
        /*
        To create an Optional object on given object there are 3 methods
        1. of -> Use when object is not null otherwise it will throw an NPE( NullPointerException )
        2. ofNullable -> Use when object may be null. this method returns Optional object with the value provided
        if object is null it will return Optional with no value inside it.
        3. empty -> returns an Optional with no value inside it
         */
        Optional<String> emptyoptional =Optional.empty();
        System.out.println("Empty optional is created with empty object inside it & " +
                "function emptyoptional.isEmpty() returns- "+ emptyoptional.isEmpty());
        System.out.println("Empty optional is created with empty object inside it & " +
                "function emptyoptional.isPresent() returns- "+ emptyoptional.isPresent());
        String nullobject =null;



        Optional<String> optionalString = Optional.of("MoinMulani");
//  With the help of Optional, null checks can be removed from program.
//  use ".of(' value ')" when there is a value provided in optional otherwise it will throw an NPE(NullPointerException)
        if(optionalString.isPresent() && optionalString.get().length() > 4  ){
            System.out.println("Using optional-The name is not null , not empty and length of name is greater than 4");
        }else {
            System.out.println("Using optional-The name null or Empty or length of name is smaller than or equal to 4");
        }

        Optional<String> optionalstring1 = Optional.ofNullable(nullobject);
//        Here the value of object is null
        if(optionalstring1.isPresent()&& optionalstring1.get().length()>4){
            System.out.println("Using optional (.ofNullable)-The name is not null ," +
                    " not empty and length of name is greater than 4");
        }else {
            System.out.println("Using optional (.ofNullable)-The name is null or Empty or " +
                    "length of name is smaller than or equal to 4");
        }



    }
}
