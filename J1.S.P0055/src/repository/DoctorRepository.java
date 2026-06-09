package repository;

import dto.DoctorDTO;
import dto.ResponseDTO;
import java.util.HashMap;
import java.util.Map;
import model.Doctor;

public class DoctorRepository {

    private HashMap<String, Doctor> doctorMap = new HashMap<>();

    // Thêm Doctor mới vào HashMap
    public boolean addDoctor(DoctorDTO dto) {

        // Kiểm tra code đã tồn tại hay chưa
        if (doctorMap.containsKey(dto.getCode())) {
            return false;
        }
        //Chuyển dữ liệu từ DTO sang Model
        Doctor doctor = new Doctor(
                dto.getCode(),
                dto.getName(),
                dto.getSpecialization(),
                dto.getAvailability()
        );
        //Thêm Doctor vào HashMap
        doctorMap.put(dto.getCode(), doctor);
        return true;
    }

    // Cập nhật thông tin Doctor
    public boolean updateDoctor(DoctorDTO dto) {
        //Nếu code không tồn tại
        if (!doctorMap.containsKey(dto.getCode())) {
            return false;
        }
        //Lấy Doctor từ HashMap theo code
        Doctor doctor = doctorMap.get(dto.getCode());

        doctor.setName(dto.getName());
        doctor.setSpecialization(dto.getSpecialization());
        doctor.setAvailability(dto.getAvailability());

        return true;
    }

    // Xóa Doctor theo code
    public boolean deleteDoctor(String code) {
        //Nếu code không tồn tại
        if (!doctorMap.containsKey(code)) {
            return false;
        }
        //Xóa Doctor khỏi HashMap
        doctorMap.remove(code);
        return true;
    }

    // Tìm kiếm Doctor theo code, name hoặc specialization
    public HashMap<String, ResponseDTO> searchDoctor(String text) {
        //tạo danh sách lưu kết quả tìm kiếm
        HashMap<String, ResponseDTO> result = new HashMap<>();
        //duyệt toàn bộ Doctor trong HashMap
        for (Map.Entry<String, Doctor> entry : doctorMap.entrySet()) {
            //Lấy Doctor hiện tại
            Doctor d = entry.getValue();
            if (text == null || text.trim().isEmpty()) {
                return result;
            }
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
