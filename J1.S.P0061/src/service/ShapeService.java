package service;

import dto.ResponseDTO;
import dto.ShapeDTO;
import java.util.ArrayList;
import java.util.List;

public class ShapeService {

    public List<ResponseDTO> calculate(ShapeDTO dto) {

        List<ResponseDTO> list = new ArrayList<>();

        // Rectangle
        double rectArea = dto.getWidth() * dto.getLength();
        double rectPerimeter = 2 * (dto.getWidth() + dto.getLength());

        list.add(new ResponseDTO(
                "Rectangle",
                "Width: " + dto.getWidth() + "\nLength: " + dto.getLength(),
                rectArea,
                rectPerimeter
        ));

        // Circle
        double circleArea = Math.PI * dto.getRadius() * dto.getRadius();
        double circlePerimeter = 2 * Math.PI * dto.getRadius();

        list.add(new ResponseDTO(
                "Circle",
                "Radius: " + dto.getRadius(),
                circleArea,
                circlePerimeter
        ));

        // Triangle
        double p = dto.getA() + dto.getB() + dto.getC();
        double s = p / 2;

        double triangleArea = Math.sqrt(
                s * (s - dto.getA()) * (s - dto.getB()) * (s - dto.getC())
        );

        list.add(new ResponseDTO(
                "Triangle",
                "Side A: " + dto.getA()
                + "\nSide B: " + dto.getB()
                + "\nSide C: " + dto.getC(),
                triangleArea,
                p
        ));

        return list;
    }
}