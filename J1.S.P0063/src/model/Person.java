package model;

/**
 *
 * @author Acer
 */
public class Person {

    private String name;
    private String address;
    private double salary;

    // khoi tao contructer 2 lan : 1 lan khong co gi va 1 lan day du.
    public Person() {
    }

    public Person(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    // alt ins
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Address: " + address + "\n" + "Salary:" + salary + "\n";
    }

}
