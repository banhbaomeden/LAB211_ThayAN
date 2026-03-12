package view;

import java.util.List;
import dto.StudentResponseDTO;

public class StudentView {

    private List<StudentResponseDTO> list;

    public void setList(List<StudentResponseDTO> list) {
        this.list = list;
    }

    public void displayStudents() {

        if (list == null || list.isEmpty()) {
            System.out.println("No data available.");
            return;
        }

        int i = 0;
        for (StudentResponseDTO stud : list) {
            i++;
            System.out.println("==============Student " + i + "===============");
            System.out.println(stud.format());
        }
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}