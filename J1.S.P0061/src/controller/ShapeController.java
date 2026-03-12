package controller;

import dto.ResponseDTO;
import dto.ShapeDTO;
import java.util.List;
import service.ShapeService;
import view.ShapeView;

public class ShapeController {

    private ShapeService service = new ShapeService();
    private ShapeView view = new ShapeView();

    public void process(ShapeDTO dto) {

        List<ResponseDTO> list = service.calculate(dto);

        view.display(list);
    }
}