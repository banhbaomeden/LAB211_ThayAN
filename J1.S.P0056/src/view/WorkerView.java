package view;

import dto.ResponseDTO;
import java.util.List;

public class WorkerView {
    private List<ResponseDTO> list;
    
    public void setList(List<ResponseDTO> list) {
        this.list = list;
    }

    public void displayHistory() {

        System.out.println("-------- Display Information Salary --------");
        System.out.println("Code\tName\tAge\tSalary\tStatus\tDate");

        for (ResponseDTO r : list) {
            System.out.println(r.format());
        }
    }

    public void displayMessage(String msg) {
        System.out.println(msg);
    }
    
}