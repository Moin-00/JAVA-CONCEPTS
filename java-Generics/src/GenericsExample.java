import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Moin");
        list.add(100);
        list.add(10.5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        String secondItem = (String) list.get(1);//Gives Runtime Exception

    }
}
