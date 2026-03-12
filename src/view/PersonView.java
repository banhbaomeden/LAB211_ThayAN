package view;

import java.util.List;
import dto.ResponseDTO;

public class PersonView {

    private List<ResponseDTO> list;

    // Controller sẽ truyền danh sách vào đây
    public void setList(List<ResponseDTO> list) {
        this.list = list;
    }

    public void displayPerson() {
        // Kiểm tra nếu danh sách chưa được truyền vào
        // hoặc danh sách rỗng thì thông báo và dừng lại
        if (list == null || list.isEmpty()) {
            System.out.println("No data available.");
            return;
        }
        // Duyệt qua từng phần tử trong danh sách ResponseDTO
        for (ResponseDTO p : list) {
            System.out.println("Information of Person you have entered:");
            System.out.println(p.getFormattedInfo());
        }
    }

    public void displayMessage(String msg) {
        System.out.println(msg);
    }
}
