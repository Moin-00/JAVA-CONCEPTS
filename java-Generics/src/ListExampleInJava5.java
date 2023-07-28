import java.util.ArrayList;
import java.util.List;

public class ListExampleInJava5 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Vikram");
        list.add("Moin");
        list.add("Siddhartha");
        for (String name : list){
            System.out.println("Name = "+name);
        }
        ArrayList<Integer> integers =new ArrayList<>();
        integers.add(2);
        integers.add(5);
        for (int i :integers) {
            System.out.println(i);

        }

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Moin", 23 , 100));
        studentsList.add(new Student("Vikram", 28 , 101));
        studentsList.add(new Student("Siddhartha", 29, 102));
        studentsList.add(new Student("Unknown", 19, 103));

        for (Student student :studentsList){
            System.out.println("\n\nInformation of all students"+student);

        }

        System.out.println("generics");
        Employee<Hr>/*Here Hr is actual Data type*/ hrEmployee =new Hr();
        Employee<Hr> hrEmployee1 =new Developer();
        hrEmployee.name();
        hrEmployee1.name();//Method name() which was overridden in Developer is called


        Employee<Admin> adminEmployee = new Admin();
        Employee<Developer> developerEmployee = new Developer();

//        Employee<> adminEmployee = new Admin();
//        When generics are used in a class then while creating its object or object of its subclass
//        Identifier are required in this case Admin :- "Employee<Admin>"








    }
}
