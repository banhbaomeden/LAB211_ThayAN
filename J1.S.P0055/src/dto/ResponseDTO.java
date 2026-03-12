package dto;

public class ResponseDTO {

    private String code;
    private String name;
    private String specialization;
    private int availability;

    public ResponseDTO(String code, String name,
            String specialization, int availability) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }

    public String format() {
        return code + "\t" + name + "\t"
                + specialization + "\t" + availability;
    }

    public String getCode() {
        return code;
    }
}
