package view;

import constant.Message;
import dto.StudentResponseDTO;
import java.util.List;

public class StudentView {

    // Danh sách dữ liệu nhận từ Controller
    private List<StudentResponseDTO> list;

    // Gán danh sách cho View
    public void setList(List<StudentResponseDTO> list) {
        this.list = list;
    }

    // Hiển thị danh sách sinh viên
    public void displayStudents() {

        // Kiểm tra danh sách rỗng hoặc chưa có dữ liệu
        if (list == null || list.isEmpty()) {
            System.out.println(Message.LIST_EMPTY);
            return;
        }

        // Biến đếm số thứ tự sinh viên
        int i = 0;

        // Duyệt từng sinh viên trong danh sách
        for (StudentResponseDTO stud : list) {

            i++;

            // In tiêu đề sinh viên thứ i
            System.out.println(
                    Message.STUDENT_INFO + i
                    + Message.STUDENT_INFO_END);

            // In thông tin sinh viên
            System.out.println(stud.format());
        }
    }

    // Hiển thị thông báo
    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
