package controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import dto.StudentDTO;
import dto.StudentResponseDTO;
import repository.StudentRepository;
import view.StudentView;

public class StudentController {

    private StudentRepository repository = new StudentRepository();
    private StudentView view = new StudentView();
    
    //Thêm sinh viên
    public void addStudent(StudentDTO dto) {
        repository.addStudent(dto);
    }
    
    //Hiển thị toàn bộ danh sách sinh viên
    public void displayAll() {
        //Lấy danh sách từ Repository
        List<StudentResponseDTO> list = repository.getAll();
        //Sắp xếp danh sách theo tên tăng dần
        Collections.sort(list, Comparator.comparing(StudentResponseDTO::getName));
        //Truyền danh sách sang View
        view.setList(list);
        //Hiển thị danh sách
        view.displayStudents();
    }
}