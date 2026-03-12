package dto;

public class ResponseDTO {

    private String name;
    private String address;
    private double salary;

    public ResponseDTO(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getFormattedInfo() {
        return "Name: " + name +
               "\nAddress: " + address +
               "\nSalary: " + salary;
    }
}