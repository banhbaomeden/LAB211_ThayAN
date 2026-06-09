package main;

import constant.Message;
import controller.StudentController;
import dto.StudentDTO;
import java.util.Scanner;
import utils.Validation;

public class Main {

    public static void main(String[] args) {

        // Scanner chỉ dùng tại Main
        Scanner sc = new Scanner(System.in);

        // Controller xử lý nghiệp vụ
        StudentController controller = new StudentController();

        System.out.println(Message.PROGRAM_TITLE);

        // Nhập danh sách sinh viên
        while (true) {

            System.out.println(Message.INPUT_STUDENT);

            String name;

            // Nhập Name
            while (true) {
                try {

                    System.out.print(Message.ENTER_NAME);

                    name = Validation.checkName(
                            sc.nextLine());

                    break;

                } catch (Exception e) {

                    System.out.println(
                            e.getMessage());
                }
            }

            String classes;

            // Nhập Class
            while (true) {
                try {

                    System.out.print(
                            Message.ENTER_CLASS);

                    classes = Validation.checkClass(
                            sc.nextLine());

                    break;

                } catch (Exception e) {

                    System.out.println(
                            e.getMessage());
                }
            }

            float mark;

            // Nhập Mark
            while (true) {
                try {

                    System.out.print(
                            Message.ENTER_MARK);

                    mark = Validation.checkInput(
                            sc.nextLine(),
                            0,
                            100);

                    break;

                } catch (Exception e) {

                    System.out.println(
                            e.getMessage());
                }
            }

            // Tạo DTO
            StudentDTO dto = new StudentDTO(
                    name,
                    classes,
                    mark);

            // Gửi sang Controller
            controller.addStudent(dto);

            boolean cont;

            // Hỏi tiếp tục hay không
            while (true) {
                try {

                    System.out.print(
                            Message.CONTINUE);

                    cont = Validation.checkYN(
                            sc.nextLine());

                    break;

                } catch (Exception e) {

                    System.out.println(
                            e.getMessage());
                }
            }

            // Nếu chọn N thì dừng nhập
            if (!cont) {
                break;
            }
        }

        // Hiển thị kết quả
        controller.displayAll();
    }
}