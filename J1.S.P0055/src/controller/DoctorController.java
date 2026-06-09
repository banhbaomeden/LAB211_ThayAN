package controller;

import dto.DoctorDTO;
import dto.ResponseDTO;
import java.util.HashMap;
import repository.DoctorRepository;
import view.DoctorView;

public class DoctorController {
    //Repository dùng để thao tác dữ liệu Doctor
    private DoctorRepository repository = new DoctorRepository();
    //View dùng để hiển thị dữ liệu ra màn hình
    private DoctorView view = new DoctorView();

    // Thêm bác sĩ mới
    public void addDoctor(DoctorDTO dto) {
        //Gọi repository để thêm Doctor
        boolean result = repository.addDoctor(dto);
        //Nếu thêm thành công
        if (result) {
            //Hiển thị thông báo thành công
            view.printMessage(constant.Message.ADD_SUCCESS);
        } else {
            //Nếu code đã tồn tại
            view.printMessage(constant.Message.CODE_ALREADY_EXISTS);
        }
    }

    // Cập nhật thông tin bác sĩ
    public void updateDoctor(DoctorDTO dto) {
        //Gọi repository để cập nhật
        boolean result = repository.updateDoctor(dto);
        //Nếu cập nhật thành công
        if (result) {
            //Hiển thị thông báo thành công
            view.printMessage(constant.Message.UPDATE_SUCCESS);
        } else {
            //Nếu không tìm thấy code
            view.printMessage(constant.Message.CODE_NOT_EXIST);
        }
    }

    // Xóa bác sĩ theo mã code
    public void deleteDoctor(String code) {
        //Gọi repository để xóa
        boolean result = repository.deleteDoctor(code);
        //Nếu xóa thành công
        if (result) {
            //Hiển thị thông báo thành công
            view.printMessage(constant.Message.DELETE_SUCCESS);
        } else {
            //Nếu code không tồn tại
            view.printMessage(constant.Message.CODE_NOT_EXIST);
        }
    }

    // Tìm kiếm bác sĩ theo code, name hoặc specialization
    public void searchDoctor(String text) {
        //Lấy danh sách kết quả từ repository
        HashMap<String, ResponseDTO> result = repository.searchDoctor(text);
        //Nếu không tìm thấy kết quả nào
        if (result.isEmpty()) {
            //Hiển thị thông báo không tìm thấy
            view.printMessage(constant.Message.NO_DOCTOR_FOUND);
        } else {
            //Truyền danh sách kết quả sang View
            view.setList(result);
            //Hiển thị danh sách kết quả tìm kiếm
            view.displaySearch();
        }
    }

    // Kiểm tra code đã tồn tại hay chưa
    public boolean isCodeExist(String code) {
        //Trả về true nếu code tồn tại
        //Trả về false nếu code chưa tồn tại
        return repository.isCodeExist(code);
    }
}
