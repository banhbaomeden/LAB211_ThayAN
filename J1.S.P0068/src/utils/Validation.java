package utils;

public class Validation {

    // ===== Validate Mark =====
    public static float checkInput(String input, float min, float max) {

        try {
            float value = Float.parseFloat(input);

            if (value >= min && value <= max) {
                return value;
            } else {
                throw new IllegalArgumentException(
                        "Mark must be between " + min + " and " + max + "!");
            }

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Please enter a valid number!");
        }
    }

    // ===== Validate Name (chỉ chữ và khoảng trắng) =====
    public static String checkName(String input) {

        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty!");
        }

        if (!input.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Name must contain only letters!");
        }

        return input.trim();
    }

    // ===== Validate Class (chữ + số, không ký tự đặc biệt) =====
    public static String checkClass(String input) {

        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Class cannot be empty!");
        }

        if (!input.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Class must contain only letters and numbers!");
        }

        return input.trim();
    }

    // ===== Validate Y/N =====
    public static boolean checkYN(String input) {

        if (input.equalsIgnoreCase("Y")) return true;
        if (input.equalsIgnoreCase("N")) return false;

        throw new IllegalArgumentException("Please enter Y or N!");
    }
}