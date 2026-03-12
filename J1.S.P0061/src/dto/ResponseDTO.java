package dto;

public class ResponseDTO {

    private String type;
    private String info;
    private double area;
    private double perimeter;

    public ResponseDTO(String type, String info, double area, double perimeter) {
        this.type = type;
        this.info = info;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String format() {
        return "-----" + type + "-----\n"
                + info + "\n"
                + "Area: " + area + "\n"
                + "Perimeter: " + perimeter;
    }
}