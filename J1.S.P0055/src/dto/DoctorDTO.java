package dto;

public class DoctorDTO {

    private String code;
    private String name;
    private String specialization;
    private int availability;

    public DoctorDTO(String code, String name,
            String specialization, int availability) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getAvailability() {
        return availability;
    }
}
