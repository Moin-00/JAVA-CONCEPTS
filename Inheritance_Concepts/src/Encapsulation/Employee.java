package Encapsulation;
/*
getter setter are used to set of get the value of a
field within a class using constructor even if the access of
level of that field is private.
 */

public class Employee {
    private String name;
    private String  company;
    private int id;
    private int age;
    private int salary;
    public Employee(String name, String company, int age, int id){
        this.name=name;
        this.company=company;
        this.age=age;
        this.id=id;

    }
    public Employee(String name, String company, int age, int id, int salary){
        this.name=name;
        this.company=company;
        this.age=age;
        this.id=id;
        if (salary>10000){
            this.salary=salary;
        }
        else{
            this.salary=30000;
        }


    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Constructor Fields{"+"\nName="+name+"\nCompany="+company+"\nAge="+age+"\nId="+id+"\nSalary="+salary+"}\n"+super.toString();
    }
}
