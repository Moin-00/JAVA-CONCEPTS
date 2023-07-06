package Mutable;

public class Employee {
    int id;
    int salary;
    String Name;
    Address address;

    public Employee(int id, int salary, String name, Address address) {
        this.id = id;
        this.salary = salary;
        this.Name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", Name='" + Name + '\'' +
                ", Address='" + "\n"+address + '\'' +
                '}';
    }
}
