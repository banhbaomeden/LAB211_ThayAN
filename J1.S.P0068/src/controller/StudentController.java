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

    public void addStudent(StudentDTO dto) {
        repository.addStudent(dto);
    }

    public void displayAll() {

        List<StudentResponseDTO> list = repository.getAll();

        Collections.sort(list, Comparator.comparing(StudentResponseDTO::getName));

        view.setList(list);
        view.displayStudents();
    }
}