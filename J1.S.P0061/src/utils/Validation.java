package utils;

public class Validation {

    public static double checkPositive(String input) {

        try {

            double value = Double.parseDouble(input.trim());

            if (value <= 0) {
                throw new IllegalArgumentException("Value must be greater than 0");
            }

            return value;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Must be a number");
        }
    }
}