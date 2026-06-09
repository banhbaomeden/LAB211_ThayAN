package view;

import constant.Message;
import dto.ResponseDTO;
import java.util.HashMap;
import java.util.Map;

public class DoctorView {
    //Lưu danh sách kết quả tìm kiếm nhận từ Controller
    private Map<String, ResponseDTO> list;
    //Setter dùng để Controller truyền dữ liệu sang View
    public void setList(Map<String, ResponseDTO> list) {
        //Gán danh sách nhận được vào thuộc tính của view
        this.list = list;
    }
    
    //Hiển thị danh sách Doctor tìm được
    public void displaySearch() {
        
        System.out.println(Message.DOCTOR_HEADER);
        //Duyệt từng phần tử trong Map
        for (Map.Entry<String, ResponseDTO> entry : list.entrySet()) {
            System.out.println(entry.getValue().format());
        }
    }
    //Hiển thị thông báo bất kì
    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
