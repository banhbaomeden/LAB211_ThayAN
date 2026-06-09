package repository;

import dto.StudentDTO;
import dto.StudentResponseDTO;
import java.util.ArrayList;
import java.util.List;
import model.Student;

public class StudentRepository {
    //Danh sách lưu trữ Student
    private List<Student> studentList = new ArrayList<>();
    //Thêm sinh viên vào danh sách
    public void addStudent(StudentDTO dto) {
        //Mapping dữ liệu từ DTO sang Model
        Student student = new Student(dto.getName(),
                dto.getClasses(), dto.getMark());
        //Thêm Student vào danh sách
        studentList.add(student);
    }
    //Lấy toàn bộ danh sách Student
    public List<StudentResponseDTO> getAll() {
        //Danh sách kết quả trả về cho Controller
        List<StudentResponseDTO> responseList = new ArrayList<>();
        //Duyệt từng Student trong danh sách
        for (Student s : studentList) {
            //Mapping từ Model sang ResponseDTO
            responseList.add(
                new StudentResponseDTO(
                        s.getName(),
                        s.getClasses(),
                        s.getMark()
                )
            );
        }
        //Tra về danh sách kết quả
        return responseList;
    }
}