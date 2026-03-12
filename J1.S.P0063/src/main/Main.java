package main;

import java.util.Scanner;
import controller.PersonController;
import dto.PersonDTO;
import utils.CheckInput;

public class Main {

    public static void main(String[] args) {

        // Scanner chỉ được dùng ở đây
        Scanner sc = new Scanner(System.in);

        // Khởi tạo các thành phần
        PersonController controller = new PersonController();

        System.out.println("===== Management Person Program =====");
        // Nhập 3 người (có thể thay đổi nếu đề yêu cầu)
        for (int i = 0; i < 3; i++) {
            System.out.println("Input Information of Person");
            String name;
            while (true) {
                try {
                    System.out.print("Please input name: ");
                    name = CheckInput.checkString(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            String address;
            while (true) {
                try {
                    System.out.print("Please input address: ");
                    address = CheckInput.checkString(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            double salary;
            while (true) {
                try {
                    System.out.print("Please input salary: ");
                    salary = CheckInput.checkInput(sc.nextLine(), 0, Double.MAX_VALUE);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            PersonDTO dto = new PersonDTO(name, address, salary);
            controller.addPerson(dto);
        }

        // Hiển thị kết quả
        controller.displayAll();
    }
}
