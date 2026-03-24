package utils;

public class Validation {

    // ===== CODE =====
    public static String inputCode(String input) {

        if (input == null || input.trim().isEmpty()) {
            System.out.println("Code cannot be empty.");
            return null;
        }

        input = input.trim();

        if (!input.matches("[a-zA-Z0-9 ]+")) {
            System.out.println("Code must not contain special characters.");
            return null;
        }

        return input;
    }

    // ===== STRING =====
    public static String inputString(String input, String msg) {

        if (input == null || input.trim().isEmpty()) {
            System.out.println(msg);
            return null;
        }

        input = input.trim();

        if (!input.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid value.");
            return null;
        }

        return input;
    }

    // ===== AGE =====
    public static int checkAge(String input) {

        try {
            int age = Integer.parseInt(input.trim());

            if (age < 18 || age > 50) {
                System.out.println("Age must be between 18 and 50");
                return -1;
            }

            return age;

        } catch (NumberFormatException e) {
            System.out.println("Age must be a number");
            return -1;
        }
    }

    // ===== SALARY =====
    public static int checkSalary(String input) {

        try {
            int salary = Integer.parseInt(input.trim());

            if (salary <= 0) {
                System.out.println("Salary must be greater than 0");
                return -1;
            }

            return salary;

        } catch (NumberFormatException e) {
            System.out.println("Salary must be a number");
            return -1;
        }
    }

    // ===== MENU =====
    public static int checkInputIntLimit(String input, int min, int max) {

        try {
            int result = Integer.parseInt(input.trim());

            if (result < min || result > max) {
                System.out.println("Please enter number from " + min + " to " + max);
                return -1;
            }

            return result;

        } catch (NumberFormatException e) {
            System.out.println("Please enter a number");
            return -1;
        }
    }
}