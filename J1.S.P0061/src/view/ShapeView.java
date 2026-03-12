package view;

import dto.ResponseDTO;
import java.util.List;

public class ShapeView {

    public void display(List<ResponseDTO> list) {

        for (ResponseDTO r : list) {
            System.out.println(r.format());
        }
    }
}