package main;

import constant.Message;
import controller.PersonController;
import dto.PersonDTO;
import java.util.Scanner;
import utils.CheckInput;

public class Main {

    public static void main(String[] args) {

        // Scanner chỉ được dùng ở Main
        Scanner sc = new Scanner(System.in);

        // Controller xử lý nghiệp vụ
        PersonController controller = new PersonController();

        System.out.println(Message.PROGRAM_TITLE);

        // Nhập nhiều người cho đến khi chọn N
        while (true) {

            System.out.println(Message.INPUT_PERSON);

            String name;

            while (true) {
                try {

                    System.out.print(Message.ENTER_NAME);

                    name = CheckInput.checkString(
                            sc.nextLine());

                    break;

                } catch (Exception e) {

                    System.out.println(
                            e.getMessage());
                }
            }

            String address;

            while (true) {
                try {

                    System.out.print(
                            Message.ENTER_ADDRESS);

                    address = CheckInput.checkString(
                            sc.nextLine());

                    break;

                } catch (Exception e) {

                    System.out.println(
                            e.getMessage());
                }
            }

            double salary;

            while (true) {
                try {

                    System.out.print(
                            Message.ENTER_SALARY);

                    salary = CheckInput.checkInput(
                            sc.nextLine(),
                            0,
                            Double.MAX_VALUE);

                    break;

                } catch (Exception e) {

                    System.out.println(
                            e.getMessage());
                }
            }

            // Tạo DTO
            PersonDTO dto = new PersonDTO(
                    name,
                    address,
                    salary);

            // Gửi sang Controller
            controller.addPerson(dto);

            // Hỏi tiếp tục hay không
            System.out.print(Message.CONTINUE);

            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("N")) {
                break;
            }
        }

        // Hiển thị danh sách đã sắp xếp
        controller.displayAll();
    }
}