package dto;

public class WorkerDTO {

    private String id;
    private String name;
    private int age;
    private int salary;
    private String workLocation;

    public WorkerDTO(String id, String name, int age, int salary, String workLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }
}