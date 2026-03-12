package main;

import controller.DoctorController;
import dto.DoctorDTO;
import java.util.Scanner;
import validate.Validation;

public class Main {

    public static final Scanner sc = new Scanner(System.in);
    public static final DoctorController controller = new DoctorController();

    public static void main(String[] args) {

        while (true) {

            displayMenu();

            System.out.print("Enter your choice: ");
            int choice = Validation.checkInputIntLimit(sc.nextLine(), 1, 5);

            switch (choice) {

                case 1:
                    addDoctor();
                    break;

                case 2:
                    updateDoctor();
                    break;

                case 3:
                    deleteDoctor();
                    break;

                case 4:
                    searchDoctor();
                    break;

                case 5:
                    System.out.println("Exit program");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void displayMenu() {

        System.out.println("========= Doctor Management =========");
        System.out.println("1. Add Doctor");
        System.out.println("2. Update Doctor");
        System.out.println("3. Delete Doctor");
        System.out.println("4. Search Doctor");
        System.out.println("5. Exit");
    }

    // ================= ADD DOCTOR =================
    private static void addDoctor() {

        System.out.println("--------- Add Doctor ----------");

        String code;

        while (true) {
            System.out.print("Enter Code: ");
            code = Validation.inputCode(sc.nextLine());

            if (code != null) {

                if (controller.isCodeExist(code)) {
                    System.out.println("Code already exists!");
                } else {
                    break;
                }
            }
        }

        String name;

        while (true) {
            System.out.print("Enter Name: ");
            name = Validation.inputString(sc.nextLine(), "Name cannot be empty");

            if (name != null) {
                break;
            }
        }

        String sp;

        while (true) {
            System.out.print("Enter Specialization: ");
            sp = Validation.inputString(sc.nextLine(), "Specialization cannot be empty");

            if (sp != null) {
                break;
            }
        }

        Integer av;

        while (true) {
            System.out.print("Enter Availability: ");
            av = Validation.inputAvailability(sc.nextLine());

            if (av != null) {
                break;
            }
        }

        controller.addDoctor(new DoctorDTO(code, name, sp, av));
    }

    // ================= UPDATE DOCTOR =================
    private static void updateDoctor() {

        System.out.println("--------- Update Doctor -------");

        System.out.print("Enter Code: ");
        String code = Validation.inputCode(sc.nextLine());
        if (code == null) {
            return;
        }

        if (!controller.isCodeExist(code)) {
            System.out.println("Code not found");
            return;
        }

        System.out.print("Enter Name: ");
        String name = Validation.inputString(sc.nextLine(), "Name cannot be empty");
        if (name == null) {
            return;
        }

        System.out.print("Enter Specialization: ");
        String sp = Validation.inputString(sc.nextLine(), "Specialization cannot be empty");
        if (sp == null) {
            return;
        }

        System.out.print("Enter Availability: ");
        Integer av = Validation.inputAvailability(sc.nextLine());
        if (av == null) {
            return;
        }

        controller.updateDoctor(new DoctorDTO(code, name, sp, av));
    }

    // ================= DELETE DOCTOR =================
    private static void deleteDoctor() {

        System.out.println("--------- Delete Doctor -------");

        System.out.print("Enter Code: ");
        String code = Validation.inputCode(sc.nextLine());
        if (code == null) {
            return;
        }

        if (!controller.isCodeExist(code)) {
            System.out.println("Code not found");
            return;
        }

        controller.deleteDoctor(code);
    }

    // ================= SEARCH DOCTOR =================
    private static void searchDoctor() {

        System.out.println("---------- Search Doctor --------");

        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println("--------- Result -----------");
        controller.searchDoctor(text);
    }
}
