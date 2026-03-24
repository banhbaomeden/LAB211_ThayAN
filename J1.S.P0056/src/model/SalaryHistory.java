package model;

import constants.SalaryStatus;
import java.util.Date;

public class SalaryHistory {
    private int salary;
    private SalaryStatus status;
    private Date date;

    public SalaryHistory(int salary, SalaryStatus status, Date date) {
        this.salary = salary;
        this.status = status;
        this.date = date;
    }

    public int getSalary() {
        return salary;
    }

    public SalaryStatus getStatus() {
        return status;
    }

    public Date getDate() {
        return date;
    }
}