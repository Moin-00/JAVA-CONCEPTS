package Lambda;
import java.util.ArrayList;
import java.util.List;


public class LambdaFunction {
    public static void main(String[] args) {
        List<String> groceryList = new ArrayList<>();
        groceryList.add("Sugar");
        groceryList.add("Salt");
        groceryList.add("Soap");


        groceryList.forEach( item -> System.out.println(item));
        //        groceryList.forEach(System.out::println); //Another Method to Execute the above Statement
        //this is an example of one line lambda exp -> item -> System.out.println(item)
    }

}
