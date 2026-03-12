package repository;

import dto.StudentDTO;
import dto.StudentResponseDTO;
import java.util.ArrayList;
import java.util.List;
import model.Student;

public class StudentRepository {

    private List<Student> studentList = new ArrayList<>();

    public void addStudent(StudentDTO dto) {

        Student student = new Student(dto.getName(),
                dto.getClasses(), dto.getMark());

        studentList.add(student);
    }

    public List<StudentResponseDTO> getAll() {

        List<StudentResponseDTO> responseList = new ArrayList<>();

        for (Student s : studentList) {
            responseList.add(
                new StudentResponseDTO(
                        s.getName(),
                        s.getClasses(),
                        s.getMark()
                )
            );
        }

        return responseList;
    }
}