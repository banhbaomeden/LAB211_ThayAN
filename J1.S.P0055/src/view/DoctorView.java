package view;

import dto.ResponseDTO;
import java.util.HashMap;
import java.util.Map;

public class DoctorView {

    public void displaySearch(HashMap<String, ResponseDTO> list) {

        System.out.println("Code\tName\tSpecialization\tAvailability");

        for (Map.Entry<String, ResponseDTO> entry : list.entrySet()) {
            System.out.println(entry.getValue().format());
        }
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}