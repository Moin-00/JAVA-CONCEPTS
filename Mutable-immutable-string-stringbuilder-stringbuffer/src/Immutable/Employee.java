package Immutable;
public final class Employee {
    int id;
    int salary;
    String Name;
    Address address;
    public Employee(int id, int salary, String name, Address address) {
        this.id = id;
        this.salary = salary;
        this.Name = name;
        this.address = new Address(address.getLineNum(), address.getStreetName(), address.getCity(), address.getPinCode());
    }
    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return Name;
    }
    public Address getAddress() {
        return address;
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
