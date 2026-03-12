package main;

import controller.ShapeController;
import dto.ShapeDTO;
import java.util.Scanner;
import utils.Validation;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=====Calculator Shape Program=====");

        double width, length, radius, a, b, c;

        while (true) {
            try {
                System.out.print("Please input side width of Rectangle: ");
                width = Validation.checkPositive(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Please input length of Rectangle: ");
                length = Validation.checkPositive(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Please input radius of Circle: ");
                radius = Validation.checkPositive(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Please input side A of Triangle: ");
                a = Validation.checkPositive(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Please input side B of Triangle: ");
                b = Validation.checkPositive(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Please input side C of Triangle: ");
                c = Validation.checkPositive(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        ShapeDTO dto = new ShapeDTO(width, length, radius, a, b, c);

        ShapeController controller = new ShapeController();

        controller.process(dto);
    }
}
