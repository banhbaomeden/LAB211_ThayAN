package main;

import constant.Message;
import controller.DoctorController;
import dto.DoctorDTO;
import java.util.Scanner;
import validate.Validation;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DoctorController controller = new DoctorController();

        while (true) {

            System.out.println(Message.MENU_TITLE);
            System.out.println(Message.MENU_ADD);
            System.out.println(Message.MENU_UPDATE);
            System.out.println(Message.MENU_DELETE);
            System.out.println(Message.MENU_SEARCH);
            System.out.println(Message.MENU_EXIT);

            int choice;

            while (true) {

                System.out.print(Message.ENTER_CHOICE);

                choice = Validation.checkInputIntLimit(
                        sc.nextLine(), 1, 5);

                if (choice != -1) {
                    break;
                }
            }

            switch (choice) {

                case 1:
                    System.out.println(Message.ADD_DOCTOR);

                    String code;

                    while (true) {
                        System.out.print(Message.ENTER_CODE);
                        code = Validation.inputCode(sc.nextLine());
                        //Nếu code hợp lệ
                        if (code != null) {
                            //Kiểm tra trùng code
                            if (controller.isCodeExist(code)) {
                                System.out.println(
                                        Message.CODE_ALREADY_EXISTS);
                            } else {
                                //Không trùng thì thoát vòng lặp
                                break;
                            }
                        }
                    }

                    String name;
                    while (true) {
                        System.out.print(Message.ENTER_NAME);
                        name = Validation.inputString(
                                sc.nextLine(),
                                Message.NAME_EMPTY);
                        //Nếu name hợp lệ thì thoát vòng lặp
                        if (name != null) {
                            break;
                        }
                    }

                    String specialization;
                    while (true) {
                        System.out.print(
                                Message.ENTER_SPECIALIZATION);
                        specialization = Validation.inputString(
                                sc.nextLine(),
                                Message.SPECIALIZATION_EMPTY);
                        //Nếu sp hợp lệ thì thoát vòng lặp
                        if (specialization != null) {
                            break;
                        }
                    }

                    int av;

                    while (true) {
                        try {
                            System.out.print(Message.ENTER_AVAILABILITY);
                            av = Validation.inputAvailability(sc.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    controller.addDoctor(
                            new DoctorDTO(
                                    code,
                                    name,
                                    specialization,
                                    av
                            )
                    );
                    break;

                case 2:
                    System.out.println(Message.UPDATE_DOCTOR);

                    System.out.print(Message.ENTER_CODE);
                    code = Validation.inputCode(sc.nextLine());
                    //nếu code không hợp lệ
                    if (code == null) {
                        return;
                    }
                    //Nếu không tìm thấy code
                    if (!controller.isCodeExist(code)) {
                        System.out.println(Message.CODE_NOT_FOUND);
                        return;
                    }

                    while (true) {
                        System.out.print(Message.ENTER_NAME);
                        name = Validation.inputString(
                                sc.nextLine(), Message.NAME_EMPTY);
                        //Nếu name hợp lệ thì thoát vòng lặp
                        if (name != null) {
                            break;
                        }
                    }

                    while (true) {
                        System.out.print(
                                Message.ENTER_SPECIALIZATION);
                        specialization = Validation.inputString(
                                sc.nextLine(), Message.SPECIALIZATION_EMPTY);
                        //Nếu sp hợp lệ thì thoát vòng lặp
                        if (specialization != null) {
                            break;
                        }
                    }

                    while (true) {
                        try {
                            System.out.print(Message.ENTER_AVAILABILITY);
                            av = Validation.inputAvailability(sc.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    controller.updateDoctor(
                            new DoctorDTO(
                                    code,
                                    name,
                                    specialization,
                                    av
                            )
                    );
                    break;

                case 3:
                    System.out.println(Message.DELETE_DOCTOR);

                    System.out.print(Message.ENTER_CODE);

                    code = Validation.inputCode(sc.nextLine());
                    //Nếu code không hợp lệ
                    if (code == null) {
                        return;
                    }
                    //Nếu không tìm thấy code
                    if (!controller.isCodeExist(code)) {
                        System.out.println(Message.CODE_NOT_FOUND);
                        return;
                    }

                    controller.deleteDoctor(code);
                    break;

                case 4:
                    System.out.println(Message.SEARCH_DOCTOR);

                    String text;

                    while (true) {

                        System.out.print(Message.ENTER_TEXT);

                        text = sc.nextLine().trim();

                        if (!text.isEmpty()) {
                            break;
                        }

                        System.out.println(Message.SEARCH_EMPTY);
                    }

                    System.out.println(Message.SEARCH_RESULT);

                    controller.searchDoctor(text);
                    break;

                case 5:
                    System.out.println(Message.EXIT_PROGRAM);
                    return;

                default:
                    System.out.println(Message.INVALID_CHOICE);
            }
        }
    }

}
