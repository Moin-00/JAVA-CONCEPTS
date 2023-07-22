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
//        this.address = new Address(address.getLineNum(),address.getStreetName(),address.getCity()
//                ,address.getPinCode());// this.address = 6000h
//        //this line creates a new object of Address and hence the receiving param 'address'
//        //and field 'address' has different objects' address.
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
//    for deep clone
//        return address;//1000h
//        return new Address(address.getLineNum(),address.getStreetName(),address.getCity(),address.getPinCode());//2000h

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
