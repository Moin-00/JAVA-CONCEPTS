package Encapsulation;


    public class Driver {
        public static void main(String[] args) {
            Employee employee = new Employee("Vikram","Integral Ad Science",27,101);
            employee.setSalary(0);
            System.out.println(employee);
            employee.setSalary(220000);
            System.out.println(employee);
            employee.setName("Moin");
            employee.setCompany("Illuminei");
            employee.setAge(23);
            employee.setId(38);
            employee.setSalary(18000);

//            System.out.println("\n gotname through getter"+employee.getName());
            System.out.println("\n"+employee);
//            employee.salary = 112000;
//
//
//            System.out.println("Salary="+employee.salary);
        }
    }






