package utils;

public class CheckInput {

    public static double checkInput(String input, double min, double max) {

        try {
            double value = Double.parseDouble(input);

            if (value >= min && value <= max) {
                return value;
            } else {
                throw new IllegalArgumentException("Salary is greater than zero!");
            }

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("You must input digit.");
        }
    }

    public static String checkString(String input) {

        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a non-empty string!");
        }
        
        if (!input.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("You can't input number or special characters!");
        }

        return input.trim();
    }
}