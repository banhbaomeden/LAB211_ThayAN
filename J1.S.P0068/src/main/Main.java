package main;

import java.util.Scanner;
import controller.StudentController;
import dto.StudentDTO;
import utils.Validation;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentController controller = new StudentController();

        System.out.println("====== Collection Sort Program ======");

        while (true) {
            System.out.println("Please input student information");
            String name;
            while (true) {
                try {
                    System.out.print("Name: ");
                    name = Validation.checkName(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            String classes;
            while (true) {
                try {
                    System.out.print("Classes: ");
                    classes = Validation.checkClass(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            float mark;
            while (true) {
                try {
                    System.out.print("Mark: ");
                    mark = Validation.checkInput(sc.nextLine(), 0, 100);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            StudentDTO dto = new StudentDTO(name, classes, mark);
            controller.addStudent(dto);

            boolean cont;
            while (true) {
                try {
                    System.out.print("Do you want to continue (Y/N): ");
                    cont = Validation.checkYN(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            if (!cont) break;
        }

        controller.displayAll();
    }
}