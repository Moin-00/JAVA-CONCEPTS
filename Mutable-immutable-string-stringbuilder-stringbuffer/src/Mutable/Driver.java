package Mutable;
/*
* mutable Class.
* Class whose object after initialization cam be modified are called mutable classes
* mutable means once a field is created it can be modified even after the initialization
* that means a field can be modified at any point in the program
* in these cases possibility of a hacker modifying a field is more
* */

public class Driver {
    public static void main(String[] args) {
        Address address =new Address(19,"GulabPath","Pune",411028);
        Employee employee =new Employee(100101,15000,"Moin",address);
        System.out.println(employee);
//        here we can set the fields of employee and address class so these classes are mutable
        employee.setId(4449);
        address.setCity("Hadapsar");
        System.out.println("\n"+employee);
    }
}
