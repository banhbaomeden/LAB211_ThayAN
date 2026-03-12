package repository;

import dto.DoctorDTO;
import dto.ResponseDTO;
import java.util.HashMap;
import java.util.Map;
import model.Doctor;

public class DoctorRepository {

    private HashMap<String, Doctor> doctorMap = new HashMap<>();

    // Add Doctor
    public boolean addDoctor(DoctorDTO dto) {

        // check duplicate code
        if (doctorMap.containsKey(dto.getCode())) {
            return false;
        }
        //Mapping Doctor qua DTO
        Doctor doctor = new Doctor(
                dto.getCode(),
                dto.getName(),
                dto.getSpecialization(),
                dto.getAvailability()
        );

        doctorMap.put(dto.getCode(), doctor);
        return true;
    }

    // Update Doctor
    public boolean updateDoctor(DoctorDTO dto) {

        if (!doctorMap.containsKey(dto.getCode())) {
            return false;
        }

        Doctor doctor = doctorMap.get(dto.getCode());

        doctor.setName(dto.getName());
        doctor.setSpecialization(dto.getSpecialization());
        doctor.setAvailability(dto.getAvailability());

        return true;
    }

    // Delete Doctor
    public boolean deleteDoctor(String code) {

        if (!doctorMap.containsKey(code)) {
            return false;
        }

        doctorMap.remove(code);
        return true;
    }

    // Search Doctor
    public HashMap<String, ResponseDTO> searchDoctor(String text) {
        //tạo danh sách kết quả
        HashMap<String, ResponseDTO> result = new HashMap<>();
        //duyệt từng Doctor
        for (Map.Entry<String, Doctor> entry : doctorMap.entrySet()) {

            Doctor d = entry.getValue();
            //kiểm tra điều kiện của text
            if (d.getName().toLowerCase().contains(text.toLowerCase())
                    || d.getCode().toLowerCase().contains(text.toLowerCase())
                    || d.getSpecialization().toLowerCase().contains(text.toLowerCase())) {
                //Mapping Model qua ResponseDTO và lưu vào result
                result.put(entry.getKey(),
                        new ResponseDTO(
                                d.getCode(),
                                d.getName(),
                                d.getSpecialization(),
                                d.getAvailability()
                        ));
            }
        }
        //trả về kết quả
        return result;
    }

    // Check duplicate code
    public boolean isCodeExist(String code) {
        return doctorMap.containsKey(code);
    }
}
