package view;

import constant.Message;
import dto.ResponseDTO;
import java.util.List;

public class PersonView {

    // Danh sách dữ liệu nhận từ Controller
    private List<ResponseDTO> list;

    // Controller truyền dữ liệu sang View
    public void setList(List<ResponseDTO> list) {
        this.list = list;
    }

    // Hiển thị danh sách Person
    public void displayPerson() {

        // Kiểm tra danh sách rỗng
        if (list == null || list.isEmpty()) {

            System.out.println(Message.LIST_EMPTY);
            return;
        }

        // In tiêu đề
        System.out.println(Message.PERSON_INFO);

        // Duyệt từng Person trong danh sách
        for (ResponseDTO p : list) {

            System.out.println(
                    p.getFormattedInfo());
        }
    }

    // Hiển thị thông báo
    public void displayMessage(String msg) {

        System.out.println(msg);
    }
}