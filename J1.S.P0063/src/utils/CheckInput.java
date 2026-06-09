package utils;

import constant.Message;

public final class CheckInput {

    private CheckInput() {
    }

    // Kiểm tra salary
    public static double checkInput(
            String input,
            double min,
            double max) {

        try {

            double value = Double.parseDouble(input);

            // Salary phải nằm trong khoảng cho phép
            if (value >= min && value <= max) {

                return value;

            } else {

                throw new IllegalArgumentException(
                        Message.INVALID_SALARY);
            }

        } catch (NumberFormatException e) {

            throw new IllegalArgumentException(
                    Message.SALARY_NUMBER);
        }
    }

    // Kiểm tra Name và Address
    public static String checkString(String input) {

        // Không được để trống
        if (input == null || input.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    Message.EMPTY);
        }

        // Chỉ cho phép chữ và khoảng trắng
        if (!input.matches("[a-zA-Z ]+")) {

            throw new IllegalArgumentException(
                    Message.INVALID_STRING);
        }

        return input.trim();
    }
}