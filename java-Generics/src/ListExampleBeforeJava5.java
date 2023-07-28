import java.util.ArrayList;
import java.util.List;

public class ListExampleBeforeJava5 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Moin");
        list.add(100);
        list.add(10.5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        String secondItem = (String) list.get(1);//Gives Runtime Exception
//        AS List is a collection of different data type we
//        Cannot change the type of list to integer or String
//        But by using generics we can restrict the list to only one type of elements


    }
}
