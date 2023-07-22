package Immutable;
/*
* immutable object are objects whose fields cannot be modified after they are
* declared i.e. the values assigned to the variables cannot be modified
* Rules to create immutable objects
*1. Don't write setters for all the fields .(make all fields private)
*2. write all arg constructors
*3. make class final
*4. use deep clone for mutable fields
*5. use deep clone for mutable fields in getters.
*6.make all fields final/ optional
** */

public class Driver {
    public static void main(String[] args) {
        Address address =new Address(19,"GulabPath","Pune",411028);
        Employee employee =new Employee(100101,15000,"Moin",address);

        System.out.println(employee);

//        here we cannot set the fields of employee and address class so these classes are immutable
//        employee.setId(4449);
//        address.setCity("Hadapsar");

        System.out.println("\n"+employee);

    }
}
