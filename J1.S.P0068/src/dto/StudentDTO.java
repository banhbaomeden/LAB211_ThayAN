package dto;

public class StudentDTO {

    private String name;
    private String classes;
    private float mark;

    public StudentDTO(String name, String classes, float mark) {
        this.name = name;
        this.classes = classes;
        this.mark = mark;
    }

    public String getName() { return name; }
    public String getClasses() { return classes; }
    public float getMark() { return mark; }
}