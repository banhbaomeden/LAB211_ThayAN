package dto;

public class StudentResponseDTO {

    private String name;
    private String classes;
    private float mark;

    public StudentResponseDTO(String name, String classes, float mark) {
        this.name = name;
        this.classes = classes;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public float getMark() {
        return mark;
    }

    public String format() {
        return "Name: " + name +
               "\nClasses: " + classes +
               "\nMark: " + mark;
    }
}