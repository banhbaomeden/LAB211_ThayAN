package repository;

import dto.PersonDTO;
import dto.ResponseDTO;
import java.util.ArrayList;
import java.util.List;
import model.Person;

public class PersonRepository {
    //tạo danh sách lưu trữ các đối tượng person
    private List<Person> personList = new ArrayList<>();
    
    //hàm thêm một person mới vào danh sách
    public void addPerson(PersonDTO dto) {
        //chuyển dữ liệu từ DTO sang model
        Person person = new Person(
                dto.getName(),
                dto.getAddress(),
                dto.getSalary()
        );
        //thêm dối tượng person vào danh sách
        personList.add(person);
    }
    
    //hàm lấy toàn bộ dữ liệu
    public List<ResponseDTO> getAll() {
        //tạo danh sách trả về
        List<ResponseDTO> responseList = new ArrayList<>();
        //duyệt từng phần tử trong personList
        for (Person p : personList) {
            //chuyển dữ liệu từ model sang responseDTO
            responseList.add(
                new ResponseDTO(
                    p.getName(),
                    p.getAddress(),
                    p.getSalary()
                )
            );
        }
        //trả danh sách kết quả
        return responseList;
    }
}