package dto;

import java.util.Date;
import constants.SalaryStatus;
import java.text.SimpleDateFormat;

public class ResponseDTO {

    private String code;
    private String name;
    private int age;
    private int salary;
    private SalaryStatus status;
    private Date date;

    public ResponseDTO(String code, String name, int age,
                       int salary, SalaryStatus status, Date date) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
        this.date = date;
    }

    public String getCode() {
        return code;
    }
    
    

    public String format() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        return code + "\t"
                + name + "\t"
                + age + "\t"
                + salary + "\t"
                + status + "\t"
                + sdf.format(date);
    }
}