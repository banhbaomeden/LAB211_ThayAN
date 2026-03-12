package validate;

public class Validation {

    public static String inputCode(String input) {

        if (input == null || input.trim().isEmpty()) {
            System.out.println("Code cannot be empty.");
            return null;
        }

        if (!input.matches("[a-zA-Z0-9 ]+")) {
            System.out.println("Code must not contain special characters.");
            return null;
        }

        return input;
    }

    public static String inputString(String input, String msg) {

        if (input == null || input.trim().isEmpty()) {
            System.out.println(msg);
            return null;
        }

        if (!input.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid value.");
            return null;
        }

        return input;
    }

    public static Integer inputAvailability(String input) {

        try {

            int n = Integer.parseInt(input);

            if (n < 0) {
                System.out.println("Availability must be >= 0");
                return null;
            }

            return n;

        } catch (NumberFormatException e) {
            System.out.println("Availability must be number");
            return null;
        }
    }

    public static int checkInputIntLimit(String input, int min, int max) {

        try {

            int result = Integer.parseInt(input);

            if (result >= min && result <= max) {
                return result;
            }

        } catch (NumberFormatException e) {
        }

        System.out.println("Please enter number from " + min + " to " + max);
        return -1;
    }
}