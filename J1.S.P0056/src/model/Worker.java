package model;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String id;
    private String name;
    private int age;
    private int salary;
    private String workLocation;
    private List<SalaryHistory> historySalary;

    public Worker(String id, String name, int age, int salary, String workLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        this.historySalary = new ArrayList<>();
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
    
    public List<SalaryHistory> getHistorySalary() {
        return historySalary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}