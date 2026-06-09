package controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import dto.PersonDTO;
import dto.ResponseDTO;
import repository.PersonRepository;
import view.PersonView;

public class PersonController {
    //tạo đối tượng repository để xử lý lưu trữ/lấy dữ liệu
    private PersonRepository repository = new PersonRepository();
    //tạo đối tượng view để hiển thị ra màn hình
    private PersonView view = new PersonView();

    //hàm thêm một người mới
    public void addPerson(PersonDTO dto) {
        //gọi repository để thêm đối tượng dto vào danh sách
        repository.addPerson(dto);
    }

    //hàm hiển thị toàn bộ danh sách
    public void displayAll() {
        //Lấy toàn bộ dữ liệu từ repository
        List<ResponseDTO> list = repository.getAll();
        //Sắp xếp danh sách tăng dần theo salary
        Collections.sort(list, Comparator.comparingDouble(ResponseDTO::getSalary));
        //truyền danh sách đã sắp xếp sang view
        view.setList(list);  
        //hiển thị danh sách
        view.displayPerson();      
    }
}
