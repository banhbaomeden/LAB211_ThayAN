package main;

import constants.SalaryStatus;
import controller.WorkerController;
import dto.WorkerDTO;
import java.util.Scanner;
import utils.Validation;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WorkerController controller = new WorkerController();

        while (true) {

            displayMenu();

            int choice;

            while (true) {
                try {
                    System.out.print("Enter your choice: ");
                    choice = Validation.checkInputIntLimit(sc.nextLine(), 1, 5);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            switch (choice) {

                case 1:
                    addWorker(sc, controller);
                    break;

                case 2:
                    changeSalary(SalaryStatus.UP, sc, controller);
                    break;

                case 3:
                    changeSalary(SalaryStatus.DOWN, sc, controller);
                    break;

                case 4:
                    controller.displaySalaryHistory();
                    break;

                case 5:
                    return;
            }
        }
    }

    static void addWorker(Scanner sc, WorkerController controller) {

        System.out.println("--------- Add Worker ----------");

        // ===== CODE =====
        String id;
        while (true) {
            System.out.print("Enter Code: ");
            id = Validation.inputCode(sc.nextLine());

            if (id != null) {
                if (controller.isCodeExist(id)) {
                    System.out.println("Code already exists!");
                } else {
                    break;
                }
            }
        }

        // ===== NAME =====
        String name;
        while (true) {
            System.out.print("Enter Name: ");
            name = Validation.inputString(sc.nextLine(), "Name cannot be empty");

            if (name != null) {
                break;
            }
        }

        // ===== AGE =====
        int age;

        while (true) {
            System.out.print("Enter Age: ");
            age = Validation.checkAge(sc.nextLine());

            if (age != -1) {
                break;
            }
        }

        // ===== SALARY =====
        int salary;
        while (true) {
            try {
                System.out.print("Enter Salary: ");
                salary = Validation.checkSalary(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // ===== LOCATION =====
        String location;
        while (true) {
            System.out.print("Enter Work Location: ");
            location = Validation.inputString(sc.nextLine(), "Work location cannot be empty");

            if (location != null) {
                break;
            }
        }

        // ===== CALL CONTROLLER =====
        controller.addWorker(new WorkerDTO(id, name, age, salary, location));
    }

    static void changeSalary(SalaryStatus status, Scanner sc, WorkerController controller) {

        System.out.println("------- Up/Down Salary --------");

        System.out.print("Enter Code: ");
        String code = Validation.inputCode(sc.nextLine());

        System.out.print("Enter Amount: ");
        int amount = Validation.checkSalary(sc.nextLine());
        
        controller.changeSalary(code, amount, status);
    }

    private static void displayMenu() {
        System.out.println("======== Worker Management =========");
        System.out.println("1. Add Worker");
        System.out.println("2. Up salary");
        System.out.println("3. Down salary");
        System.out.println("4. Display Information salary");
        System.out.println("5. Exit");
    }
}
