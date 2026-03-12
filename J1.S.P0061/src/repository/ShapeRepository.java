package repository;

import dto.ResponseDTO;
import model.Circle;
import model.Rectangle;
import model.Triangle;

public class ShapeRepository {

    public ResponseDTO rectangleToResponse(Rectangle r, double area, double perimeter) {

        return new ResponseDTO(
                "Rectangle",
                "Width: " + r.getWidth() + "\nLength: " + r.getLength(),
                area,
                perimeter
        );
    }

    public ResponseDTO circleToResponse(Circle c, double area, double perimeter) {

        return new ResponseDTO(
                "Circle",
                "Radius: " + c.getRadius(),
                area,
                perimeter
        );
    }

    public ResponseDTO triangleToResponse(Triangle t, double area, double perimeter) {

        return new ResponseDTO(
                "Triangle",
                "Side A: " + t.getA()
                + "\nSide B: " + t.getB()
                + "\nSide C: " + t.getC(),
                area,
                perimeter
        );
    }
}
